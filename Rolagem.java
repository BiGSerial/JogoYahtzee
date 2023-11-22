import java.util.Scanner;

public class Rolagem {
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int[] dadoD = new int[6];
		int[] dadosParaRerolar = new int[6];
		
		Dado d1 = new Dado();
		
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
		
		
		dadosParaRerolar[0] = dadoD[0];
		dadosParaRerolar[1] = dadoD[1];
		dadosParaRerolar[2] = dadoD[2];
		dadosParaRerolar[3] = dadoD[3];
		dadosParaRerolar[4] = dadoD[4];
		dadosParaRerolar[5] = dadoD[5];
		
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
		
		menu1(dadosParaRerolar);
	}
	
	public static void menu1(int dadosParaRerolar[]){
		int opcao;
		int tabelaPontos[] = new int[14];
		Scanner teclado = new Scanner(System.in);
		
			 System.out.println("\n1 - Soma dos dados com face 1");
			 System.out.println("2 - Soma dos dados com face 2");
			 System.out.println("3 - Soma dos dados com face 3");
			 System.out.println("4 - Soma dos dados com face 4");
			 System.out.println("5 - Soma dos dados com face 5");
			 System.out.println("6 - Soma dos dados com face 6");
			 System.out.println("7 - Soma de todos os dados(Minimo de tres dados com faces iguais)");
			 System.out.println("8 - Soma de todos os dados(Minimo de quatro dados com faces iguais");
			 System.out.println("9 - Full house");
			 System.out.println("10 - Sequencia curta(4 faces de dados em sequencia)");
			 System.out.println("11 - Sequencia longa(5 faces de dados em sequencia)");
			 System.out.println("12 - Yahtzee(5 dados com faces iguais)");
			 System.out.println("13 - Qualquer combinacao de dados");
			 opcao = teclado.nextInt();
			 
			 switch(opcao) {
			 case 1:
				 	int contador = 0;
					for(int i = 0; i<6; i++){
						if(dadosParaRerolar[i] == 1) {
							contador++;
						}
					}
					tabelaPontos[1] = contador;
					 System.out.println("O valor é: "+tabelaPontos[1]);
					 break;
			 case 2:
				 int contador2 = 0;
					for(int i = 0; i<6; i++){
						if(dadosParaRerolar[i] == 2) {
							contador2++;
						}
					}
					tabelaPontos[2] = contador2*2;
					 System.out.println("O valor é: "+tabelaPontos[2]);
					 break;
			 case 3:
				 int contador3 = 0;
					for(int i = 0; i<6; i++){
						if(dadosParaRerolar[i] == 3) {
							contador3++;
						}
					}
					tabelaPontos[3] = contador3*3;
					 System.out.println("O valor é: "+tabelaPontos[3]);
					 break;
			 case 4:
				 int contador4 = 0;
					for(int i = 0; i<6; i++){
						if(dadosParaRerolar[i] == 4) {
							contador4++;
						}
					}
					tabelaPontos[4] = contador4*4;
					 System.out.println("O valor é: "+tabelaPontos[4]);
					 break;
			 case 5:
				 int contador5 = 0;
					for(int i = 0; i<6; i++){
						if(dadosParaRerolar[i] == 5) {
							contador5++;
						}
					}
					tabelaPontos[5] = contador5*5;
					 System.out.println("O valor é: "+tabelaPontos[5]);
					 break;
			 case 6:
				 int contador6 = 0;
					for(int i = 0; i<6; i++){
						if(dadosParaRerolar[i] == 6) {
							contador6++;
						}
					}
					tabelaPontos[6] = contador6*6;
					 System.out.println("O valor é: "+tabelaPontos[6]);
					 break;
					 
					 
			 case 9:
				 tabelaPontos[9] = 25;
				 break;
			 case 10:
				 tabelaPontos[10] = 30;
				 break;
			 case 11:
				 tabelaPontos[11] = 40;
				 break;
			 case 12:
				 tabelaPontos[12] = 50;
				 break;
			 default:
				 System.out.println("Opcao invalida");
			 }
			 
		
	}

}