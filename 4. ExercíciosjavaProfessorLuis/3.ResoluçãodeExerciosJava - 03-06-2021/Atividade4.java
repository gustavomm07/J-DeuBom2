//4. Faça um programa em que permita a entrada de um número qualquer e exiba se este número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for ímpar exiba o número elevado ao quadrado.
package Exercicios030621;

import java.util.Scanner;

public class Atividade4 {
public static void main(String[]args) {
	int idade = 0, valor;
	
	Scanner leia = new Scanner(System.in);
	System.out.println("Escreva uma idade: ");
	idade = leia.nextInt();
			
	if(idade% 2 == 0) {
		System.out.println("Esse número é par");
		valor = (int) Math.sqrt(idade);
		System.out.println("A raiz desse número é: "+valor);
		}
		else {
			System.out.println("Esse número é impar");
			valor = (int) Math.pow(idade, 2);
			System.out.println("A potência desse número é: "+valor);
			}
}
}
