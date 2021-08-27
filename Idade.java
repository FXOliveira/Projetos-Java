package JavaBásico;

import java.util.Scanner;

public class Idade {
	
	public static void main(String[] args) {
		
		int idadeAnos,idadeMeses,idadeDias;
		int totalDias;
		int NUMERO_DIAS_MES = 30;
		int NUMERO_DIAS_ANO = 365;
		
		Scanner input = new Scanner(System.in);

		System.out.print("Insira a Idade em Anos:");
		idadeAnos = input.nextInt();
		
		System.out.print("Insira a Idade em Meses:");
		idadeMeses = input.nextInt();
		
		System.out.print("Insira a Idade em Dias:");
		idadeDias = input.nextInt();
		
		totalDias = (idadeAnos*NUMERO_DIAS_ANO)+ (idadeMeses*NUMERO_DIAS_MES)
		+ idadeDias;
		
		
		System.out.println();
		System.out.println("Idade em Anos:"+idadeAnos);
		System.out.println("Idade em Meses:"+idadeMeses);
		System.out.println("Idade em Dias:"+idadeDias);
		
		System.out.println("Total de Dias:"+totalDias);
		
		input.close();
	
	}
}
