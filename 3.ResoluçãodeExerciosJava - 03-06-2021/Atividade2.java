//2.Fa�a um programa que entre com tr�s n�meros e coloque em ordem crescente.
package Exercicios030621;

import java.util.Scanner;

public class Atividade2 {
	public static void main(String[] args) {
		int A,B,C;
		
		Scanner leia = new Scanner (System.in);
		System.out.println("Escreva o n�mero referente a letra A: ");
		A = leia.nextInt();
		System.out.println("Escreva o n�mero referente a letra B: ");
		B = leia.nextInt();
		System.out.println("Escreva o n�mero referente a letra C: ");
		C = leia.nextInt();
		
		if(A>B && A>C && B>C) {
			System.out.println("C �: "+C+" B �: "+B+" A �: "+A);
			}
		else if(A>B && A>C && C>B) {
			System.out.println("B �: "+B+" C �: "+C+" A �: "+A);
			}
			else if(B>A && B>C && A>C) {
				System.out.println("C �: "+C+" A �: "+A+" B �: "+B);
				}
			else if(B>A && B>C && C>A) {
				System.out.println("A �: "+A+" C �: "+C+" B �: "+B);
				}
			else if(C>A && C>B && A>B) {
				System.out.println("B �: "+B+" A �: "+A+" C �: "+C);
				}
			else if(C>=A && C>B && A>B) {
				System.out.println("B �: "+B+" A �: "+A+" C �: "+C);
				}
			else if(B>=A && B>C && A>C) {
				System.out.println("C �: "+C+" A �: "+A+" B �: "+B);
				}
			else {
				System.out.println("A �: "+A+" B �: "+B+" C �: "+C);
				}
	}
}
