import java.util.Scanner;

public class Exum
{
	public static void main(String[] args)
	{
		Scanner ler = new Scanner(System.in);
		int i;
		
		System.out.print("i: ");
		i = ler.nextInt();
		
		for (int n=1; n<=i; n++){ 
			System.out.printf("P1 é fixe!\n", n);
		}
	}
}
		
