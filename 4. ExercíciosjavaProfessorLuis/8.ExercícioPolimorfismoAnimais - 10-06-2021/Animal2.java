package teste2;

public abstract class Animal2 {
	
	private String tipoAnimal;
	
	abstract public void Nome(String nomeAnimal);
	abstract public void Idade(int idadeAnimal);
	abstract public void Som(String somAnimal);
	
	public Animal2(String tipoAnimal)
	{
		this.tipoAnimal = tipoAnimal;
	}
	
	public String getTipoAnimal() {
		return tipoAnimal;
	}
	public void setTipoAnimal(String tipoAnimal) {
		this.tipoAnimal = tipoAnimal;
	}
	
	
}