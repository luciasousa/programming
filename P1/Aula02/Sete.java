import java.util.Scanner;

public class Sete
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		double x1, x2, x3;
		
		System.out.print("x1: ");
		x1 = sc.nextInt();
		System.out.print("x2: ");
		x2 = sc.nextInt();
		System.out.print("x3: ");
		x3 = sc.nextInt();
		
		if (x1 > x2 && x1 > x3) {
			System.out.printf("%2.1f", x1);
		}
	    else if (x2 > x1 && x2 > x3) {
			System.out.printf("%2.1f", x2);
		}
		else if (x3 > x1 && x3 > x2) {
			System.out.printf("%2.1f", x3);
		}
		
	}
}
