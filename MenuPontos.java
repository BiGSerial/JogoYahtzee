import java.util.Scanner;

public class MenuPontos {
	
	
	public static void menu1(){
		int opcao;
		Scanner teclado = new Scanner(System.in);
		do {
			 System.out.println("0 - Sair");
			 System.out.println("1 - Soma dos dados com face 1");
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
			 
		}while(opcao != 0);
	}
}