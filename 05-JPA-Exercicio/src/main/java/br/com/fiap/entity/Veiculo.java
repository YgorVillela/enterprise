package br.com.fiap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="T_VEICULO")
@SequenceGenerator(name="vei", sequenceName = "SQ_T_VEICULO", allocationSize = 1)
public class Veiculo {
	
	@Id
	@Column(name="cd_veiculo")
	@GeneratedValue(generator = "vei", strategy = GenerationType.SEQUENCE)
	private int codVei;

	@Column(name="ds_placa", nullable = false, length = 9)
	private String placaVei;

	@Column(name="ds_cor", nullable = false, length = 20)
	private String corVei;

	@Column(name="nr_ano")
	private int ano;
	
	public Veiculo() {
		super();
	}

	public Veiculo(String placaVei, String corVei, int ano) {
		super();
		this.placaVei = placaVei;
		this.corVei = corVei;
		this.ano = ano;
	}

	public int getCodVei() {
		return codVei;
	}

	public void setCodVei(int codVei) {
		this.codVei = codVei;
	}

	public String getPlacaVei() {
		return placaVei;
	}

	public void setPlacaVei(String placaVei) {
		this.placaVei = placaVei;
	}

	public String getCorVei() {
		return corVei;
	}

	public void setCorVei(String corVei) {
		this.corVei = corVei;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
}
