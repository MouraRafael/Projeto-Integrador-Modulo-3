package br.com.veterinaria.model.entidade;

public class Endereco {
	private long idEndereco;
	private String cidade;
	private String bairro;
	private String logradouro;
	private long numero;
	private long cep;
	public long getIdEndereco() {
		return idEndereco;
	}
	public String getCidade() {
		return cidade;
	}
	public String getBairro() {
		return bairro;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public long getNumero() {
		return numero;
	}
	public long getCep() {
		return cep;
	}
	
	
	
	
	
	public void setIdEndereco(long idEndereco) {
		this.idEndereco = idEndereco;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public void setNumero(long numero) {
		this.numero = numero;
	}
	public void setCep(long cep) {
		this.cep = cep;
	}
	
}
