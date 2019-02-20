package br.com.fiap.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;
@Entity
@Table(name="T_MOTORISTA")
@SequenceGenerator(name="moto", allocationSize = 1)
public class Motorista {
	
	@Id
	@Column(name="nr_carteira")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "moto")
	private int nrCarteira;
	
	@Column(name="nm_motorista", nullable = false, length = 150)
	private String nomeMotorista;
	
	
	@Column(name="dt_nascimento")
	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar dtNascimento;
	
	@Column(name="fl_carteira")
	@Lob
	private byte[] carteira;
	
	@Column(name="ds_genero")
	private Genero genero;

	public Motorista() {
		super();
	}

	public Motorista(String nomeMotorista, Calendar dtNascimento, byte[] carteira, Genero genero) {
		super();
		this.nomeMotorista = nomeMotorista;
		this.dtNascimento = dtNascimento;
		this.carteira = carteira;
		this.genero = genero;
	}

	public int getNrCarteira() {
		return nrCarteira;
	}

	public void setNrCarteira(int nrCarteira) {
		this.nrCarteira = nrCarteira;
	}

	public String getNomeMotorista() {
		return nomeMotorista;
	}

	public void setNomeMotorista(String nomeMotorista) {
		this.nomeMotorista = nomeMotorista;
	}

	public Calendar getDtNascimento() {
		return dtNascimento;
	}

	public void setDtNascimento(Calendar dtNascimento) {
		this.dtNascimento = dtNascimento;
	}

	public byte[] getCarteira() {
		return carteira;
	}

	public void setCarteira(byte[] carteira) {
		this.carteira = carteira;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

}
