import java.util.Scanner;

public class Seis2 {
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int pt = 0;
		
		int a = (int)(Math.random()*(100+1));
		
		System.out.print("Escolha um numero de 1 a 100: ");
		int b = sc.nextInt();
		
		
		
		int i = 0;
		
		do {

			if(b > a) {
			
				System.out.print("Muito grande. \nTenta outra vez:");
			}
		
			if(b < a) {
			
				System.out.print("Muito pequeno. \nTenta outra vez:");
			}
			
			i++;
			
			b = sc.nextInt();
			
		}while(b != a);
		
		if(b == a) {
			
			System.out.print("ESTA CERTA!");
				
		}
		
		pt = i + 1;
		
		System.out.printf("\n\nPontuacao: %d",pt);
	}
}
