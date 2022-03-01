package br.com.aulas;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner entrada = new Scanner(System.in);
		
		String nome1, nome2;
		double valorPorHora1, valorPorHora2, total;
		int horas1, horas2;
		
		System.out.println("Dados do primeiro funcionário: ");
		nome1 = entrada.next();
		valorPorHora1 = entrada.nextDouble();
		horas1 = entrada.nextInt();
		
		System.out.println("Dados do segundo funcionário: ");
		nome2 = entrada.next();
		valorPorHora2 = entrada.nextDouble();
		horas2 = entrada.nextInt();
		
		total = (valorPorHora1 * horas1 + valorPorHora2 + horas2);
		
        System.out.printf("Total = %.2f%n", total);

	}

}
