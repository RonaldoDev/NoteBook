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
public class Livro {
    
    private String titulo;
    private String autor;
    private String edicao;
    private String qtdeTotal;
    private String qtdeDisponivel;
    
    public Livro(String titulo, String autor, String edicao, String qtdeTotal){
        this.autor = autor;
        this.titulo = titulo;
        this.edicao = edicao;
        this.qtdeTotal = qtdeTotal;
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
    public String getQtdeTotal() {
        return qtdeTotal;
    }

    /**
     * @param qtdeTotal the qtdeTotal to set
     */
    public void setQtdeTotal(String qtdeTotal) {
        this.qtdeTotal = qtdeTotal;
    }

    /**
     * @return the qtdeDisponivel
     */
    public String getQtdeDisponivel() {
        return qtdeDisponivel;
    }

    /**
     * @param qtdeDisponivel the qtdeDisponivel to set
     */
    public void setQtdeDisponivel(String qtdeDisponivel) {
        this.qtdeDisponivel = qtdeDisponivel;
    }
    
}
