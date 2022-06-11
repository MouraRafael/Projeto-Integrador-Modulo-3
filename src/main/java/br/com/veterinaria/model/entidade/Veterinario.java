package br.com.veterinaria.model.entidade;

public class Veterinario extends Endereco {
	private int idVet;
	private String nome;
	private long cpf;
	private long crmv;
	private String email;
	private String telefone;
	
	
	//Getters
	public int getIdVet() {
		return idVet;
	}
	public String getNome() {
		return nome;
	}
	public long getCpf() {
		return cpf;
	}
	public long getCrmv() {
		return crmv;
	}
	public String getEmail() {
		return email;
	}
	public String getTelefone() {
		return telefone;
	}
	
	
	//Setters
	public void setIdVet(int idVet) {
		this.idVet = idVet;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setCpf(long cpf) {
		this.cpf = cpf;
	}
	public void setCrmv(long crmv) {
		this.crmv = crmv;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
}
