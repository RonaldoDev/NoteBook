/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Rolando
 */
public class Emprestimo {
    private Livro livro;
    private Usuario usuario;
    private String dtEmprestimo;
    private String dtDevolucao;
    
    public Emprestimo(Livro livro, Usuario user, String dtEmp, String dtDev){
        this.livro = livro;
        this.usuario = user;
        this.dtDevolucao = dtDev;
        this.dtEmprestimo = dtEmp;
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
    
}
