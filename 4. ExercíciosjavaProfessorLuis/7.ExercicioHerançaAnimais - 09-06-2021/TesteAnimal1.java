package Teste;

public class TesteAnimal1 {
public static void main(String args[]) {
	Cachorro1 animal1 = new Cachorro1("Toto ",5,"Lhasa");
	Cavalo animal2 = new Cavalo("Horse ",10,"Frísio");
	Preguica animal3 = new Preguica("Dorminhoca",2,"Folivora");
	
	animal1.imprimirInfo();
	animal2.imprimirInfo();
	animal3.imprimirInfo();
}
}
