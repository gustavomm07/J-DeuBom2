package Teste;

public class Preguica extends Animal1{

	private String NomeCientifico;
	
	public Preguica(String Nome, int idade, String NomeCientifico)
	{
		super (Nome, idade);
		this.NomeCientifico = NomeCientifico;
	}
	public void imprimirInfo()
	{
		System.out.println("Nome do preguiça: "+getNome()+"Idade do preguiça: "+getIdade()+"O nome ciêntificico da preguiça é: "+NomeCientifico);
	}
	public String getNomeCientifico() {
		return NomeCientifico;
	}
	public void setNomeCientifico(String nomeCientifico) {
		NomeCientifico = nomeCientifico;
	}

	}
	
	
