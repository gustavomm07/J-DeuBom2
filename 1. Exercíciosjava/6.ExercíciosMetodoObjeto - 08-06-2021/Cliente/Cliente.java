package ClassesObjetos;

public class Cliente {
private int idade;
private String nomeCliente;
private int telefone;

public Cliente (String nomeCliente, int idade, int telefone)
{
	this.nomeCliente = nomeCliente;
	this.idade = idade;
	this.telefone = telefone;
}
public void imprimirInfo()
{
	System.out.println(nomeCliente+"idade:"+idade+"Telefone:"+telefone);
	}
public int getIdade() {
	return idade;
}
public void setIdade(int idade) {
	this.idade = idade;
}
public String getNomeCliente() {
	return nomeCliente;
}
public void setNomeCliente(String nomeCliente) {
	this.nomeCliente = nomeCliente;
}
public int getTelefone() {
	return telefone;
}
public void setTelefone(int telefone) {
	this.telefone = telefone;
}
}


