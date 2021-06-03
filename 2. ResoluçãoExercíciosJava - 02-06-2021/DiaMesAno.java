//1. Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e dias e mostre-a expressa apenas em dias. 
package Exercicios;

import java.util.Scanner;

public class DiaMesAno {
	public static void main(String[] args) {
		int dia, mes, ano, idade;
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Escreva o ano: ");
		ano = leia.nextInt();
		
		System.out.println("Escreva o mês: ");
		mes = leia.nextInt();
		
		System.out.println("Escreva o dia: ");
		dia = leia.nextInt();
		
		idade = ano*365 + mes*30 + dia;
		
		System.out.println("dia "+idade);
		
	}
}
