package ExerciciosJava;

import java.util.Scanner;

public class Numero {

	public static void main(String[] args) {
		
		int num;
		int sucessor,antecessor;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite um Número Qualquer:");
		
		num = input.nextInt();
		
		sucessor = num + 1;
		antecessor = num - 1;
		
		
		System.out.println();
		System.out.print("Número Digitado:"+num+", tendo como sucessor o "+sucessor
		+" e o antecessor o "+antecessor);
		
		input.close();
		
	}	
	
	
	
	
	
}
