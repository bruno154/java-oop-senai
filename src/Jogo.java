
public class Jogo {
	
	int numeroJogo;
	String resultado;
	
	public Jogo(int numeroJogo) {
		this.numeroJogo = numeroJogo;
	}


	public String getResultado(String JogadaJogador1, String JogadaJogador2) {
		
		if(JogadaJogador1=="Papel" && JogadaJogador2=="Pedra") {
			this.resultado = "Jogador1 Ganhou!!!";	
			
		} else if (JogadaJogador1 == "Tesoura" && JogadaJogador2=="Pedra") {
			this.resultado = "Jogador2 Ganhou!!!";
			return this.resultado;
			
		} else if (JogadaJogador1== "Pedra" && JogadaJogador2=="Pedra") {
			this.resultado = "Empate!!!";
			return this.resultado;
			
		}else if (JogadaJogador1=="Pedra" && JogadaJogador2=="Papel") {
			this.resultado = "Jogador2 Ganhou!!!";
			return this.resultado;
			
		}else if (JogadaJogador1 =="Pedra" && JogadaJogador2=="Tesoura") {
			this.resultado = "Jogador1 Ganhou!!!";
			return this.resultado;
			
		}else if (JogadaJogador1 == "Papel" && JogadaJogador2=="Papel") {
			this.resultado = "Empate!!!";
			return this.resultado;
			
		}else if (JogadaJogador1 == "Papel" && JogadaJogador2=="Tesoura") {
			this.resultado = "Jogador2 Ganhou!!!";
			return this.resultado;
			
		}else if (JogadaJogador1 == "Tesoura" && JogadaJogador2=="Papel") {
			this.resultado = "Jogador1 Ganhou!!!";
			return this.resultado;
			
		}else if (JogadaJogador1 == "Tesoura" && JogadaJogador2=="Tesoura") {
			this.resultado = "Empate!!!";
			return this.resultado;
			
		}
		return this.resultado;
		
	}

}
