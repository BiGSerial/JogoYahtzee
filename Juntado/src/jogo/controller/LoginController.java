package jogo.controller;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class LoginController {
    private static final String USERS_FILE_PATH = "LoginSenha.txt";    
    static Scanner entrada = new Scanner(System.in);
    
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

     public static void cadastro() {
        String nome, senha;
        PrintWriter infoLogin = null;

        try {
            // CRIA O ARQUIVO
            FileWriter arquivoLogin = new FileWriter(USERS_FILE_PATH, true);

            // ESCREVE NO ARQUIVO
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
    }

    private static String hashPassword(String password) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hashedBytes = digest.digest(password.getBytes());

            // Converter bytes para representação hexadecimal
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
