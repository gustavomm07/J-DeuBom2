package Teste;

public class Cachorro1 extends Animal1{

	private String racaCao;
	
	public Cachorro1(String Nome, int idade,String racaCao){
		super (Nome, idade);
		this.racaCao = racaCao;
	}
	
	public void imprimirInfo()
	{
		System.out.println("Nome do cão: "+getNome()+"Idade do cão: "+getIdade()+"A raça do cão é: "+racaCao);
	}

	public String getRacaCao() {
		return racaCao;
	}

	public void setRacaCao(String racaCao) {
		this.racaCao = racaCao;
	}
	
	}
