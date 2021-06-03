//2. Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a expressa em anos, meses e dias. 
package Exercicios;

import java.util.Scanner;

public class ExpressarAnoMesDia {
	public static void main(String[]args) {
		int ano, mes, dia, idade, diaTotal;
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Escreva o dia: ");
		diaTotal = leia.nextInt();
		
		ano = diaTotal/365;
		mes = diaTotal%365/30;
		dia = diaTotal%365%30;
		
		System.out.println("Dia: "+dia+"Mês: "+mes+"Ano: "+ano);
				
	}

}
