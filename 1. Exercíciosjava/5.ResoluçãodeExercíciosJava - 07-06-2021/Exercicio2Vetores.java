package VetoreseMatrizes;

import java.util.Scanner;

public class Exercicio2Vetores {
public static void main(String[]args) {
	final int y =6;
	int [] numeros = new int [y];
	int Somapar=0, Somaimpar=0, SomaQualquerUm = 0, ContPar=0; 
	int Contimpar = 0;
	Scanner leia = new Scanner (System.in);
	
	for (int V=0; V<numeros.length; V++) {
		System.out.println("Escreva um n�mero: ");
		numeros [V] = leia.nextInt();
	if (numeros[V]%2==0) {
		
	Somapar = Somapar + numeros [V];
	System.out.println("A quantidade de n�meros pares �: "+V);
	}
	else if (numeros[V]%2==1)
	{
	Somaimpar = Somaimpar + numeros [V];
	System.out.println("A quantidade de n�meros impares �: "+V);
	System.out.println("N�meros impares: ");
	
	}
	else{
		SomaQualquerUm = SomaQualquerUm + numeros [V];
	}
	}
	for (int V=0; V<numeros.length; V++) {
		if(numeros[V]%2 == 0) {
			System.out.println("\n"+numeros[V]+"<--� par");
		}
		else
		{
			System.out.println("\n"+numeros[V]+"<-- � impar");
		}
	System.out.println("A soma de n�meros pares �: "+Somapar);
	System.out.println("A soma de n�meros impares �: "+Somaimpar);
	
	}
	
	
}
}

