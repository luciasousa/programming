import java.util.Scanner;

public class Oito
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		double x1, x2, x3, i;
		
		System.out.print("x1: ");
		x1 = sc.nextInt();
		System.out.print("x2: ");
		x2 = sc.nextInt();
		System.out.print("x3: ");
		x3 = sc.nextInt();
		
		if (x3 > x2){
				
			i = x3;
			x3 = x2;
			x2 = i;
			}

		if (x2 > x1){
			
			i = x1;
			x1 = x2;
			x2 = i;
		}
		if (x3 > x1){
			
			i = x1;
			x1 = x3;
			x3 = i;
			
		}
		if (x3 > x2){
				
			i = x3;
			x3 = x2;
			x2 = i;
			}
		
		System.out.println("Os números ordenados por ordem crescente são " + x3 + ", " + x2 + ", " + x1 + ".");
			
	}
}
