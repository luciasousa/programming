import java.util.Scanner;

public class Cinco {
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int a;
		
		System.out.print("\nQuantos numeros quer dicionar a lista: ");
		a = sc.nextInt();
		
		int[] n = new int [a];
		
		System.out.println("Lista de numeros: ");
		
		for (int i = 0; i < a; i++){
			
			n[i] = sc.nextInt();
			
			if(n[i] == 0) break;
		}
		
		int soma = 0;
		double media;
		
		for (int j = 0; j < n.length; j++){
			
			if (a == 0){
				soma = 0;
			}
						
			soma += n[j];
		}
		
		if (a == 0) {
			
			System.out.print("Nao e possivel calcular media");
		}
		
		media = soma / n.length;
		
		System.out.printf("Soma: %d \nMedia: %4.2f",soma,media);
	}
}
