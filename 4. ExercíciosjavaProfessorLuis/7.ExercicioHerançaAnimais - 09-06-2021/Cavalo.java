package Teste;
	public class Cavalo extends Animal1{

		private String racacavalo;
		
		public Cavalo(String Nome, int idade,String racacavalo)
		{
		super (Nome, idade);
		this.racacavalo = racacavalo;
		}
		
		public void imprimirInfo()
		{
			System.out.println("Nome do cavalo: "+getNome()+"Idade do cavalo: "+getIdade()+"A ra�a do cavalo �: "+racacavalo);
		}

		public String getRacacavalo() {
			return racacavalo;
		}

		public void setRacacavalo(String racacavalo) {
			this.racacavalo = racacavalo;
		}
		
		}
