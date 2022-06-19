package br.com.veterinaria.model.entidade;

public class Usuario {
	long idUsuario;
	long idCargo;
	String nome;
	String nomeCargo;
	String login;
	String senha;
	public long getIdUsuario() {
		return idUsuario;
	}
	public long getIdCargo() {
		return idCargo;
	}
	public String getNome() {
		return nome;
	}
	public String getNomeCargo() {
		return nomeCargo;
	}
	public String getLogin() {
		return login;
	}
	public String getSenha() {
		return senha;
	}
	public void setIdUsuario(long idUsuario) {
		this.idUsuario = idUsuario;
	}
	public void setIdCargo(long idCargo) {
		this.idCargo = idCargo;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setNomeCargo(String nomeCargo) {
		this.nomeCargo = nomeCargo;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
	
	
}
