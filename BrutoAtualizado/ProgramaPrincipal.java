package jogo;

import java.util.Scanner;

public class ProgramaPrincipal {
	
	static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		MenuLogin login = new MenuLogin();
		
		System.out.println("\n*** Bem vindo ao jogo Yahtzee!! ***");
		
		int opcao = menuInicial();
		
		do{
			switch (opcao) {
			case 1:
				MenuLogin.menu(); 
				break;
			case 2:
				 Tabela.mostrarTabela();
				break;
			case 0:
				System.out.println("Obrigada por jogar!");
				break;
			default: 
				System.out.println("Valor invalido!"); 
				break; 
			}
			break;
		}while(opcao!=0);	
	}
	public static int menuInicial() {
		
		int opcao;
		while (true) {
		System.out.println("\n-----MENU-----\n"
				+ "\n1. Entrar"
				+ "\n2. Ver historico de pontuacao"
				+ "\n0. Sair");
		System.out.print("Digite a sua opcao: ");
		opcao = entrada.nextInt();
		if (opcao <0 && opcao >3) {
			System.out.println("Opcao invalida!");
		}else {
		return opcao; 
		}
		}
	}

}
