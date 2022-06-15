package br.com.veterinaria.model.entidade;

public class DonoAnimal extends Endereco {
	private long id_dono;
	private String cpf;
	private String nome;
	private String email;
	private String telefone;
	
	
	
	public long getId_dono() {
		return id_dono;
	}
	public String getCpf() {
		return cpf;
	}
	public String getNome() {
		return nome;
	}
	public String getEmail() {
		return email;
	}
	public String getTelefone() {
		return telefone;
	}
	
	
	
	
	public void setId_dono(long id_dono) {
		this.id_dono = id_dono;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
}
