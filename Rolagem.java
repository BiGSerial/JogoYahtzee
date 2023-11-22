import java.util.Scanner;

public class Rolagem {
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int[] dadoD = new int[6];
		int[] dadosParaRerolar = new int[6];
		
		Dado d1 = new Dado();
		
		MenuPontos opcoes = new MenuPontos();
		
		int dadoRerolado1 = 0;
		int dadosRerolando;
		
		
	
		for(int i = 0; i<6; i++){
			d1.rolar();
			
			dadoD[i] = d1.getValor();
		}
		
		System.out.println("Dado 1: "+ dadoD[0]);
		System.out.println("Dado 2: "+ dadoD[1]);
		System.out.println("Dado 3: "+ dadoD[2]);
		System.out.println("Dado 4: "+ dadoD[3]);
		System.out.println("Dado 5: "+ dadoD[4]);
		System.out.println("Dado 6: "+ dadoD[5]);
		
		System.out.println("Deseja rerolar algum dado? digite 1 para sim e 0 para não");
		dadoRerolado1 = teclado.nextInt();
		if(dadoRerolado1 == 1){
			int cont = 0;
			while(cont !=6){
			System.out.println("Quais dados deseja rerolar? digite 1-5 para escolher e 6 para encerrar sua escolha");
			cont = teclado.nextInt();
			if(cont == 6){
				break;
			}
			dadosRerolando = cont;
			dadosParaRerolar[0] = dadoD[0];
			dadosParaRerolar[1] = dadoD[1];
			dadosParaRerolar[2] = dadoD[2];
			dadosParaRerolar[3] = dadoD[3];
			dadosParaRerolar[4] = dadoD[4];
			dadosParaRerolar[5] = dadoD[5];
					int i = dadosRerolando;
					d1.rolar();
					dadosParaRerolar[i] = d1.getValor();
			}
		}
		System.out.println("Dados Rerolados: "+dadosParaRerolar[0]);
		System.out.println("Dados Rerolados: "+dadosParaRerolar[1]);
		System.out.println("Dados Rerolados: "+dadosParaRerolar[2]);
		System.out.println("Dados Rerolados: "+dadosParaRerolar[3]);
		System.out.println("Dados Rerolados: "+dadosParaRerolar[4]);
		System.out.println("Dados Rerolados: "+dadosParaRerolar[5]);
		
		opcoes.menu1();
	}

}