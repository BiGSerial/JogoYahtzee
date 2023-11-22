import java.util.Scanner;

public class Rolagem {
	
	public static boolean menuJogo(){
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
		
		return(true);
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
				 // soma das faces com numero 1
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
				 //soma das faces com numero 2
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
				 //soma das faces com numero 3
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
				 // soma das faces com numero 4
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
				 //soma das faces com numero 5
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
				 // soma das faces com numero 6
				 int contador6 = 0;
					for(int i = 0; i<6; i++){
						if(dadosParaRerolar[i] == 6) {
							contador6++;
						}
					}
					tabelaPontos[6] = contador6*6;
					 System.out.println("O valor é: "+tabelaPontos[6]);
					 break;
			 case 7:
				 // tres dados precisam ter faces iguais, soma de todos 
				 int numComparativo;
				 int quant1 = 0, quant2 = 0, quant3 = 0, quant4 = 0, quant5 = 0, quant6 = 0;
				 int numIguais = 0;
				 int contador7 = 0;
				 int contador71 = 0;
				 for(int i = 0; i<6; i++) {
					 numComparativo = dadosParaRerolar[i];
					 if(numComparativo == 1) {
						 quant1++;
					 }else if(numComparativo == 2){
						 quant2++;
					 }else if(numComparativo == 3) {
						 quant3++;
					 }else if(numComparativo == 4) {
						 quant4++;
					 }else if(numComparativo == 5) {
						 quant5++;
					 }else if(numComparativo == 6) {
						 quant6++;
					 }
					 
				 }
				 
				 
				 if(quant1 >= 3 || quant2 >= 3 || quant3 >= 3 || quant4>= 3 || quant5>= 3 ||quant6 >= 3) {
					 for(int i = 0; i<6; i++) {
						 contador7 = dadosParaRerolar[i];
						 contador71 = contador71 + contador7;
					 }
					 tabelaPontos[7] = contador71;
				 }else {
					 System.out.println("Não há 3 faces iguais");
				 }
				 
				break;
			 case 8:
				 // quatro dados precisam ter faces iguais, soma de todos 
				 int numComparativo2;
				 int contador8 = 0;
				 int contador81 = 0;
				 int quant11 = 0, quant22 = 0, quant33 = 0, quant44 = 0, quant55 = 0, quant66 = 0;
				 
				 for(int i = 0; i<6; i++) {
					 numComparativo2 = dadosParaRerolar[i];
					 if(numComparativo2 == 1) {
						 quant11++;
					 }else if(numComparativo2 == 2){
						 quant22++;
					 }else if(numComparativo2 == 3) {
						 quant33++;
					 }else if(numComparativo2 == 4) {
						 quant44++;
					 }else if(numComparativo2 == 5) {
						 quant55++;
					 }else if(numComparativo2 == 6) {
						 quant66++;
					 }
					 
				 }
				 if(quant11>=4 || quant22 >= 4 || quant33 >= 4 || quant44 >= 4 || quant55 >= 4 || quant66 >= 4) {
					 for(int i = 0; i<6; i++) {
						 contador8 = dadosParaRerolar[i];
						 contador81 = contador81 + contador8;
						 
					 }
					 tabelaPontos[8] = contador81;
				 }else{
					 System.out.println("Não há 4 faces iguais");
				 }
				 
				break;
				 
			 case 9: 
				break;
			 case 10:
				 // short straight (1, 2, 3, 4; 2, 3, 4, 5; 3, 4, 5, 6;)
				 if(dadosParaRerolar[0] == 1 && dadosParaRerolar[1] == 2 && dadosParaRerolar[2] == 3 && dadosParaRerolar[3]==4) {
					tabelaPontos[10] = 30;
				 }else if(dadosParaRerolar[0] == 2 && dadosParaRerolar[1] == 3 && dadosParaRerolar[2] == 4 && dadosParaRerolar[3]==5) {
						tabelaPontos[10] = 30;
				 }else if(dadosParaRerolar[0] == 3 && dadosParaRerolar[1] == 4 && dadosParaRerolar[2] == 5 && dadosParaRerolar[3]==6) {
						tabelaPontos[10] = 30;
				 }else if(dadosParaRerolar[1] == 1 && dadosParaRerolar[2] == 2 && dadosParaRerolar[3] == 3 && dadosParaRerolar[4]==4) {
						tabelaPontos[10] = 30;
				 }else if(dadosParaRerolar[1] == 2 && dadosParaRerolar[2] == 3 && dadosParaRerolar[3] == 4 && dadosParaRerolar[4]==5) {
							tabelaPontos[10] = 30;
				 }else if(dadosParaRerolar[1] == 3 && dadosParaRerolar[2] == 4 && dadosParaRerolar[3] == 5 && dadosParaRerolar[4]==6) {
							tabelaPontos[10] = 30;
				 }else if(dadosParaRerolar[2] == 1 && dadosParaRerolar[3] == 2 && dadosParaRerolar[4] == 3 && dadosParaRerolar[5]==4) {
						tabelaPontos[10] = 30;
				 }else if(dadosParaRerolar[2] == 2 && dadosParaRerolar[3] == 3 && dadosParaRerolar[4] == 4 && dadosParaRerolar[5]==5) {
							tabelaPontos[10] = 30;
				 }else if(dadosParaRerolar[2] == 3 && dadosParaRerolar[3] == 4 && dadosParaRerolar[4] == 5 && dadosParaRerolar[5]==6) {
							tabelaPontos[10] = 30;
				 }
				 tabelaPontos[10] = 30;
				 break;
			 case 11:
				// long straight (1, 2, 3, 4, 5 ou 2, 3, 4, 5, 6)
				 if(dadosParaRerolar[0]==1 && dadosParaRerolar[1]==2 && dadosParaRerolar[2]==3 && dadosParaRerolar[3]==4
				 && dadosParaRerolar[4]==5) { 
					 tabelaPontos[11] = 40;
				 }else if(dadosParaRerolar[1]==1 && dadosParaRerolar[2]==2 && dadosParaRerolar[3]==3 && dadosParaRerolar[4]==4
						 && dadosParaRerolar[5]==5) {
					 tabelaPontos[11] = 40;
				 }else if(dadosParaRerolar[0]==2 && dadosParaRerolar[1]==3 && dadosParaRerolar[2]==4 && dadosParaRerolar[3]==5
						 && dadosParaRerolar[4]==6) {
					 tabelaPontos[11] = 40;
				 }else if(dadosParaRerolar[1]==2 && dadosParaRerolar[2]==3 && dadosParaRerolar[3]==4 && dadosParaRerolar[4]==5
						 && dadosParaRerolar[5]==6) {
					 tabelaPontos[11] = 40;
				 }
				 break;
			 case 12:
				// cinco dados precisam ter faces iguais, soma de todos 
				 int numComparativo3;
				 int contador12 = 0;
				 int contadorDoze = 0;
				 int quant111 = 0, quant222 = 0, quant333 = 0, quant444 = 0, quant555 = 0, quant666 = 0;
				 
				 for(int i = 0; i<6; i++) {
					 numComparativo3 = dadosParaRerolar[i];
					 if(numComparativo3 == 1) {
						 quant111++;
					 }else if(numComparativo3 == 2){
						 quant222++;
					 }else if(numComparativo3 == 3) {
						 quant333++;
					 }else if(numComparativo3 == 4) {
						 quant444++;
					 }else if(numComparativo3 == 5) {
						 quant555++;
					 }else if(numComparativo3 == 6) {
						 quant666++;
					 }
					 
				 }
				 if(quant111>=5 || quant222 >= 5 || quant333 >= 5 || quant444 >= 5 || quant555 >= 5 || quant666 >= 5) {
					 for(int i = 0; i<6; i++) {
						 contador12 = dadosParaRerolar[i];
						 contadorDoze = contadorDoze + contador12;
						 
					 }
					 tabelaPontos[9] = contadorDoze;
				 }else{
					 System.out.println("Não há 5 faces iguais");
				 }
				 break;
			 case 13:
				 // sorte (soma de todos os numeros)
				int contadorSorte = 0; 
				int contadorSorte2 = 0;
				 for(int i = 0; i<6; i++){
					if(dadosParaRerolar[i]>0) {
						contadorSorte = dadosParaRerolar[i];
						contadorSorte2 = contadorSorte2 + contadorSorte;
					}
				 }
				 System.out.println("O valor é: "+contadorSorte2);
					break;
			 default:
				 System.out.println("Opcao invalida");
			 }
			 
		
	}

}