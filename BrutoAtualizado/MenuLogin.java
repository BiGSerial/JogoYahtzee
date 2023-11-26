package jogo;
import java.io.*;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class MenuLogin {

    private static final String USERS_FILE_PATH = "LoginSenha.txt";    

    static {
        File file = new File(USERS_FILE_PATH);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

	static Scanner entrada = new Scanner(System.in);
    
    public static void menu() {
    	ProgramaPrincipal menuPrincipal = new ProgramaPrincipal();
 
        while (true) {
            System.out.print("\n----------\n"
            		+ "\n1. Login"
            		+ "\n2. Cadastro"
            		+ "\n3. Voltar ao menu inicial"
            		+ "\nVocê deseja: ");
            int opcao = entrada.nextInt();
            
            if (opcao == 1) {
                if (login()==true) {             
                    //Rolagem.menuJogo();
                	Jogo.jogo();
                    break;
                }else {
                    System.out.println("Login inválido, se não tiver tente se cadastrar!");
                    menu();   
                }
            } else if (opcao == 2) {
            	cadastro();
            	
            }else if(opcao == 3){
            	menuPrincipal.menuInicial();
            	System.out.println("Obrigada por jogar!");
            	break;
            	
            } else {
                System.out.println("Valor inválido!!");
                break;
            }
        }
    }

    public static boolean login() {
        boolean resultado = false;
        String nome, senha;

        System.out.println("\n---Login---");
        System.out.print("\nNome: ");
        entrada.nextLine();
        nome = entrada.nextLine();
        System.out.print("\nSenha: ");
        senha = entrada.nextLine();

        String linha;
        String infoFunc[];
        Scanner scanner = null; 

        try {
            FileReader fr = new FileReader(USERS_FILE_PATH);
            scanner = new Scanner(fr);

            while (scanner.hasNext()) {
                linha = scanner.nextLine();
                infoFunc = linha.split("/");

                if (infoFunc[0].equals(nome) && infoFunc[1].equals(hashPassword(infoFunc[0]+senha))) {
                    resultado = true;
                    break; 
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }
        return resultado;
    }

    public static String cadastro() {
        String nome="", senha;
        PrintWriter infoLogin = null;

        try {
            FileWriter arquivoLogin = new FileWriter(USERS_FILE_PATH, true);

            infoLogin = new PrintWriter(arquivoLogin);

            System.out.println("---Cadastro---");
            System.out.print("\nNome: ");
            entrada.nextLine(); 
            nome = entrada.nextLine();
            System.out.print("\nSenha: ");
            senha = entrada.nextLine();
            infoLogin.println(nome + "/" + hashPassword(nome + senha));

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (infoLogin != null) {
                infoLogin.close();
            }
        }
        System.out.println("Cadastro feito com sucesso ");
		return nome;
		
    }

    private static String hashPassword(String password) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hashedBytes = digest.digest(password.getBytes());

            StringBuilder hexString = new StringBuilder();
            for (byte b : hashedBytes) {
                String hex = Integer.toHexString(0xff & b);
                if (hex.length() == 1) {
                    hexString.append('0');
                }
                hexString.append(hex);
            }
            
            return hexString.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
        
    }
}


