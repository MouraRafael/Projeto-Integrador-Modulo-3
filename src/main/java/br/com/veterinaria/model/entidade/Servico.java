package br.com.veterinaria.model.entidade;

public class Servico {
	private long 	idServico;
	private String 	servico;
	private long	idFicha;
	
	
	public long getIdServico() {
		return idServico;
	}
	public String getServico() {
		return servico;
	}
	public long getIdFicha() {
		return idFicha;
	}
	public void setIdServico(long idServico) {
		this.idServico = idServico;
	}
	public void setServico(String servico) {
		this.servico = servico;
	}
	public void setIdFicha(long idFicha) {
		this.idFicha = idFicha;
	}
}
