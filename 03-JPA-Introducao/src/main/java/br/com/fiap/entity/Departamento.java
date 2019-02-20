package br.com.fiap.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "T_DEPARTAMENTO")
@SequenceGenerator(name = "depto", sequenceName = "SQ_T_DEPARTAMENTO", allocationSize = 1)
public class Departamento {

	@Id
	@Column(name = "cd_departamento")
	@GeneratedValue(generator = "depto", strategy = GenerationType.SEQUENCE)
	private int codigo;

	@Column(name = "nm_departamento", nullable = false, length = 100)
	private String nome;

	@Column(name = "dt_criacao")
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar criacao;

	@Column(name = "ds_tipo")
	@Enumerated(EnumType.STRING)
	private Tipo tipo;

	@Column(name = "vl_orcamento")
	private float orcamento;

	@Lob
	@Column(name = "fl_contrato")
	private byte[] foto;

	public Departamento(int codigo, String nome, Calendar criacao, Tipo tipo, float orcamento, byte[] foto) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.criacao = criacao;
		this.tipo = tipo;
		this.orcamento = orcamento;
		this.foto = foto;
	}

	public Departamento(String nome, Calendar criacao, Tipo tipo, float orcamento, byte[] foto) {
		super();
		this.nome = nome;
		this.criacao = criacao;
		this.tipo = tipo;
		this.orcamento = orcamento;
		this.foto = foto;
	}

	public Departamento() {
		super();
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Calendar getCriacao() {
		return criacao;
	}

	public void setCriacao(Calendar criacao) {
		this.criacao = criacao;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	public byte[] getFoto() {
		return foto;
	}

	public void setFoto(byte[] foto) {
		this.foto = foto;
	}

	public float getOrcamento() {
		return orcamento;
	}

	public void setOrcamento(float orcamento) {
		this.orcamento = orcamento;
	}

}
