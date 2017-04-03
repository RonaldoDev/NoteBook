/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Entidades.Usuario;
import model.UsuarioModel;

/**
 *
 * @author Rolando
 */
public class UsuarioController {
    public boolean CadastrarUsuario(Usuario p_usuario)
    {
        UsuarioModel mdlUsuario = new UsuarioModel();
        return mdlUsuario.Incluir(p_usuario);
    }
}
