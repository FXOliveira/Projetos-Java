package ProjetoFibonacci;

public class Fibonacci{
	
	private int tam;
	
	
	public Fibonacci(int size) {
		
		this.tam = size;
		
	}
	
	
	public void MostrarSequencia() {
		
		int f1 = 0,f2 = 1;
		int aux,prox;
		int[] sequencia = new int[tam];		
		
		sequencia[0] = f1;
		sequencia[1] = f2;
		
		for(int i=2;i<sequencia.length;i++) {
			
			prox = f1+f2;
			sequencia[i] = prox;
			aux = f2;
			f2 = prox;
			f1 = aux;
			
		}
		
		for(int i=0;i<sequencia.length;i++) {
			
			System.out.print(sequencia[i]+" ");
			
		}
		
		
			
	}
		
	
}

	

