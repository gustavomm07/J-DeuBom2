//1.Informar todos os n�meros de 1000 a 1999 que quando divididos por 11 obtemos resto = 5.
package exercicio;

public class Exerc�cio1 {
public static void main(String[]args) {
int numero;

for (numero=1000;numero<=1999; numero++) {
	
	if(numero%11==5) {
		System.out.println(numero);
	}
}
	
}
}
