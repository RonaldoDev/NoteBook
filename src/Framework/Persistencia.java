/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Framework;

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
import javafx.stage.DirectoryChooser;

/**
 *
 * @author Rolando
 */
public class Persistencia {
    private Seguranca seg;
    private String dePath = System.getProperty("user.hone");
    public Persistencia ()
    {
        this.seg = new Seguranca();
    }
    private EventoBotao Operacao;

    public EventoBotao getOperacao() {
        return Operacao;
    }

    public void setOperacao(EventoBotao Operacao) {
        this.Operacao = Operacao;
    }
    public ArrayList<Object> ExecutaPersistencia(Object o, EventoBotao evtBotao)
    {
        this.setOperacao(evtBotao);
        ArrayList<Object> _objRetorno = new ArrayList<>();
        try 
        {
            String _path = "";
            PopulaPath(o);
            int _id = (int)o.getClass().getMethod("getId"+o.getClass().getName().substring(10)).invoke(o);
            switch(evtBotao)
            {
                case Incluir:
                    _objRetorno.add(this.Gravar(o, _path));
                    break;
                case Alterar:
                    _objRetorno.add(this.Alterar(o, _id, _path));
                    break;
                case Excluir:
                    _objRetorno.add(this.Excluir(_id, _path, false));
                    break;
                case Consultar:
                    _objRetorno.add(this.RetornaSelecionado(o.getClass().getName(),_id));
                    break;
                case Listar:
                    _objRetorno = this.RetornaLista(o, _path);
                    break;
            }
            
        
        } 
        catch (Exception e) 
        {
            
        }
        finally
        {
            return _objRetorno;
        }
    }
    private Object Gravar(Object o, String p_path) throws IOException, Exception
    {
        return Gravar(o, p_path, 0);
    } 
    private Object Gravar(Object o, String p_path, int p_id) throws FileNotFoundException, IOException, Exception
    {
        
        if(seg.VerificaAcesso(getOperacao()))
        {
        } else {
            int _novoId = 0;
            if(p_id > 0)
            {
                _novoId = p_id;
            }
            else{
                _novoId = this.RetornaUltimo(p_path) + 1;
            }
            FileOutputStream arquivoGrav = new FileOutputStream(dePath+Integer.toString(_novoId) + ".txt");
            ObjectOutputStream objGravar = new ObjectOutputStream(arquivoGrav);
            objGravar.writeObject(o);
            objGravar.flush();
            objGravar.close();
            arquivoGrav.flush();
            arquivoGrav.close();
            o.getClass().getMethod("setId"+o.getClass().getName().substring(10)).invoke(_novoId);
            return true;
        }
        throw new Exception("Operação não permitida.");
    }
    private boolean Alterar(Object o,int p_id, String p_path) throws IOException, Exception
    {
        if(seg.VerificaAcesso(getOperacao()))
        {
            this.Excluir(p_id, p_path, true);
            this.Gravar(o, p_path, p_id);
            return true;
        }
        throw new Exception("Operação não permitida.");
    }
    private boolean Excluir(int p_id, String p_path, boolean IsAlterar) throws Exception
    {
        if(seg.VerificaAcesso(getOperacao()) || IsAlterar)
        {
            File _file = new File(p_path+p_id+".txt");
            _file.delete();
            return true;
        }
        throw new Exception("Operação não permitida.");
    }
    private int RetornaUltimo(String p_path)
    {
        File arquivo = new File(p_path); 
        File[] arquivos = arquivo.listFiles();
        int _id = 0;
        if(arquivos.length > 0)
        {
            Arrays.sort(arquivos,0, arquivos.length);
            String ultimoArquivo = arquivos[arquivos.length -1].getName();
            _id = Integer.parseInt(ultimoArquivo.substring(0,ultimoArquivo.length() -4));
        }
        return _id;
    }
    public File RetornaSelecionado(String p_path, int p_id)
    {
        File arquivo = new File("../"+p_path); 
        ArrayList<File> arquivos = new ArrayList<>(Stream.of(arquivo.listFiles()).collect(Collectors.toList()));
        return arquivos.stream()
                .filter((File f) -> 
                 Integer.parseInt(f.getName()
                  .substring(0, f.getName().length() -4)) == p_id)
                    .findFirst()
                     .orElse(arquivo);
    }
    public ArrayList<Object> RetornaLista(Object o, String p_path) throws IOException, FileNotFoundException, ClassNotFoundException
    {
        File _arquivo = new File("../"+p_path); 
        ArrayList<File> _arquivos = new ArrayList<>(Stream.of(_arquivo.listFiles()).collect(Collectors.toList()));
        ArrayList<Object> _objRetorno = new ArrayList<>();
        for (File arq : _arquivos) {
            _objRetorno.add(CarregaArquivo(arq.getName(), p_path));
        }
        return _objRetorno;
    }
    private Object CarregaArquivo(String p_nmArquivo, String p_path) throws FileNotFoundException, IOException, ClassNotFoundException
    {
        FileInputStream arquivoLeitura = new FileInputStream(p_path + p_nmArquivo);
        ObjectInputStream objLeitura =  new ObjectInputStream(arquivoLeitura);
        arquivoLeitura.close();
        objLeitura.close();
        return objLeitura.readObject();
    }
    private void PopulaPath(Object o)
    {
        if(o.getClass() == Usuario.class)
        {
            dePath += "//Usuario//";
           
                
                
        }
        else if(o.getClass() == Livro.class)
        {
            dePath += "../Livro/";
        }
        else if(o.getClass() == Emprestimo.class)
        {
            dePath += "../Emprestimo/";
        }
         Path _pasta = Paths.get(dePath);
            boolean success;
            if(!Files.exists(_pasta))
                success =  (new File(dePath)).mkdirs();
    }
    
    
}
