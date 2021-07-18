//1. Faça um programa que receba três inteiros e diga qual deles é o maior.
package Exercicios030621;

import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		int A,B,C;
		
		Scanner leia = new Scanner (System.in);
		System.out.println("Escreva o número referente a letra A: ");
		A = leia.nextInt();
		System.out.println("Escreva o número referente a letra B: ");
		B = leia.nextInt();
		System.out.println("Escreva o número referente a letra C: ");
		C = leia.nextInt();
		
		if(A>B && A>C) {
		System.out.println("A é o maior número");
		}
		else if(B>A && B>C) {
			System.out.println("B é o maior número");
			}
		else {
			System.out.println("C é o maior número");
			}

	}

}
