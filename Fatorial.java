package ProjetoFatorial;

public class Fatorial {

	private int num;
	
	public Fatorial(int numero) {
		
		this.num = numero;
		
	}
	
	public void Calcular(){
		
		int fat = 1;
		
		for(int i = 1;i<=this.num;i++) {
			
			fat = fat*i;
			
		}
		
		System.out.print("Fatorial de "+this.num+" é:"+fat);
		
	}
	
	
}
