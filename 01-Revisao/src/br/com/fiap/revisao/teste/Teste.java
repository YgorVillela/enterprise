package br.com.fiap.revisao.teste;


import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import br.com.fiap.revisao.bean.ContaCorrente;
import br.com.fiap.revisao.bean.ContaPoupanca;
import br.com.fiap.revisao.bean.TipoConta;

/*6. No método Main, crie uma ContaCorrente e uma ContaPoupanca com valores para todos os atributos; 
 
7. Crie uma lista de ContaCorrente e adicione 3 contas. Depois, exiba os saldos de todas as contas. */
public class Teste {

	public static void main(String[] args) {

		ContaCorrente c = new ContaCorrente();
		ContaPoupanca p = new ContaPoupanca();

		Calendar data = new GregorianCalendar(2019, Calendar.FEBRUARY, 06);


		c.setAgencia(5);
		c.setDataAbertura(data);
		c.setNumero(10);
		c.setSaldo(5000);
		c.setTipo(TipoConta.ESPECIAL);

		p.setAgencia(10);
		p.setDataAbertura(data);
		p.setNumero(5);
		p.setSaldo(10000);
		p.setTaxa(50);
              
		
		
		List<ContaCorrente> lista = new ArrayList<ContaCorrente>();
			lista.add(new ContaCorrente(10,321, new GregorianCalendar(1999, Calendar.JANUARY,2),100, TipoConta.ESPECIAL));
			lista.add(new ContaCorrente(10,321, new GregorianCalendar(1999, Calendar.JANUARY,2),100, TipoConta.ESPECIAL));
			lista.add(new ContaCorrente(10,321, new GregorianCalendar(1999, Calendar.JANUARY,2),100, TipoConta.ESPECIAL));
			
			
		for(ContaCorrente c2: lista) {
			System.out.println(c2);
			System.out.println("**********************");
		}
	}

}
