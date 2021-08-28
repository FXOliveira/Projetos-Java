package ExerciciosJava;

import java.util.Scanner;

public class Taboada {

	public static void main(String[] args) {
		
		int num;
		
		Scanner input = new Scanner(System.in);
				
		System.out.print("Informe um número qualquer para realizar sua taboada:");
		num = input.nextInt();
		
		System.out.println();
		
		for(int i = 1; i<=num; i++) {
			System.out.println(num+"x"+i+"="+(num*i));
		}
		
		
		
		
		input.close();
		
	}
	
}
