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
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import static java.util.Arrays.stream;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author Rolando
 */
public class Persistencia {
    
    public Object ExecutaPersistencia(Object o, EventoBotao evtBotao)
    {
        try 
        {
            switch(evtBotao)
            {

                case Incluir:
                    o = this.Gravar(o);
                    break;
                case Alterar:
                    break;
                case Excluir:
                    break;
                case Consultar:
                    Field _field = o.getClass().getField("Id"+o.getClass().getName());
                    o = this.RetornaSelecionado(o.getClass().getName(), _field.getInt(o));
                    break;
                case Listar:
                    break;
            }
            
        
        } 
        catch (Exception e) {
        }
        return o;
    }
    public boolean Gravar(Object o) throws FileNotFoundException, IOException
    {
        String _path = "";
        String _nmArquivo = "";
        if(o.getClass() == Usuario.class)
        {
            _path = "../Usuario/";
            int _novoId = this.RetornaUltimo(_path) + 1;
            _nmArquivo =  Integer.toString(_novoId) + ".txt";
        }
        else if(o.getClass() == Livro.class)
        {
            _path = "../Livro/";
            int _novoId = this.RetornaUltimo(_path) + 1;
            _nmArquivo =  Integer.toString(_novoId) + ".txt";
        }
        else if(o.getClass() == Emprestimo.class)
        {
            _path = "../Emprestimo/";
            int _novoId = this.RetornaUltimo(_path) + 1;
            _nmArquivo =  Integer.toString(_novoId) + ".txt";
        }
        FileOutputStream arquivoGrav = new FileOutputStream(_path+_nmArquivo);
        ObjectOutputStream objGravar = new ObjectOutputStream(arquivoGrav);
        objGravar.writeObject(o);
        objGravar.flush();
        objGravar.close();
        arquivoGrav.flush();
        arquivoGrav.close();
        
        return true;
    }
    public int RetornaUltimo(String p_path)
    {
        File arquivo = new File(p_path); 
        File[] arquivos = arquivo.listFiles();
        Arrays.sort(arquivos,0, arquivos.length);
        String ultimoArquivo = arquivos[arquivos.length -1].getName();
        return Integer.parseInt(ultimoArquivo.substring(0,ultimoArquivo.length() -4));
    }
    public File RetornaSelecionado(String p_path, int p_id)
    {
        File arquivo = new File("../p_path"); 
        ArrayList<File> arquivos = new ArrayList<>(Stream.of(arquivo.listFiles()).collect(Collectors.toList()));
        return arquivos.stream()
                .filter((File f) -> 
                 Integer.parseInt(f.getName()
                  .substring(0, f.getName().length() -4)) == p_id)
                    .findFirst()
                     .orElse(arquivo);
}
    
}
