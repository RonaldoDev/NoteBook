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
public class Pessoa {
    
    private String nome;
    private String endereco;
    private String cpf;
    private String dtNasc;
    
    public Pessoa(String nm, String end, String cpf, String dtNasc){
        this.nome = nm;
        this.endereco = end;
        this.cpf = cpf;
        this.dtNasc = dtNasc;
    }
    public Pessoa()
    {
        
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public String getEndereco(){
        return this.endereco;
    }
    
    public String getCpf(){
        return this.cpf;
    }
    
    public String getDataNascimento(){
        return this.dtNasc;
    }
    
}
