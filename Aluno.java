package ExerciciosJava;

import java.util.Scanner;

public class Aluno{
	
	public static void main(String[] args){
	
		float notaAluno;
		String situacao;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite a Nota do Aluno:");
		notaAluno = input.nextFloat();
		
		if (notaAluno>=60) {
			
			situacao = "Aprovado";	
			
		}else if (notaAluno<60 && notaAluno>=20) {
			
			situacao = "Recuperação";
			
		}else {
			
			situacao = "Reprovado";
			
			
		}
		
		System.out.println();
		System.out.println("Nota do Aluno:"+notaAluno);
		System.out.println("Situação:"+situacao);
		
		input.close();
		
	}
	
}