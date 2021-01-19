import java.util.Scanner;

public class Dois {
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		double a,b,c,d,e;
		double ctp = 0;
		double cp = 0;
		double nf = 0;
		
		System.out.println("\nNotas da componente pratica: ");
		
		System.out.print("\nATP1: ");
		a = sc.nextDouble();
		System.out.print("\nATP2: ");
		b = sc.nextDouble();
		
		System.out.println("\nNotas da componente teorica: ");
		
		System.out.print("\nATP1: ");
		c = sc.nextDouble();
		System.out.print("\nATP2: ");
		d = sc.nextDouble();
		System.out.print("\nATP3: ");
		e = sc.nextDouble();
		
		ctp = ((c+d+e)/3) * 0.3;
		cp = ((a+b)/2) * 0.7;
		
		nf = cp + ctp;
		
		System.out.printf("%4.2f",nf);
	}
}
