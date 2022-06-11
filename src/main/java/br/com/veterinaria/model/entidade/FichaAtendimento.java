package br.com.veterinaria.model.entidade;

import java.util.Date;

public class FichaAtendimento {
	private long 		idFicha;
	private long 		idAnimal;
	private Date 		data;
	private Veterinario veterinario;
	private String 		motivoVisita;
	private String 		diagnostico;
	private String 		tratamento;
	private String 		prescricao;
	private String 		observacoes;
	
	
	
	//Getters
	public long getIdFicha() {
		return idFicha;
	}
	public long getIdAnimal() {
		return idAnimal;
	}
	public Date getData() {
		return data;
	}
	public Veterinario getVeterinario() {
		return veterinario;
	}
	public String getMotivoVisita() {
		return motivoVisita;
	}
	public String getDiagnostico() {
		return diagnostico;
	}
	public String getTratamento() {
		return tratamento;
	}
	public String getPrescricao() {
		return prescricao;
	}
	public String getObservacoes() {
		return observacoes;
	}
	
	
	
	//Setters
	public void setIdFicha(long idFicha) {
		this.idFicha = idFicha;
	}
	public void setIdAnimal(long idAnimal) {
		this.idAnimal = idAnimal;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public void setVeterinario(Veterinario veterinario) {
		this.veterinario = veterinario;
	}
	public void setMotivoVisita(String motivoVisita) {
		this.motivoVisita = motivoVisita;
	}
	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}
	public void setTratamento(String tratamento) {
		this.tratamento = tratamento;
	}
	public void setPrescricao(String prescricao) {
		this.prescricao = prescricao;
	}
	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}
}
