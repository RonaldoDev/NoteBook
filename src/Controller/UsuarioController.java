/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Entidades.Usuario;
import Enumeradores.EventoBotao;
import model.UsuarioModel;

/**
 *
 * @author Rolando
 */
public class UsuarioController {
    public Usuario ExecutaEventoBotao(Usuario p_usuario, EventoBotao evtBotao)
    {
        try 
        {
            if(ValidaRegrasNegocio())
            {
                UsuarioModel _mdlUsuario = new UsuarioModel();
                switch(evtBotao)
                {
                    case Incluir :
                        return _mdlUsuario.Incluir(p_usuario);
                    case Alterar :
                        return _mdlUsuario.Alterar(p_usuario);
                    case Excluir :
                        if(_mdlUsuario.Excluir(p_usuario));
                            return null;
                    case Consultar :
                       return _mdlUsuario.Consultar(p_usuario);
                }
            }
        } 
        catch (Exception e) 
        {
        }
        return p_usuario;
    }

    private boolean ValidaRegrasNegocio() {
        return true;
    }
}
