package jogo.view;

import java.util.Scanner;
import jogo.controller.*;

public class Menus {

    private static final Scanner entrada = new Scanner(System.in);
    private static boolean executarJogo = true;

    public static int capturarEscolha() {
        System.out.println(" ");
        System.out.print("Escolha uma opção: ");
        return entrada.nextInt();
    }

    public static void menuInicial() {
      
        while (executarJogo)
        {             
            System.out.println("Bem-vindo ao Jogo Yahtzee!");
            System.out.println("Escolha uma opção:");
            System.out.println("1. Entrar (Logar)");
            System.out.println("2. Cadastrar");
            System.out.println("0. Sair");            
            
            switch (capturarEscolha()) {
                case 1:
                    System.out.println("Obrigado por Jogar conosco.");
                    break;
                case 2:
                    limparTela();
                    LoginController.cadastro();
                    break;
                case 0:
                    limparTela();
                    System.out.println("Obrigado por Jogar conosco.");
                    executarJogo = false;
                    break;
                default:                    
                    System.out.println("Opção Inválida.");
                    break;                
            }

        };
        
    }

    public static void limparTela() {
        for (int i = 0; i < 50; ++i) System.out.println(); // Simula uma "limpeza" da tela
    }

    public static void MenuLogin()
    {

    }
}
