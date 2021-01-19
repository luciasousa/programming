import java.util.Scanner;

public class Quatroum
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int i, cont =0;
		
		do {
			
			System.out.print("um valor inteiro positivo: ");
			i = sc.nextInt();
			cont ++;
		}
		while (i >= 0);
		System.out.printf("Valor %d lido na %d vez\n", i, cont);
	}
}
		
		
