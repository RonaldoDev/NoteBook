/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import Entidades.Livro;
import Entidades.Emprestimo;
import java.util.ArrayList;

/**
 *
 * @author Rolando
 */
public class EmprestimoModel {
     public boolean Incluir(Livro p_livro, Emprestimo p_emprestimo)
    {
        return true;
    }
    public boolean Alterar(Livro p_livro, Emprestimo p_emprestimo)
    {
         return true;
    }
    public boolean Excluir(Livro p_livro, Emprestimo p_emprestimo)
    {
        return true;
    }
    public Livro Consultar(Livro p_livro, Emprestimo p_emprestimo)
    {
        //Livro _p_livro = new Livro();
        return p_livro;
    }

    public ArrayList<Livro> Listar()
    {
        ArrayList<Livro> _lstLivros = new ArrayList<Livro>();
        return _lstLivros;
    }
}
