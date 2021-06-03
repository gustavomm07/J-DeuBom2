//2.Faça um programa que entre com três números e coloque em ordem crescente.
package Exercicios030621;

import java.util.Scanner;

public class Atividade2 {
	public static void main(String[] args) {
		int A,B,C;
		
		Scanner leia = new Scanner (System.in);
		System.out.println("Escreva o número referente a letra A: ");
		A = leia.nextInt();
		System.out.println("Escreva o número referente a letra B: ");
		B = leia.nextInt();
		System.out.println("Escreva o número referente a letra C: ");
		C = leia.nextInt();
		
		if(A>B && A>C && B>C) {
			System.out.println("C é: "+C+" B é: "+B+" A é: "+A);
			}
		else if(A>B && A>C && C>B) {
			System.out.println("B é: "+B+" C é: "+C+" A é: "+A);
			}
			else if(B>A && B>C && A>C) {
				System.out.println("C é: "+C+" A é: "+A+" B é: "+B);
				}
			else if(B>A && B>C && C>A) {
				System.out.println("A é: "+A+" C é: "+C+" B é: "+B);
				}
			else if(C>A && C>B && A>B) {
				System.out.println("B é: "+B+" A é: "+A+" C é: "+C);
				}
			else if(C>=A && C>B && A>B) {
				System.out.println("B é: "+B+" A é: "+A+" C é: "+C);
				}
			else if(B>=A && B>C && A>C) {
				System.out.println("C é: "+C+" A é: "+A+" B é: "+B);
				}
			else {
				System.out.println("A é: "+A+" B é: "+B+" C é: "+C);
				}
	}
}
