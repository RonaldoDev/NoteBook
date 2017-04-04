/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Entidades.Livro;
import Enumeradores.EventoBotao;
import model.LivroModel;

/**
 *
 * @author Rolando
 */
public class LivroController {
    public Livro ExecutaEventoBotao(Livro p_livro, EventoBotao evtBotao)
    {
        try 
        {
            if(ValidaRegrasNegocio())
            {
                LivroModel _mdlLivro = new LivroModel();
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

    private boolean ValidaRegrasNegocio() 
    {
        return true;
    }
}
