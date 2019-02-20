package br.com.fiap.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name="T_FORNECEDOR")
@SequenceGenerator(name="fornecedor",sequenceName = "SQ_T_FORNECEDOR", allocationSize = 1)
public class Fornecedor {
	/*
	 * 
	 * T_FORNECEDOR
	 * 
	 * CD_FORNECEDOR(PK)
	 * NM_FORNECEDOR
	 * NR_CNPJ
	 * DT_REGISTRO
	 * DS_TIPO(ENUM ATACADO, VAREJO)
	 * 
	 * */
	@Id
	@Column(name="cd_fornecedor")
	@GeneratedValue(generator = "fornecedor", strategy = GenerationType.SEQUENCE)
	private int codFornecedor;
	
	@Column(name="nm_fornecedor", nullable = false, length = 100)
	private String fornecedor;
	
	@Column(name="nr_cnpj", nullable = false)
	private int cnpj;
	
	@CreationTimestamp
	@Column(name="dt_registro")
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar dtRegistro;
	
	@Enumerated(EnumType.STRING) //OBRIGATÓRIO PARA ENUM CASO ELE SEJA STRING
	@Column(name="ds_tipo")
	private Tipo tipo;
	
	
	public Fornecedor() {
		super();
	}
	
	public Fornecedor(String fornecedor, int cnpj, Tipo tipo) {
		super();
		this.fornecedor = fornecedor;
		this.cnpj = cnpj;
		this.tipo = tipo;
	}

	public Fornecedor(int codFornecedor, String fornecedor, int cnpj, Calendar dtRegistro, Tipo tipo) {
		super();
		this.codFornecedor = codFornecedor;
		this.fornecedor = fornecedor;
		this.cnpj = cnpj;
		this.dtRegistro = dtRegistro;
		this.tipo = tipo;
	}
	

	public int getCodFornecedor() {
		return codFornecedor;
	}
	public Fornecedor(int codFornecedor, String fornecedor, int cnpj, Tipo tipo) {
		super();
		this.codFornecedor = codFornecedor;
		this.fornecedor = fornecedor;
		this.cnpj = cnpj;
		this.tipo = tipo;
	}

	public void setCodFornecedor(int codFornecedor) {
		this.codFornecedor = codFornecedor;
	}
	public String getFornecedor() {
		return fornecedor;
	}
	public void setFornecedor(String fornecedor) {
		this.fornecedor = fornecedor;
	}
	public int getCnpj() {
		return cnpj;
	}
	public void setCnpj(int cnpj) {
		this.cnpj = cnpj;
	}
	public Calendar getDtRegistro() {
		return dtRegistro;
	}
	public void setDtRegistro(Calendar dtRegistro) {
		this.dtRegistro = dtRegistro;
	}
	public Tipo getTipo() {
		return tipo;
	}
	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	public String toString() {
		return "Código: " + codFornecedor + "\n" + "Fornecedor: " + fornecedor + "\n" + "CNPJ: " + cnpj + "\n" + 
				"Data de Registro: " + dtRegistro + "\n" + "Tipo: " + tipo;
	}
}
