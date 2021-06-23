package teste2;

import java.util.Scanner;

public class TesteAnimal2 {
public static void main(String[]args) {
Scanner leia = new Scanner(System.in);

Cachorro2 cachorro = new Cachorro2();
Cavalo2 cavalo = new Cavalo2();
Preguica2 preguica = new Preguica2();

Animal animal = null;

int x=0;
do
{
	System.out.println("\nEscolha um animal, sendo 1 para cão, 2 para cavalo e 3 para preguiça");
	x= leia.nextInt();
	
if(x==1)
{
	System.out.println("\nQual o tipo do seu animal???\n\n1-Cachorro\n2-Cavalo\n3-Preguiça\n");
	x = leia.nextInt();
	if(x==1)
		Animal animal = null;
	
	int x;
	do
	{
		System.out.println("\nQual o tipo do seu animal???\n\n1-Cachorro\n2-Cavalo\n3-Preguiça\n");
		x = leia.nextInt();
		if(x==1)
		{
			animal=cachorro;
			System.out.println("\nQual o nome do seu cachorro?");
			String nome = leia.next();
			System.out.println("\nQuantos anos seu cachorro tem?");
			int idade = leia.nextInt();
			System.out.println("\nEssa é legal!!!Qual o som que seu cachorro emite?");
			String som = leia.next();
			System.out.println("------------------------------------------------------");
			cachorro.Nome(nome);
			cachorro.Idade(idade);
			cachorro.Som(som);
			cachorro.Corre();
		}
		else if(x==2)
		{
			animal=cavalo;
			System.out.println("\nQual o nome do seu cavalo?");
			String nome = leia.next();
			System.out.println("\nQuantos anos seu cavalo tem?");
			int idade = leia.nextInt();
			System.out.println("\nEssa é legal!!!Qual o som que seu cavalo emite?");
			String som = leia.next();
			System.out.println("------------------------------------------------------");
			cavalo.Nome(nome);
			cavalo.Idade(idade);
			cavalo.Som(som);
			cavalo.Corre();
		}
		else if(x==3)
		{
			animal=preguica;
			System.out.println("\nQual o nome da sua preguiça?");
			String nome = leia.next();
			System.out.println("\nQuantos anos sua preguiça tem?");
			int idade = leia.nextInt();
			System.out.println("\nEssa é legal!!!Qual o som que sua preguiça emite?");
			String som = leia.next();
			System.out.println("------------------------------------------------------");
			preguica.Nome(nome);
			preguica.Idade(idade);
			preguica.Som(som);
			preguica.subirArvores();
		}
		else
		{
			System.out.println("\nInformação Inválida!!!");
		}
	}
	while(x<=0 || x>=4);
}

}

