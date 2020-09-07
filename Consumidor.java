package fiado;

public class Consumidor {

		
		//Atributos
	   // Modificadores de acesso - Nivel Package -  Podem ser modificados a nivel de pacote
	    //Public(qualquer codigo de qualquer pacote pode modificar), 
	    //Protected, 
	    //Private(Só permite o acesso no nivel da propria classe)
	
		private String nome;
		private int[] fiados;
		private int posicao = 0;
		private String telefone;
		
		//construtor
		public Consumidor(String nome) {
			this.fiados = new int[10];
			this.nome = nome;
			
		}
		
		//GETTER E SETTER- permitem ou restringem algum tipo de operação em atributo.
		
		
		public String getTelefone() {
			return this.telefone;
		}
		
		public void setTelefone(String telefone) {
			this.telefone = telefone;
		}
		
		
		public String getNome() {
			return this.nome;
		}
		
		public void setNome(String nome) {
			this.nome = nome;
		}
		
		
		public void registrarFiado(int valor) {
			this.fiados[posicao] = valor;
			posicao++;
		}
		
		public int getFiado() {
			int total = 0;
			for (int fiado : fiados) {
				total += fiado;
			}
			return total;
		}
		
}
