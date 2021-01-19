import java.util.Scanner;

public class Quatrodois
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int r;
		double produto=1;
		
		do {
			System.out.print("r: ");
			r = sc.nextInt();
			
			
			if (r!= 0) produto = produto * r;
		
		}while(r != 0);
		System.out.printf("produto = %f\n", produto);
	}
}
			
			
