import java.util.Scanner;

public class Cincoquatro
{
	public static void main(String[] args)
	{
		int m;
		long fact;
		Scanner sc = new Scanner(System.in);
		System.out.print("Indique um valor de 0 a 10: ");
		m = sc.nextInt();
		
		for(int k=m; k > 0; k--){
			int f = fact(k);
			System.out.printf("%3d! = %d %n",k, f);
		}
	}
	
	public static int fact(int n){
		
		int fact = 1;
			for (int i=1; i <= n; i++) {
				fact = fact * i;
			}
		return fact;
		}
}
		
		
