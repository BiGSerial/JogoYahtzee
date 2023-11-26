package jogo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Scanner;

public class Tabela {
    static Scanner entrada = new Scanner(System.in);

    public static void tabela(List<int[]> listaPontos) {
        MenuLogin login = new MenuLogin();
        Ponto ponto = new Ponto();
        Jogo jogo1 = new Jogo();
        Jogo jogo2 = new Jogo();
        PrintWriter infotabela = null;
        String nome, senha;

        try {
            FileWriter arquivotabela = new FileWriter("Tabela.txt", true);

            infotabela = new PrintWriter(arquivotabela);

            
            infotabela.println("Nome | P1 | P2 | P3 | P4 | P5 | P6 | BONUS | P7 | P8 | P9 | P10 | P11 | 12 | 13 | TOTAL");
            for (int n = 0; n < listaPontos.size(); n++) {
                int[] pontos = listaPontos.get(n);
                
                StringBuilder linhaPontos = new StringBuilder();
                for (int i = 0; i < pontos.length; i++) {
                	
                    linhaPontos.append(ponto).append(" | ");
                }

                infotabela.println(linhaPontos.toString()); 
            }
        } catch (Exception e) {
            System.err.println("ERRO");
        } finally {
            if (infotabela != null) {
            	infotabela.close();
            }
        }
        System.out.println("Cadastro feito com sucesso ");
    }

    public static void mostrarTabela() {
        String nomeArquivo = "Tabela.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(nomeArquivo))) {
            String linha;

            System.out.println("Nome | P1 | P2 | P3 | P4 | P5 | P6 | BONUS | P7 | P8 | P9 | P10 | P11 | 12 | 13 | TOTAL");

            String cabecalhos = br.readLine();
            if (cabecalhos != null) {
                System.out.println(cabecalhos);
            }

            while ((linha = br.readLine()) != null) {
                System.out.println(linha);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } 
    }
}

