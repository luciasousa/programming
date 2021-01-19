import java.util.*;

public class Seisquatro {
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n;
		int notas[];
		
		System.out.print("Quantas notas são?");
		n = sc.nextInt();
		
		notas = new int[n];
		
		for(int i=0; i<n; i++) {
			
			System.out.print("Notas: ");
			notas[i] = sc.nextInt();
			
		}
		
		System.out.println("Histograma de notas");
		System.out.println("-------------------------------------------------------");		
		
		for(int i=20; i>=0; i--) {
			System.out.printf("%2d | ", i);
		
			for(int j=0; j<notas.length;j++) {
				if(notas[j]==i)System.out.print("*");
	
			//int max = 50;
			//int a;
			//a = max * (1/2);
			
			}
			
			System.out.println();
		}
	}
}
