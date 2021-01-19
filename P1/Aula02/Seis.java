import java.util.Scanner;

public class Seis
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int x;
		
		System.out.print("Insira um número inteiro : ");
		x = sc.nextInt();
		
		if ((x%2)==0) {
			
			System.out.print("É número par.");
			
		}
		
		else {
			
			System.out.print("É número ímpar.");
		}
	}
}
			
