//1. Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.
package Exercicios030621;

import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		int A,B,C;
		
		Scanner leia = new Scanner (System.in);
		System.out.println("Escreva o n�mero referente a letra A: ");
		A = leia.nextInt();
		System.out.println("Escreva o n�mero referente a letra B: ");
		B = leia.nextInt();
		System.out.println("Escreva o n�mero referente a letra C: ");
		C = leia.nextInt();
		
		if(A>B && A>C) {
		System.out.println("A � o maior n�mero");
		}
		else if(B>A && B>C) {
			System.out.println("B � o maior n�mero");
			}
		else {
			System.out.println("C � o maior n�mero");
			}

	}

}
