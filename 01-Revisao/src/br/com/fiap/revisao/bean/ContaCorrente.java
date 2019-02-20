package br.com.fiap.revisao.bean;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/*Classe ContaCorrente: a. Pacote: br.com.fiap.bean b. Deve herdar a classe Conta; 
 * c. Atributos: i. tipo: Enum TipoConta 
 * d. Métodos:  i. depositar: adiciona valor ao saldo; ii. retirar: 
 * Se a conta for comum e o saldo ficar negativo depois do saque deve lançar uma exceção e não permitir a retirada. 
 * e. Construtor: padrão e com todos os atributos. */
public class ContaCorrente extends Conta {

	private TipoConta tipo;

	public ContaCorrente() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ContaCorrente(int agencia, int numero, Calendar dataAbertura, double saldo, TipoConta tipo) {
		super(agencia, numero, dataAbertura, saldo);
		this.tipo = tipo;
	}

	

	@Override
	public void retirar(double valor) throws Exception {
		if (saldo - valor < 0 && tipo == TipoConta.COMUM) {// ATENÇÃO
			throw new Exception("Saldo negativo!");
		}
		saldo -= valor;

	}

	public TipoConta getTipo() {
		return tipo;
	}

	public void setTipo(TipoConta tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		return "número: " + getNumero() + "\n" + "Agencia: " + getAgencia() + "\n" + "Tipo Conta: " + tipo + "\n"
				+ "Saldo: " + saldo + "\n" + "Data abertura: " + sdf.format(getDataAbertura().getTime());
	}

}
