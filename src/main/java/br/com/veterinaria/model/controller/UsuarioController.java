package br.com.veterinaria.model.controller;

import br.com.veterinaria.model.dao.UsuarioDao;
import br.com.veterinaria.model.entidade.Usuario;

public class UsuarioController {
	UsuarioDao dao = new UsuarioDao();
	
	public Usuario logar (String login, String senha) {
		return dao.buscarUsuario(login, senha);
	}
}
