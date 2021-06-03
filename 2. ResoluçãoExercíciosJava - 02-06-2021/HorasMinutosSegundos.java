//3. Faça um sistema que leia o tempo de duração de um evento em uma fábrica expressa em segundos e mostre-o expresso em horas, minutos e segundos. 
package Exercicios;

import java.util.Scanner;

public class HorasMinutosSegundos {
public static void main (String[]args) {
	int TotalDeSegundos, segundos, minutos, horas;
	
	Scanner leia = new Scanner(System.in);
	System.out.println("Escreva os segundos: ");
	TotalDeSegundos = leia.nextInt();
	
	horas = TotalDeSegundos/3600;
	minutos = TotalDeSegundos%3600/60;
	segundos = TotalDeSegundos%3600%60;
	
	System.out.println("Horas: "+horas+" Minutos: "+minutos+" Segundos: "+segundos);
	
	
}
}
