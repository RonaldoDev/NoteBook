/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package Entidades;

import Enumeradores.SituacaoLivro;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
*
* @author Rolando
*/
public class Emprestimo {
private int idEmprestimo;
private Livro livro;
private Usuario usuario;
private Date dtEmprestimo;
private Date dtDevolucao;
private static int tempoEmprestimo = 14;

public Emprestimo(Livro livro, Usuario user){
    this.idEmprestimo = 0;
    this.livro = livro;
    this.livro.setSituacao(SituacaoLivro.Emprestado);
    this.usuario = user;
    Calendar c = Calendar.getInstance();
    this.dtEmprestimo = c.getTime();
    c.add(Calendar.DATE, tempoEmprestimo);
    this.dtDevolucao = c.getTime();
}

    public Emprestimo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
public Date getDtEmprestimo() {
    return dtEmprestimo;
}

/**
* @return the dtDevolucao
*/
public Date getDtDevolucao() {
    return dtDevolucao;
}

/**
* @return the dtEmprestimo
*/
public String getDtEmprestimoString() {
    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
    return formatter.format(dtEmprestimo);
}

/**
* @return the dtDevolucao
*/
public String getDtDevolucaoString() {
    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
    return formatter.format(dtDevolucao);
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

    /**
     * @return the tempoEmprestimo
     */
    public static int getTempoEmprestimo() {
        return tempoEmprestimo;
    }

}