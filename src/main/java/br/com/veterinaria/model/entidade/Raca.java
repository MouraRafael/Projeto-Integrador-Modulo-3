package br.com.veterinaria.model.entidade;

public class Raca {
	private long idRaca;
	private long idEspecie;
	private String nomeRaca;
	private String nomeEspecie;
	
	
	public long getIdRaca() {
		return idRaca;
	}
	public long getIdEspecie() {
		return idEspecie;
	}
	public String getNomeRaca() {
		return nomeRaca;
	}
	public String getNomeEspecie() {
		return nomeEspecie;
	}
	public void setIdRaca(long idRaca) {
		this.idRaca = idRaca;
	}
	public void setIdEspecie(long idEspecie) {
		this.idEspecie = idEspecie;
	}
	public void setNomeRaca(String nomeRaca) {
		this.nomeRaca = nomeRaca;
	}
	public void setNomeEspecie(String nomeEspecie) {
		this.nomeEspecie = nomeEspecie;
	}
	
	
}
