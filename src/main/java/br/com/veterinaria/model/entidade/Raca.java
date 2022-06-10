package br.com.veterinaria.model.entidade;

public class Raca {
	private long idRaca;
	private long idEspecie;
	private String nomeRaca;
	
	
	public long getIdRaca() {
		return idRaca;
	}
	public long getIdEspecie() {
		return idEspecie;
	}
	public String getNomeRaca() {
		return nomeRaca;
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
}
