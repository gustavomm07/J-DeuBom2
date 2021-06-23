package VetoreseMatrizes;

import java.util.Scanner;

public class Exercicio3Matriz {
public static void main(String[]args){
	final int linha = 4, coluna=4;
	int [][] numeros = new int [linha][coluna];
	int l, c, Soma = 0, totaldenumeros = 0,conte=0;
	Scanner leia = new Scanner (System.in);
	
	for(l=0; l<numeros.length;l++)
	{
	for(c=0; c<numeros.length;c++) {
	System.out.println("Coloque um valor qualquer: ");
	numeros[l][c] = leia.nextInt();
	
	if (numeros[l][c]>10) {
		conte++;
		
	}
	System.out.println("A quantidade de números maiores que 10 são: "+conte);
	}
}
}
}