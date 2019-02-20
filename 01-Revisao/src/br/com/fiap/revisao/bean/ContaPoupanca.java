package br.com.fiap.revisao.bean;

/*ii. retirar: verifica se o saldo é suficiente, se for deve descontar também a Taxa de retirada; 
 * iii. calculaRetornoInvestimento: retorna o valor do saldo vezes o rendimento; f. Construtor: padrão e com todos os atributos. 
6. No método Main, crie uma ContaCorrente e uma ContaPoupanca com valores para todos os atributos; 
 
7. Crie uma lista de ContaCorrente e adicione 3 contas. Depois, exiba os saldos de todas as contas. */
public class ContaPoupanca extends Conta implements ContaInvestimento {

	private float taxa;
	private static final float RENDIMENTO = (float) 0.05;

	public ContaPoupanca() {
		super();
	}

	public ContaPoupanca(float taxa) {
		super();
		this.taxa = taxa;
	}


	@Override
	public void retirar(double valor) throws Exception {
		if (saldo - valor - taxa < 0) {
			throw new Exception("Saldo negativo!");
		}
		saldo -= valor + taxa;

	}

	@Override
	public double calculaRetornoInvestimento() {
		return  saldo * RENDIMENTO;

	}

	public float getTaxa() {
		return taxa;
	}

	public void setTaxa(float taxa) {
		this.taxa = taxa;
	}

}
