/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import Entidades.Livro;
import Enumeradores.EventoBotao;
import Framework.Persistencia;
import java.awt.List;
import java.util.ArrayList;

/**
 *
 * @author Rolando
 */
public class LivroModel {
    
    Persistencia db = new Persistencia();
    
    public Livro Incluir(Livro p_livro)
    {
         p_livro.setIdLivro((int)db.ExecutaPersistencia(p_livro, EventoBotao.Incluir).get(0));
      return  p_livro;
    }
    public Livro Alterar(Livro p_livro)
    {
        return (Livro)db.ExecutaPersistencia(p_livro, EventoBotao.Alterar).get(0);
    }
    public boolean Excluir(Livro p_livro)
    {
        return (boolean)db.ExecutaPersistencia(p_livro, EventoBotao.Excluir).get(0);
    }
    public Livro Consultar(Livro p_livro)
    {
        return (Livro)db.ExecutaPersistencia(p_livro, EventoBotao.Alterar).get(0);
    }

    public ArrayList<Livro> Listar()
    {
        ArrayList<Object> arrLivroGenerico = db.ExecutaPersistencia(0, EventoBotao.Listar);
        ArrayList<Livro> arrLivro = new ArrayList<>();
        for (Object livro : arrLivroGenerico) {
            arrLivro.add((Livro)livro);
        }
        return arrLivro;
    }
    
}
