//4. Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for �mpar exiba o n�mero elevado ao quadrado.
package Exercicios030621;

import java.util.Scanner;

public class Atividade4 {
public static void main(String[]args) {
	int idade = 0, valor;
	
	Scanner leia = new Scanner(System.in);
	System.out.println("Escreva uma idade: ");
	idade = leia.nextInt();
			
	if(idade% 2 == 0) {
		System.out.println("Esse n�mero � par");
		valor = (int) Math.sqrt(idade);
		System.out.println("A raiz desse n�mero �: "+valor);
		}
		else {
			System.out.println("Esse n�mero � impar");
			valor = (int) Math.pow(idade, 2);
			System.out.println("A pot�ncia desse n�mero �: "+valor);
			}
}
}
