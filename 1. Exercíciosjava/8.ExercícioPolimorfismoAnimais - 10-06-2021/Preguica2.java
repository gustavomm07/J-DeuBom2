package teste2;

public class Preguica2 extends Animal2{
	
	public Preguica2()
	{
		super("Preguiça");
	}
	
	@Override
	public void Nome(String nomeAnimal)
	{
		System.out.println("\nNome da preguiça: "+nomeAnimal);
	}
	
	@Override
	public void Idade(int idadeAnimal)
	{
		System.out.println("\nIdade: "+idadeAnimal);
	}
	
	@Override
	public void Som(String somAnimal)
	{
		System.out.println("\nSom que a sua preguiça emite: "+somAnimal);
	}
	
	public void subirArvores()
	{
		System.out.println("\nUma das características da preguiça é subir em árvores...");
	}

}

