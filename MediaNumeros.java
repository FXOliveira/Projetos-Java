package JavaBásico;

import java.util.Scanner;

public class MediaNumeros {
	
	public static void main(String[] args) {
		
		float n1,n2,n3,n4,n5,n6;
		float media1,media2;       /*VARIÁVEIS DE ENTRADA*/
		float somaMedia1,somaMedia2;
		float mediaGeral;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Número:");
		n1 = input.nextFloat();
		System.out.print("Número:");
		n2 = input.nextFloat();			/*ENTRADA DE DADOS VIA TECLADO (SCANNER)*/
		System.out.print("Número:");
		n3 = input.nextFloat();
		
		System.out.print("Número:");
		n4 = input.nextFloat();
		System.out.print("Número:");
		n5 = input.nextFloat();			
		System.out.print("Número:");
		n6 = input.nextFloat();
		
		
		somaMedia1 = n1+n2+n3;
		somaMedia2 = n4+n5+n6;
		
		media1 = (somaMedia1)/3;        /*OPERAÇÕES DE CÁLCULO*/
		media2 = (somaMedia2)/3;
		
		mediaGeral = (media1+media2)/2;
		

	/*SAÍDA DE DADOS*/
		
		System.out.println();
			
		System.out.println("Números:"+n1+"  "+n2+"  "+n3);
		
		System.out.println();
		
		System.out.println("Soma da Sequencia de Números Acima:"+somaMedia1);
		System.out.println("Média da Sequencia de Números Acima:"+media1);
		
		System.out.println();
		
		System.out.println("Números:"+n4+"  "+n5+"  "+n6);
		
		System.out.println();
		
		System.out.println("Soma da Sequencia de Números Acima:"+somaMedia2);
		System.out.println("Média da Sequencia de Números Acima:"+media2);
		
		System.out.println();
		
		System.out.println("Média Geral:"+mediaGeral);
		
		
	}
}
