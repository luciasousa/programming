import java.util.Scanner;

public class Exquatro
{
	public static void main(String[] args)
	{
		int n;
		double serie;
		Scanner sc = new Scanner(System.in);
		System.out.print("n: ");
		n = sc.nextInt();
		
	for(n = 1; n < 100; n++)
		{
			for(int i=1; i<100; i++)
			{
				
				serie = Math.pow((-1),(i+1)) / ((2*i)-1);
				System.out.printf("serie = %17.15f\n",serie);
		    }
		    
		}
	}
}
		
		
