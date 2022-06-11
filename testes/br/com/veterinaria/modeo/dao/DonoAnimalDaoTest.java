package br.com.veterinaria.modeo.dao;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import br.com.veterinaria.model.dao.DonoAnimalDao;
import br.com.veterinaria.model.entidade.DonoAnimal;

class DonoAnimalDaoTest {

	@Test
	void testListagem() {
		DonoAnimal d = new DonoAnimal();
		DonoAnimalDao dao = new DonoAnimalDao();
		
		dao.listar("");
		
	}

}
