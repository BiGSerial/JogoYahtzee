package jogo;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class MenuLogin {
	static Scanner entrada = new Scanner(System.in);

    public static boolean menu() {
    	ProgramaPrincipal ProgramaPrincipal = new ProgramaPrincipal();

        while (true) {
            System.out.print("\n----------\n"
            		+ "\n1. Login"
            		+ "\n2. Cadastro"
            		+ "\n3. Voltar ao menu inicial"
            		+ "\nOpcao deseja: ");
            int opcao = entrada.nextInt();
            
            
            if (opcao == 1) {
                if (login()==true) {
                    System.out.print("voce tem login"); 
                    //Rolagem.MenuJogo();  -> entrar no jogo
                    break;
                }else {
                    System.out.println("Login invalido, se nao tiver tente se cadastrar!");
                    menu();   
                }
                return true;
            } else if (opcao == 2) {
            	cadastro();
            	
                return true;
            }else if(opcao == 3){
            	ProgramaPrincipal.menuInicial();
            	
            } else {
                System.out.println("Valor invalido!!");
                menu();
                break;
            }
        }
		return false;
    }

    public static boolean login() {
        boolean resultado = false;
        String nome, senha;

        System.out.println("\n---Login---");
        System.out.print("\nNome: ");
        entrada.nextLine();
        nome = entrada.nextLine().toLowerCase();
        System.out.print("\nSenha: ");
        senha = entrada.nextLine();

        String linha;
        String infoFunc[];
        Scanner scanner = null; // entrada via arquivo

        try {
            FileReader fr = new FileReader("LoginSenha.txt");
            scanner = new Scanner(fr);

            while (scanner.hasNext()) {
                linha = scanner.nextLine();
                infoFunc = linha.split("/");

                if (nome.equals(infoFunc[0]) && senha.equals(infoFunc[1])) {
                    resultado = true;
                    break; 
                }
            }
        } catch (Exception e) {
        	System.err.println("ERRO");
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }
        return resultado;
    }

    public static void cadastro() {
        String nome, senha;
        PrintWriter infoLogin = null;

        try {
            FileWriter arquivoLogin = new FileWriter("LoginSenha.txt", true);

            infoLogin = new PrintWriter(arquivoLogin);

            System.out.println("---Cadastro---");
            System.out.print("\nNome: ");
            entrada.nextLine(); 
            nome = entrada.nextLine().toLowerCase();
            System.out.print("\nSenha: ");
            senha = entrada.nextLine();
            infoLogin.println(nome + "/" + senha);

        } catch (Exception e) {
            System.err.println("ERRO");;
        } finally {
            if (infoLogin != null) {
                infoLogin.close();
            }
        }
        System.out.println("Cadastro feito com sucesso ");
    }

}

