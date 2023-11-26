package jogo;
import java.util.Scanner;

public class Jogador {
	static Scanner scanner = new Scanner(System.in);
	public static int[] ponto() {
		
		int [] tabelaPontos = Ponto.ContPonto();
		return tabelaPontos;
		
	}
	
	public String nome() {
		System.out.print("Digite o nome do jogador: ");
		String nome = scanner.nextLine();
		return nome;
	}
}
