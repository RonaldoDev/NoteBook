/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Entidades.Livro;
import Enumeradores.EventoBotao;
import java.io.IOException;
import java.util.ArrayList;
import model.LivroModel;

/**
 *
 * @author Rolando
 */
public class LivroController {
    
    LivroModel _mdlLivro = new LivroModel();
    
    public Livro ExecutaEventoBotao(Livro p_livro, EventoBotao evtBotao)
    {
        try 
        {
            if(ValidaRegrasNegocio(p_livro, evtBotao))
            {
                //LivroModel _mdlLivro = new LivroModel();
                switch(evtBotao)
                {
                    case Incluir :
                        _mdlLivro.Incluir(p_livro);
                        break;
                    case Alterar :
                        _mdlLivro.Alterar(p_livro);
                        break;
                    case Excluir :
                        _mdlLivro.Excluir(p_livro);
                        break;
                    case Consultar :
                        Livro _retornoLivro = _mdlLivro.Consultar(p_livro);
                        break;
                }
            }
        } 
        catch (Exception e) 
        {
        }
        return p_livro;
    }
    
    
    public ArrayList<Livro> Listar() {
        
        ArrayList<Livro> _lstLivro = null;
        try{
            _lstLivro = _mdlLivro.Listar();
        } catch(Exception e){    
        }
        return _lstLivro;
    }

    private boolean ValidaRegrasNegocio(Livro p_livro, EventoBotao evtBotao) throws Exception {
        if(p_livro.getIdLivro() > 0 && evtBotao == EventoBotao.Incluir)
        {
            throw new Exception("Não pode incluir um registro com código.");
        }
        else if(p_livro.getIdLivro() == 0 && evtBotao == EventoBotao.Alterar)
        {
            throw new Exception("Não pode incluir um registro sem código.");
        }
        else if(p_livro.getIdLivro() > 0 && evtBotao == EventoBotao.Incluir)
        {
             throw new Exception("Não pode consultar um registro sem código.");
        }
        return true;
    }
}
