package jogo;

import java.util.Scanner;

public class Dado {
static Scanner teclado = new Scanner(System.in);
    private int ValorFace;
    public void rolar(){
 	   int r = (int)(Math.random()*6);
 	   r = r + 1;
 	   ValorFace = r;
}
    public int getValor(){
 	   return ValorFace;
    }
    public static int[] RolagemDado() {
    	
    	int[] dadoD = new int[5];
		int[] dadosParaRerolar = new int[5];
			
		Dado d1 = new Dado();
		
		int dadoRerolado1 = 0;
		int dadosRerolando;				
	
		for(int i = 0; i<5; i++){
			d1.rolar();
			
			dadoD[i] = d1.getValor();
		}
		
		System.out.println("Dado 1: "+ dadoD[0]);
		System.out.println("Dado 2: "+ dadoD[1]);
		System.out.println("Dado 3: "+ dadoD[2]);
		System.out.println("Dado 4: "+ dadoD[3]);
		System.out.println("Dado 5: "+ dadoD[4]);
			
		dadosParaRerolar[0] = dadoD[0];
		dadosParaRerolar[1] = dadoD[1];
		dadosParaRerolar[2] = dadoD[2];
		dadosParaRerolar[3] = dadoD[3];
		dadosParaRerolar[4] = dadoD[4];	
		System.out.println("Deseja rerolar algum dado? digite 1 para sim e 0 para não");
		dadoRerolado1 = teclado.nextInt();
		
		if(dadoRerolado1 == 1){
			int contadorWhile = 0;

			for(int t = 0; t<3; t++){
			contadorWhile++;
			int cont = 0;
			while(cont !=6){
			System.out.println("Quais dados deseja rerolar? digite 1-5 para escolher e 6 para encerrar sua escolha");
			cont = teclado.nextInt();
			if(cont == 6){
				break;
			}
			dadosRerolando = cont;
			
					int i = dadosRerolando;
					d1.rolar();
					dadosParaRerolar[i-1] = d1.getValor();
			}
			System.out.println("Dados Rerolados: "+dadosParaRerolar[0]);
			System.out.println("Dados Rerolados: "+dadosParaRerolar[1]);
			System.out.println("Dados Rerolados: "+dadosParaRerolar[2]);
			System.out.println("Dados Rerolados: "+dadosParaRerolar[3]);
			System.out.println("Dados Rerolados: "+dadosParaRerolar[4]);
			
			if(contadorWhile == 2) {
				break;
			}
			System.out.println("Deseja rerolar algum dado novamente? 1 para sim, 2 para não");
			cont = teclado.nextInt();
			if(cont == 2) {
				break;
			}
		}
		}else {
			System.out.println("");
		}
		return dadosParaRerolar;
    }
}
