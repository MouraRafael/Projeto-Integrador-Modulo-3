package br.com.veterinaria.model.entidade;

import java.sql.Date;

public class Animal {
	private long id_animal;
	private long id_dono;
	private String nome;
	private char sexo;
	private Date data_nasc;
	private String raca;
	
	private String observacoes;
	
	
	public long getId_animal() {
		return id_animal;
	}
	public long getId_dono() {
		return id_dono;
	}
	public String getNome() {
		return nome;
	}
	public char getSexo() {
		return sexo;
	}
	public Date getData_nasc() {
		return data_nasc;
	}
	public String getRaca() {
		return raca;
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
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public void setData_nasc(Date data_nasc) {
		this.data_nasc = data_nasc;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}
}
