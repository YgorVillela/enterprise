package br.com.fiap.anotacao;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//Anotação estará presente até a execução
@Retention(RetentionPolicy.RUNTIME)
// Onde é possiível colocar a anotação
@Target(ElementType.FIELD)
public @interface Coluna {

	String nome();

	boolean obrigatorio();

}
