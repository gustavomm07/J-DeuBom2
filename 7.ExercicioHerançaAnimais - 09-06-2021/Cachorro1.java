package Teste;

public class Cachorro1 extends Animal1{

	private String racaCao;
	
	public Cachorro1(String Nome, int idade,String racaCao){
		super (Nome, idade);
		this.racaCao = racaCao;
	}
	
	public void imprimirInfo()
	{
		System.out.println("Nome do c�o: "+getNome()+"Idade do c�o: "+getIdade()+"A ra�a do c�o �: "+racaCao);
	}

	public String getRacaCao() {
		return racaCao;
	}

	public void setRacaCao(String racaCao) {
		this.racaCao = racaCao;
	}
	
	}
