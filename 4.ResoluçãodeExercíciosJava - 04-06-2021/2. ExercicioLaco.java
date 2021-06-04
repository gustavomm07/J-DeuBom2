//3.Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de...
package exercicio;

import java.util.Scanner;

public class Ex2 {
	public static void main (String[]args) {
		int idade = 0, contador=0, soma = 0, contador2 = 0;
		Scanner leia = new Scanner(System.in);
		System.out.println("Escreva uma idade: ");
		idade = leia.nextInt();
		
		while(idade!=-99) {
		
		if (idade>0 && idade<=21) 
		{
			contador++;
		}
		if (idade>50) 
		{
			contador2++;
		}
		
		System.out.println("Escreva uma idade: ");
		idade = leia.nextInt();
		
		}
		System.out.println("Pessoas com menos de 21 anos: "+contador);
		System.out.println("Pessoas com mais de 50 anos: "+contador2);
	}
		}

