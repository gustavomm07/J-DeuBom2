package Collection1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;

public class ListaMercado {
	public static void main(String args[]) {
	String a;
	String b;
	String c;
	String d;
	String verifica;
	String novo;
	int opcao1;
	int opcao;
	
	Scanner ler = new Scanner(System.in);
	
	Collection<String> produtos = new ArrayList();
	System.out.println("Digite um produto: ");
	a = ler.next();
	produtos.add(a);
	System.out.println("Digite outro produto: ");
	b = ler.next();
	produtos.add(b);
	System.out.println("Digite um ultimo produto: ");
	c = ler.next();
	produtos.add(c);
	
	System.out.print("Os produtos em estoque são: "+produtos);
	System.out.println("--Agora escolha uma opção:--");
	System.out.println("(1) Adicionar itens da lista\n(2) Remover item da lista\n(3)Atualizar item da lista ");
	opcao = ler.nextInt();
	
	switch(opcao) {
	case 1: 
		System.out.println("Digite mais um item:");
		d = ler.next();
		Collection<String> produtos2 = Arrays.asList(d);
		produtos.addAll(produtos2);
		System.out.println("Sua nova lista é: "+produtos);
		break;
	case 2:
		System.out.println("escolha remover:\n1 - primeiro item\n2 - segundo item\n3 - Terceiro item");
		opcao1 = ler.nextInt();
		if (opcao1 == 1) {
		produtos.remove(a);
		System.out.println("A lista de produtos agora é:"+produtos);
		}
		else if (opcao1 == 2) {
			produtos.remove(b);
			System.out.println("A lista de produtos agora é:"+produtos);
		}
		else{
			produtos.remove(c);
			System.out.println("A lista de produtos agora é:"+produtos);
		}
		break;
	case 3:
		ler.nextLine();
		System.out.println("Digite o produto que quer atualizar:");
		verifica = ler.nextLine();
		
		System.out.println("Digite o produto que entrará no lugar:");
		novo = ler.nextLine();
		if(produtos.contains(verifica)) {
			produtos.remove(verifica);
			produtos.add(novo);
		}
		else {
			System.out.println("Produto não existe no estoque");
		}
		System.out.println(produtos);
		break;
	}
	}
	
}
