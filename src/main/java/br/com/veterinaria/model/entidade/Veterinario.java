package br.com.veterinaria.model.entidade;

public class Veterinario extends Endereco {
	private long idVet;
	private String nome;
	private String cpf;
	private long crmv;
	private String email;
	private String telefone;
	
	
	//Getters
	public long getIdVet() {
		return idVet;
	}
	public String getNome() {
		return nome;
	}
	public String getCpf() {
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
	public void setIdVet(long idVet) {
		this.idVet = idVet;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setCpf(String cpf) {
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
