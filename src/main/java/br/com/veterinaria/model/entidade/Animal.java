package br.com.veterinaria.model.entidade;

import java.sql.Date;

public class Animal {
	private long id_animal;
	private long id_dono;
	private String nome;
	private String sexo;
	private String nascimento;
	private String observacoes;
	
	private Raca raca;
	private DonoAnimal dono;
	
	
	public String getNascimento() {
		return nascimento;
	}
	public void setNascimento(String nascimento) {
		this.nascimento = nascimento;
	}
	//Getters
	public long getId_animal() {
		return id_animal;
	}
	public long getId_dono() {
		return id_dono;
	}
	public String getNome() {
		return nome;
	}
	public String getSexo() {
		return sexo;
	}
	
	public Raca getRaca() {
		return raca;
	}
	public DonoAnimal getDono() {
		return dono;
	}
	
	public String getObservacoes() {
		return observacoes;
	}
	public void setId_animal(long id_animal) {
		this.id_animal = id_animal;
	}
	public void setId_dono(long id_dono) {
		this.id_dono = id_dono;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}
	public void setRaca(Raca raca) {
		this.raca = raca;
	}
	public void setDono(DonoAnimal dono) {
		this.dono = dono;
	}
	
	
	
	//Setters
	

	
	
	
}
