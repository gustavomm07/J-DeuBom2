package ClassesObjetos;

public class Avi�o {
	private int ano;
	private String modelo;
	private String criador;

	public Avi�o (String criador, int ano,String modelo)
	{
		this.criador = criador;
		this.modelo = modelo;
		this.ano = ano;
	}
	public void imprimirInfo()
	{
		System.out.println("Criador do avi�o: "+criador+"\nModelo:"+modelo+"\nano: "+ano);
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getCriador() {
		return criador;
	}
	public void setCriador(String criador) {
		this.criador = criador;
	}
}
