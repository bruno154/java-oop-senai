import java.util.Scanner;

public class Jogador {
	
	String nome;
	int jogada;
	String[] escolhas = {"Pedra", "Papel", "Tesoura"};
	
	
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
		
		System.out.println("-=--=--=--=--=--=--=--=--=--=--=--=--=-");
		System.out.print("Olá jogador " + this.nome + " faça sua jogada\n1. Pedra\n2. Papel\n3. Tesoura\nSua escolha: ");
		this.jogada = scanner.nextInt();
		System.out.println("Muito bem " + this.nome + ", você jogou " + escolhas[jogada - 1] );
		
	}
	
	public int getJogada() {
		return this.jogada;
	}
	

}
