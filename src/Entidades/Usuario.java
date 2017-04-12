/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import Enumeradores.EventoBotao;
import Enumeradores.TipoUsuario;
import Enumeradores.TransacaoSistema;
import Framework.Cripto;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Rolando
 */
public class Usuario extends Pessoa implements Serializable{
    private int IdUsuario;
    private String Usuario;
    private String Senha;
    private TipoUsuario tipoUsuario;
    private ArrayList<TransacaoSistema> PermissoesTela;
    private ArrayList<EventoBotao> PermissaoFuncao;


    public Usuario(String p_nmUsuario, String p_endUsuario, String p_nuCpf, String p_dtNascimento, String p_nmLogin, String p_deSenha, TipoUsuario p_tpUsuario) {
        super(p_nmUsuario, p_endUsuario, p_nuCpf, p_dtNascimento);
        this.IdUsuario = 0;
        this.Usuario = p_nmLogin;
        this.Senha = String.valueOf(p_deSenha);
        this.tipoUsuario = p_tpUsuario;
    }

    /**
     *
     */
    public Usuario() {
        
    }
    
    
    

    public String getSenha() {
        return Senha;
    }
    public void setSenha(String Senha, boolean IsNova) {
        if(IsNova)
        {
            Cripto objCripto = new Cripto(Senha);
            this.Senha = objCripto.Criptografa();
        }
        else
        {
            this.Senha = Senha;
        }
    }
    public ArrayList<TransacaoSistema> getPermissoesTela() {
        return PermissoesTela;
    }
    public void setPermissoesTela(ArrayList<TransacaoSistema> PermissoesTela) {
        this.PermissoesTela = PermissoesTela;
    }
    public ArrayList<EventoBotao> getPermissaoFuncao() {
        return PermissaoFuncao;
    }
    public void setPermissaoFuncao(ArrayList<EventoBotao> PermissaoFuncao) {
        this.PermissaoFuncao = PermissaoFuncao;
    }
    public void setIdUsuario(int IdUsuario) {
        this.IdUsuario = IdUsuario;
    }
    public int getIdUsuario() {
        return IdUsuario;
    }
    
    public String getTipoUsuario(){
      
        String _retTipo = "";
        switch(tipoUsuario){
            case CLIENTE:
                _retTipo =  "Cliente";
            break;
            
            case FUNCIONARIO:
                _retTipo = "Funcionário";
            break;
            
            case GERENTE:
                _retTipo = "Gerente";
            break;        
        }
        
        return _retTipo;
    }

    /**
     * @return the Usuario
     */
    public String getUsername() {
        return Usuario;
    }
    
    
}