import java.util.Scanner;

public class Jogador {
	
	String nome;
	String jogada;
	
	
	public Jogador(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setJogada() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Olá jogador " + this.nome + " escolha Papel, Pedra, Tesoura");
		this.jogada = scanner.nextLine();
		
	}
	
	public String getJogada() {
		return this.jogada;
	}
	


}
