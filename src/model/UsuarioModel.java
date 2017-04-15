/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import Entidades.Usuario;
import Enumeradores.EventoBotao;
import Framework.Persistencia;
import java.awt.List;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Rolando
 */
public class UsuarioModel {

    Persistencia db = new Persistencia();

    public Usuario Incluir(Usuario p_usuario) {
        p_usuario.setIdUsuario((int) db.ExecutaPersistencia(p_usuario, EventoBotao.Incluir).get(0));
        return p_usuario;
    }

    public Usuario Alterar(Usuario p_usuario) {
        return (Usuario) db.ExecutaPersistencia(p_usuario, EventoBotao.Alterar).get(0);
    }

    public boolean Excluir(Usuario p_usuario) {
        return (boolean) db.ExecutaPersistencia(p_usuario, EventoBotao.Excluir).get(0);
    }

    public Usuario Consultar(Usuario p_usuario) throws IOException, FileNotFoundException, ClassNotFoundException, NoSuchMethodException {
        if (!p_usuario.getNome().equals("")) {
            return (Usuario) db.RetornaSelecionado(p_usuario);
        } else {
            return (Usuario) db.ExecutaPersistencia(p_usuario, EventoBotao.Consultar).get(0);
        }

    }

    public ArrayList<Usuario> Listar(Usuario p_objUsuario) throws IOException, FileNotFoundException, ClassNotFoundException {
        ArrayList<Object> arrUsuarioGenerico = db.ExecutaPersistencia(p_objUsuario, EventoBotao.Listar);
        ArrayList<Usuario> arrUsuario = new ArrayList<>();
        for (Object usuario : arrUsuarioGenerico) {
            arrUsuario.add((Usuario) usuario);
        }
        return arrUsuario;
    }

}
