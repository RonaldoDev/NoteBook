/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Framework;

import Entidades.Sessao;
import Entidades.Usuario;
import Enumeradores.EventoBotao;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;
import model.UsuarioModel;

/**
 *
 * @author Rolando
 */
public class Seguranca {
    private Sessao sessaoUsuario;

    public void setSessaoUsuario(Sessao sessaoUsuario) {
        this.sessaoUsuario = sessaoUsuario;
    }

    public Sessao getSessaoUsuario() {
        return sessaoUsuario;
    }
    public Seguranca()
    {
    }
    public Seguranca(Sessao sessaoUsuario)
    {
        this.sessaoUsuario = sessaoUsuario;
    }

    public boolean VerificaAcesso(EventoBotao p_evtBotao) 
    {
        try
        {
            UsuarioModel mdlUsuario = new UsuarioModel();
            ArrayList<Usuario> arrUsuario = mdlUsuario.Listar();
            Usuario _objRetorno = arrUsuario.stream().filter((Usuario f) ->  
                    f.getPermissoesTela().contains(this.sessaoUsuario.getTransacao()) && 
                       f.getPermissaoFuncao().contains(p_evtBotao) && 
                          this.sessaoUsuario.getIdUsuario() == f.getIdUsuario()).findFirst().orElse(null);
            return _objRetorno != null;
        }
        catch(Exception e)
        {
            
        }
        return false;
    }
    public boolean Login(Usuario p_usuario) throws Exception
    {
        try {
            UsuarioModel mdlUsuario = new UsuarioModel();
            Usuario _u = mdlUsuario.Consultar(p_usuario);
            if(_u != null && p_usuario.getSenha() == _u.getSenha())
            {
                return true;
            }
            else
            {
               throw  new Exception("Usuario ou senha está incorreto."); 
            }
        } catch (Exception e) {
            
        }
        return false;
    }
}
        
   
    
 
