package Teste;

public class Animal1 {
private String Nome;
private int idade;

public Animal1 (String Nome, int idade) {
	super();
	this.idade = idade;
	this.Nome = Nome;	
}

public String getNome() {
	return Nome;
}

public void setNome(String nome) {
	Nome = nome;
}

public int getIdade() {
	return idade;
}

public void setIdade(int idade) {
	this.idade = idade;
}
}
