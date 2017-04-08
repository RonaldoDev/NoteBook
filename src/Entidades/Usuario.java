/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import Enumeradores.EventoBotao;
import Enumeradores.TransacaoSistema;
import Framework.Cripto;
import java.util.ArrayList;

/**
 *
 * @author Rolando
 */
public class Usuario {
    private int IdUsuario;
    private String Senha;
    private ArrayList<TransacaoSistema> PermissoesTela;
    private ArrayList<EventoBotao> PermissaoFuncao;

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
    
    
}
