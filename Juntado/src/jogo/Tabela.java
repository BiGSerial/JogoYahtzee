package jogo;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

import Rolagem;

public class Tabela {
	static Scanner entrada = new Scanner(System.in);
	
	public static void tabela(){
		MenuLogin login = new MenuLogin();
		Rolagem ponto = new Rolagem();
	 String nome, senha;
     PrintWriter infoLogin = null;

     try {
         
         FileWriter arquivoLogin = new FileWriter("Tabela.txt", true);

         //login.cadastro(); ->puxar o nome do jogador
         infoLogin = new PrintWriter(arquivoLogin);

         infoLogin.println("");
         for (int n=0;n<13;n++){
        	 infoLogin.println(ponto.tabelaDePontuacao());
        	 infoLogin.println(login.cadastro());
        	 
          
         
         }
         
     } catch (Exception e) {
         e.printStackTrace();
     } finally {
         if (infoLogin != null) {
             infoLogin.close();
         }
     }
     System.out.println("Cadastro feito com sucesso ");
 }

}
