package JavaB�sico;

import java.util.Scanner;

public class MediaNumeros {
	
	public static void main(String[] args) {
		
		float n1,n2,n3,n4,n5,n6;
		float media1,media2;       /*VARI�VEIS DE ENTRADA*/
		float somaMedia1,somaMedia2;
		float mediaGeral;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("N�mero:");
		n1 = input.nextFloat();
		System.out.print("N�mero:");
		n2 = input.nextFloat();			/*ENTRADA DE DADOS VIA TECLADO (SCANNER)*/
		System.out.print("N�mero:");
		n3 = input.nextFloat();
		
		System.out.print("N�mero:");
		n4 = input.nextFloat();
		System.out.print("N�mero:");
		n5 = input.nextFloat();			
		System.out.print("N�mero:");
		n6 = input.nextFloat();
		
		
		somaMedia1 = n1+n2+n3;
		somaMedia2 = n4+n5+n6;
		
		media1 = (somaMedia1)/3;        /*OPERA��ES DE C�LCULO*/
		media2 = (somaMedia2)/3;
		
		mediaGeral = (media1+media2)/2;
		

	/*SA�DA DE DADOS*/
		
		System.out.println();
			
		System.out.println("N�meros:"+n1+"  "+n2+"  "+n3);
		
		System.out.println();
		
		System.out.println("Soma da Sequencia de N�meros Acima:"+somaMedia1);
		System.out.println("M�dia da Sequencia de N�meros Acima:"+media1);
		
		System.out.println();
		
		System.out.println("N�meros:"+n4+"  "+n5+"  "+n6);
		
		System.out.println();
		
		System.out.println("Soma da Sequencia de N�meros Acima:"+somaMedia2);
		System.out.println("M�dia da Sequencia de N�meros Acima:"+media2);
		
		System.out.println();
		
		System.out.println("M�dia Geral:"+mediaGeral);
		
		
	}
}
