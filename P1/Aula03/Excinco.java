import java.util.Scanner;

public class Excinco
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int a, b;
		double c;
		
		for(a = 1; a < 100; a++)
		{
			for(b = a; b < 100; b++)
			{
				c = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
				if (c == (int)c)
				{
					System.out.printf("%d %d %4.0f \n", a, b, c);
				}
			}
		}
	}
}
