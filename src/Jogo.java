
public class Jogo {
	
	int numeroJogo;
	String resultado;
	
	public Jogo(int numeroJogo) {
		this.numeroJogo = numeroJogo;
	}


	public String getResultado(int JogadaJogador1, int JogadaJogador2) {
		
		if(JogadaJogador1== 1 && JogadaJogador2== 1) {
			this.resultado = "Empate!!!";	
			
		} else if (JogadaJogador1 == 1 && JogadaJogador2== 2) {
			this.resultado = "Jogador2 Ganhou!!!";
			return this.resultado;
			
		} else if (JogadaJogador1 == 1 && JogadaJogador2 == 3) {
			this.resultado = "Jogador1 Ganhou!!!";
			return this.resultado;
		
		}else if (JogadaJogador1== 2 && JogadaJogador2== 1) {
			this.resultado = "Jogador1 Ganhou!!!";
			return this.resultado;
			
		}else if (JogadaJogador1 == 2 && JogadaJogador2== 2) {
			this.resultado = "Empate!!!";
			return this.resultado;
			
		}else if (JogadaJogador1 == 2 && JogadaJogador2== 3) {
			this.resultado = "Jogador2 Ganhou!!!";
			return this.resultado;
			
		}else if (JogadaJogador1 == 3 && JogadaJogador2== 1) {
			this.resultado = "Jogador2 Ganhou!!!";
			return this.resultado;
			
		}else if (JogadaJogador1 == 3 && JogadaJogador2== 2) {
			this.resultado = "Jogador1 Ganhou!!!";
			return this.resultado;
			
		}else if (JogadaJogador1 == 3 && JogadaJogador2== 3) {
			this.resultado = "Empate!!!";
			return this.resultado;
			
		}
		return this.resultado;
		
	}

}
