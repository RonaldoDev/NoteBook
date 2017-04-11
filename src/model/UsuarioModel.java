/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import Entidades.Usuario;
import Enumeradores.EventoBotao;
import Framework.Persistencia;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Rolando
 */
public class UsuarioModel {
    
    Persistencia persistencia = new Persistencia();
    
     public boolean Incluir(Usuario p_usuario)
    {
        persistencia.ExecutaPersistencia(p_usuario, EventoBotao.Incluir);
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
        //Usuario _p_usuario = new Usuario();
        return p_usuario;
    }

    public ArrayList<Usuario> Listar() throws IOException, FileNotFoundException, ClassNotFoundException
    {
        Persistencia objDados = new Persistencia();
        ArrayList<Object> arrUsuarioGenerico = objDados.RetornaLista(Usuario.class, "../Usuario");
        ArrayList<Usuario> arrUsuario = new ArrayList<>();
        for (Object usuario : arrUsuario) {
            arrUsuario.add((Usuario)usuario);
        }
        return arrUsuario;
    }
    
}
