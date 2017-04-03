/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import Entidades.Usuario;
import java.util.ArrayList;

/**
 *
 * @author Rolando
 */
public class UsuarioModel {
     public boolean Incluir(Usuario p_usuario)
    {
         return true;
    }
    public boolean Alterar(Usuario p_usuario)
    {
         return true;
    }
    public boolean Excluir(Usuario p_usuario)
    {
        return true;
    }
    public Usuario Consultar(Usuario p_usuario)
    {
        Usuario _p_usuario = new Usuario();
        return _p_usuario;
    }

    public ArrayList<Usuario> Listar()
    {
        ArrayList<Usuario> _lstUsuarios = new ArrayList<Usuario>();
        return _lstUsuarios;
    }
}
