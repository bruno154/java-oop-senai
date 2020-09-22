import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		//Criando Jogador1
		Scanner scanner1 = new Scanner(System.in);
		System.out.print("Informe o nome do Jogador1:");
		String nome1 = scanner1.nextLine();
		Jogador jogador1 = new Jogador(nome1);
		
		
		//Criando Jogador2
		Scanner scanner2 = new Scanner(System.in);
		System.out.print("Informe o nome do Jogador2:");
		String nome2 = scanner2.nextLine();
		Jogador jogador2 = new Jogador(nome2);
		
		//Jogada1
		jogador1.setJogada();
		String JogadaJogador1 = jogador1.getJogada();
		
		//Jogada2
		jogador2.setJogada();
		String JogadaJogador2 = jogador2.getJogada();

		//Iniciando Jogo
		
		Jogo jogo1 = new Jogo(1);
		String resultado = jogo1.getResultado(JogadaJogador1,JogadaJogador2);
		System.out.println(resultado);
		
	}
	
}

