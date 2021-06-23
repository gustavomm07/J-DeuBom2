//5. Crie um programa que leia um número do teclado até que encontre um...
package exercicio;

import java.util.Scanner;

public class Exercício3 {
public static void main(String[]args) {
	int numero, soma=0,contador;
	Scanner leia = new Scanner(System.in);
	System.out.println("Escreva um número de 1 a 9:");
	numero = leia.nextInt();
	do
	{
		if(numero>0 && numero<=9){
			soma = soma + numero;
			
		}
		System.out.println("Escreva um número de 1 a 9:");
		numero = leia.nextInt();
		}
	while(numero>0 && numero<=9);
	System.out.println("A soma total é?"+soma);
	}
	}


