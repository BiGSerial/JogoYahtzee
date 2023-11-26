package jogo;

import java.util.Scanner;

public class Jogo {
	static Scanner scanner = new Scanner(System.in);
	public static void jogo() {
		Ponto ponto = new Ponto();
		Jogador jogador1 = new Jogador();
		Jogador jogador2 = new Jogador();
		System.out.print("---BEM VINDO AO JOGO---");
		
		String nomej1 = jogador1.nome();
		String nomej2 = jogador2.nome();
		
		for(int p=0; p<=26;p++) {
			System.out.println("Vez do "+nomej1);
			jogador1.ponto();
			System.out.println("Vez do "+nomej2);
			jogador2.ponto();
			
		}
		//
		//int total = Jogador.ponto();		
		
		
		Tabela.tabela(null);
		// mostrar o ganhador
		System.out.print("Fim!");
		
	}
	

}
