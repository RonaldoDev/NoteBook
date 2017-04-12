/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Framework;

import Config.DiretorioPadrao;
import Entidades.Emprestimo;
import Entidades.Livro;
import Entidades.Usuario;
import Enumeradores.EventoBotao;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Field;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import static java.util.Arrays.stream;
import java.util.stream.Collectors;
import java.util.stream.Stream;
//import javafx.stage.DirectoryChooser;

/**
 *
 * @author Rolando
 */
public class Persistencia {

    private Seguranca segOperaoes;
    private String dePath;

    public Persistencia() {
        this.segOperaoes = new Seguranca();
    }
    private EventoBotao Operacao;

    public EventoBotao getOperacao() {
        return Operacao;
    }

    public void setOperacao(EventoBotao Operacao) {
        this.Operacao = Operacao;
    }

    public ArrayList<Object> ExecutaPersistencia(Object o, EventoBotao evtBotao) {
        this.setOperacao(evtBotao);
        ArrayList<Object> _objRetorno = new ArrayList<>();
        try {
            String _path = "";
            PopulaPath(o);
            int _id = (int) o.getClass().getMethod("getId" + o.getClass().getName().substring(10)).invoke(o);
            switch (evtBotao) {
                case Incluir:
                    _objRetorno.add(this.Gravar(o, _id));
                    break;
                case Alterar:
                    _objRetorno.add(this.Alterar(o, _id));
                    break;
                case Excluir:
                    _objRetorno.add(this.Excluir(_id, false));
                    break;
                case Consultar:
                    _objRetorno.add(this.CarregaArquivo(_id + ".txt"));
                    break;
                case Listar:
                    _objRetorno = this.RetornaLista(o);
                    break;
            }

        } catch (Exception e) {
            e.toString();
        } finally {

        }
        return _objRetorno;
    }

    private Object Gravar(Object o, int p_id) throws FileNotFoundException, IOException, Exception {
        if (!segOperaoes.VerificaAcesso(getOperacao())) {
        } else {
            int _novoId = 0;
            if (p_id > 0) {
                _novoId = p_id;
            } else {
                _novoId = this.RetornaUltimo(dePath) + 1;
            }
            FileOutputStream arquivoGrav = new FileOutputStream(dePath + Integer.toString(_novoId) + ".txt");
            ObjectOutputStream objGravar = new ObjectOutputStream(arquivoGrav);
            SetarId(o, _novoId);
            objGravar.writeObject(o);
            objGravar.flush();
            objGravar.close();
            arquivoGrav.flush();
            arquivoGrav.close();
            return _novoId;
        }
        throw new Exception("Operação não permitida.");
    }

    public void SetarId(Object o, int p_id) {
        if (o.getClass() == Usuario.class) {
            Usuario _u = (Usuario) o;
            _u.setIdUsuario(p_id);
            o = _u;
        } else if (o.getClass() == Livro.class) {
            Livro _u = (Livro) o;
            _u.setIdLivro(p_id);
            o = _u;
        } else if (o.getClass() == Emprestimo.class) {
            Emprestimo _u = (Emprestimo) o;
            _u.setIdEmprestimo(p_id);
            o = _u;
        }
    }

    private boolean Alterar(Object o, int p_id) throws IOException, Exception {
        if (segOperaoes.VerificaAcesso(getOperacao())) {
            this.Excluir(p_id, true);
            this.Gravar(o, p_id);
            return true;
        }
        throw new Exception("Operação não permitida.");
    }

    private boolean Excluir(int p_id, boolean IsAlterar) throws Exception {
        if (segOperaoes.VerificaAcesso(getOperacao()) || IsAlterar) {
            File _file = new File(dePath + p_id + ".txt");
            _file.delete();
            return true;
        }
        throw new Exception("Operação não permitida.");
    }

    private int RetornaUltimo(String dePath) {
        File arquivo = new File(dePath);
        File[] arquivos = arquivo.listFiles();
        int _id = 0;
        if (arquivos.length > 0) {
            Arrays.sort(arquivos, 0, arquivos.length);
            int _ultimo = 0;
            for (File arq : arquivos) {
                if (Integer.parseInt(arq.getName().substring(0, arq.getName().length() - 4)) > _ultimo) {
                    _ultimo = Integer.parseInt(arq.getName().substring(0, arq.getName().length() - 4));
                }
            }
            //   String ultimoArquivo = arquivos[arquivos.length - 1].getName();
            _id = _ultimo;
        }
        return _id;
    }

    public File RetornaSelecionado(int p_id) {
        File arquivo = new File(dePath);
        ArrayList<File> arquivos = new ArrayList<>(Stream.of(arquivo.listFiles()).collect(Collectors.toList()));
        return arquivos.stream()
                .filter((File f)
                        -> Integer.parseInt(f.getName()
                        .substring(0, f.getName().length() - 4)) == p_id)
                .findFirst()
                .orElse(arquivo);
    }

    public ArrayList<Object> RetornaLista(Object oh) throws IOException, FileNotFoundException, ClassNotFoundException {
        File _arquivo = new File(dePath);
        ArrayList<File> _arquivos = new ArrayList<>(Stream.of(_arquivo.listFiles()).collect(Collectors.toList()));
        ArrayList<Object> _objRetorno = new ArrayList<>();
        for (File arq : _arquivos) {
            _objRetorno.add(CarregaArquivo(arq.getName()));
        }
        return _objRetorno;
    }

    private Object CarregaArquivo(String p_nmArquivo) throws FileNotFoundException, IOException, ClassNotFoundException {
        FileInputStream arquivoLeitura = new FileInputStream(dePath + p_nmArquivo);
        ObjectInputStream objLeitura = new ObjectInputStream(arquivoLeitura);
        Object objRetorno = objLeitura.readObject();
        arquivoLeitura.close();
        objLeitura.close();
        return objRetorno;
    }

    private void PopulaPath(Object o) {
        dePath = DiretorioPadrao.getDIRETORIO_PADRAO();
        if (o.getClass() == Usuario.class) {
            dePath += "//Usuario//";
        } else if (o.getClass() == Livro.class) {
            dePath += "//Livro//";
        } else if (o.getClass() == Emprestimo.class) {
            dePath += "//Emprestimo//";
        }
        Path _pasta = Paths.get(dePath);
        boolean success;
        if (!Files.exists(_pasta)) {
            success = (new File(dePath)).mkdirs();
        }
    }

}
