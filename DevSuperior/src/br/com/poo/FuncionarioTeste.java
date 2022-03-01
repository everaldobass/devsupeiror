package br.com.poo;

import java.util.Locale;
import java.util.Scanner;

public class FuncionarioTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
	
		Scanner entrada = new Scanner(System.in);
		
		Funcionario f1, f2;
		
		f1 = new Funcionario();
		f2 = new Funcionario();
		
		System.out.println("Dados do primeiro funcionário: ");
		f1.nome = entrada.next();
		f1.valorPorHora = entrada.nextDouble();
		f1.horas = entrada.nextInt();
		
		System.out.println("Dados do segundo funcionário: ");
		f2.nome = entrada.next();
		f2.valorPorHora = entrada.nextDouble();
		f2.horas = entrada.nextInt();
		
		double total = f1.total() + f2.total();
		System.out.printf("Total = %.2f%n", total);
		
			

	}

}
