import java.util.Scanner;

public class Seisum {
	
	public static void main(String []args) {
		
		Scanner ler = new Scanner(System.in);
		
		int n;
		int valores[];
		
		System.out.print("Quantos valores quer imprimir? ");
		n = ler.nextInt();
		
		valores = new int[n];
		
		//inserir números
		
		for(int i=0; i<n; i++) {
			
			System.out.print("Valores: ");
			valores[i] = ler.nextInt();
			
		}
		
		//imprimir pela ordem inversa
		
		for(int i=--n; i>=0; i--) {
			
			System.out.printf("%d   ", valores[i]);
			
		}
		
	}
	
}
