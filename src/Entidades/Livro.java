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
public class Livro {
    private int idLivro;
    private String titulo;
    private String autor;
    private String edicao;
    private int qtdeTotal;
    private int qtdeDisponivel;
    private SituacaoLivro situacao;
    
    public Livro(String titulo, String autor, String edicao){
        this.idLivro = 0;
        this.autor = autor;
        this.titulo = titulo;
        this.edicao = edicao;
        //this.qtdeTotal = qtdeTotal;
        //this.qtdeTotal = qtdeTotal;
        this.situacao = SituacaoLivro.Disponivel;
    }

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @return the autor
     */
    public String getAutor() {
        return autor;
    }

    /**
     * @return the edicao
     */
    public String getEdicao() {
        return edicao;
    }

    /**
     * @return the qtdeTotal
     */
    public int getQtdeTotal() {
        return qtdeTotal;
    }

    /**
     * @param qtdeTotal the qtdeTotal to set
     */
    public void setQtdeTotal(int qtdeTotal) {
        this.qtdeTotal = qtdeTotal;
    }

    /**
     * @return the qtdeDisponivel
     */
    public int getQtdeDisponivel() {
        return qtdeDisponivel;
    }

    /**
     * @param qtdeDisponivel the qtdeDisponivel to set
     */
    public void setQtdeDisponivel(int qtdeDisponivel) {
        this.qtdeDisponivel = qtdeDisponivel;
    }

    /**
     * @return the idLivro
     */
    public int getIdLivro() {
        return idLivro;
    }

    /**
     * @param idLivro the idLivro to set
     */
    public void setIdLivro(int idLivro) {
        this.idLivro = idLivro;
    }

    /**
     * @return the situacao
     */
    public String getSituacao() {
        if(situacao == SituacaoLivro.Disponivel) return "Disponivel";
        else return "Emprestado";
    }

    /**
     * @param situacao the situacao to set
     */
    public void setSituacao(SituacaoLivro situacao) {
        this.situacao = situacao;
    }
    
}
