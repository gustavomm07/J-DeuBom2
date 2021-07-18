//3.Faça um programa que receba a idade de uma pessoa e mostre na saída em qual categoria ela se encontra..


package Exercicios030621;

import java.util.Scanner;

public class Atividade3 {
	
	public static void main(String[] args) {
	int idade;
	
	Scanner leia = new Scanner(System.in);
	System.out.println("Escreva uma idade: ");
	idade = leia.nextInt();
	
	if(idade>=18 && idade<=25) {
		System.out.println("Pacote Adulto");
		}
		else if(idade>=15 && idade<=17) {
			System.out.println("Pacote juvenil");
			}
		else if(idade>=10 && idade<=14) {
			System.out.println("Infantil");
			}
		else {
			System.out.println("digite um valor valido!");
			}
	
}
}