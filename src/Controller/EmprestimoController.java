/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Entidades.Emprestimo;
import Entidades.Livro;
import Enumeradores.EventoBotao;
import model.EmprestimoModel;

/**
 *
 * @author Rolando
 */
public class EmprestimoController {
    public Emprestimo ExecutaEventoBotao(Emprestimo p_emprestimo, Livro p_livro, EventoBotao evtBotao)
    {
        try 
        {
            if(ValidaRegrasNegocio())
            {
                EmprestimoModel _mdlEmprestimo = new EmprestimoModel();
                switch(evtBotao)
                {
                    case Incluir :
                        _mdlEmprestimo.Incluir(p_livro, p_emprestimo);
                        break;
                    case Alterar :
                        _mdlEmprestimo.Alterar(p_livro, p_emprestimo);
                        break;
                    case Excluir :
                        _mdlEmprestimo.Excluir(p_livro, p_emprestimo);
                        break;
                    case Consultar :
                        Livro _retornoEmprestimo = _mdlEmprestimo.Consultar(p_livro, p_emprestimo);
                        break;
                }
            }
        } 
        catch (Exception e) 
        {
        }
        return p_emprestimo;
    }

    private boolean ValidaRegrasNegocio() {
        return true;
    }
}
