/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Entidades.Emprestimo;
import Entidades.Livro;
import Enumeradores.EventoBotao;
import java.util.ArrayList;
import model.EmprestimoModel;

/**
 *
 * @author Rolando
 */
public class EmprestimoController {
    
    EmprestimoModel _mdlEmprestimo = new EmprestimoModel();
    
    public Emprestimo ExecutaEventoBotao(Emprestimo p_emprestimo, Livro p_livro, EventoBotao evtBotao)
    {
        try 
        {
            if(ValidaRegrasNegocio(p_emprestimo, evtBotao))
            {
                //EmprestimoModel _mdlEmprestimo = new EmprestimoModel();
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
                        Emprestimo _retornoEmprestimo = _mdlEmprestimo.Consultar(p_livro, p_emprestimo);
                        break;
                }
            }
        } 
        catch (Exception e) 
        {
        }
        return p_emprestimo;
    }
    
    public ArrayList<Emprestimo> Listar() {
        
        ArrayList<Emprestimo> _lstEmprestimo = null;
        try{
            _lstEmprestimo = _mdlEmprestimo.Listar();
        } catch(Exception e){    
        }
        return _lstEmprestimo;
    }

      private boolean ValidaRegrasNegocio(Emprestimo p_emprestimo, EventoBotao evtBotao) throws Exception {
        if(p_emprestimo.getIdEmprestimo() > 0 && evtBotao == EventoBotao.Incluir)
        {
            throw new Exception("Não pode incluir um registro com código.");
        }
        else if(p_emprestimo.getIdEmprestimo() == 0 && evtBotao == EventoBotao.Alterar)
        {
            throw new Exception("Não pode incluir um registro sem código.");
        }
        else if(p_emprestimo.getIdEmprestimo() > 0 && evtBotao == EventoBotao.Incluir)
        {
             throw new Exception("Não pode consultar um registro sem código.");
        }
        return true;
    }
}
