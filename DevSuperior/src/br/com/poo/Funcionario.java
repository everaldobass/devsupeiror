package br.com.poo;

public class Funcionario {
	
	// Atributos - Caracteristicas
	
	public String nome;
	public double valorPorHora;
	public int horas;
	
	
	// Métodos - Comportamentos
	public double total() {
		
		return valorPorHora * horas;
		
	}
	
	

}
