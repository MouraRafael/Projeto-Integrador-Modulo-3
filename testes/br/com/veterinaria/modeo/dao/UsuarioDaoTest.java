package br.com.veterinaria.modeo.dao;

import org.junit.jupiter.api.Test;

import br.com.veterinaria.model.dao.UsuarioDao;
import br.com.veterinaria.model.entidade.Usuario;

class UsuarioDaoTest {

	@Test
	void test() {
		//fail("Not yet implemented");
		
		Usuario u = new Usuario();
		UsuarioDao dao = new UsuarioDao();
		
		
		
		u = dao.buscarUsuario("maria2", "atend123");
		
		System.out.print(u.getNome()+" - "+u.getIdCargo());
		
	}

}
