/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import Enumeradores.SituacaoLivro;

/**
 *
 * @author Rolando
 */
public class Emprestimo {
    private int idEmprestimo;
    private Livro livro;
    private Usuario usuario;
    private String dtEmprestimo;
    private String dtDevolucao;
    
    public Emprestimo(Livro livro, Usuario user){
        this.idEmprestimo = 0;
        this.livro = livro;
        this.livro.setSituacao(SituacaoLivro.Emprestado);
        this.usuario = user;
    }

    /**
     * @return the livro
     */
    public Livro getLivro() {
        return livro;
    }

    /**
     * @return the usuario
     */
    public Usuario getUsuario() {
        return usuario;
    }

    /**
     * @return the dtEmprestimo
     */
    public String getDtEmprestimo() {
        return dtEmprestimo;
    }

    /**
     * @return the dtDevolucao
     */
    public String getDtDevolucao() {
        return dtDevolucao;
    }

    /**
     * @return the idEmprestimo
     */
    public int getIdEmprestimo() {
        return idEmprestimo;
    }

    /**
     * @param idEmprestimo the idEmprestimo to set
     */
    public void setIdEmprestimo(int idEmprestimo) {
        this.idEmprestimo = idEmprestimo;
    }
    
}
