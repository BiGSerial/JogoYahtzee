package jogo;
import java.util.Scanner;

public class MenuLogin {
	static Scanner entrada = new Scanner(System.in);
	public static  boolean menu(){
		while(true){
	System.out.println("---Bem vindo ao jogo Yahtzee!!---");
	System.out.println("Voc� deseja:"
			+ "\n1. Login"
			+ "\n2. Cadastro"
			+ "\n");
	int opcao = entrada.nextInt();
	if(opcao==1){
		login();
		return true;
	}else if(opcao==2){
		cadastro();
		
		return true;
	}else{
		System.out.println("Valor inv�lido");
	}
		}
	}
	
	public static void login(){
		String nome, senha;
		System.out.println("---Login---");
		System.out.print("\nNome: ");
		nome = entrada.nextLine();
		System.out.print("\nSenha: ");
		senha = entrada.nextLine();
		
	}
	public static void cadastro(){
		String nome, senha;
		System.out.println("---Cadastro---");
		System.out.print("\nNome: ");
		nome = entrada.nextLine();
		System.out.print("\nSanha: ");
		senha = entrada.nextLine();
		//analizar se tem as informa��es no arquivo e voltar 'true'
		
	}

}

