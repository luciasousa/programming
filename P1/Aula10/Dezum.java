import java.util.Scanner;

public class Dezum {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main (String[] args) {
		
		int valor;
		int seq[] = new int [4];
		int ind;

		System.out.print("Valor a procurar: ");
		valor=sc.nextInt();
		
		ind = pesquisaBin (seq, valor);
		
		if(ind != -1) {
			System.out.println("O número está na pos " +ind);
		} else {
			System.out.println("O número não existe.");
		}
		
	}
	
	public static int pesquisaBin (int[] lista, int valor) {
		
		int inicio = 0; 
		int fim = lista.length-1; 
		int meio;
		int haValor = -1;
		
		do {
			meio = (inicio + fim)/2;
			if(valor > lista[meio]) {
				inicio = meio+1;
			} else if(valor < lista[meio]) {
				fim = meio-1;
			} else {
				haValor = meio;
			}
		} while(haValor == -1 && inicio <= fim);
		
		return haValor;
	}				
}
