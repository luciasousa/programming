import java.util.Scanner;

public class Dois
{
	public static void main(String[] args)
	{
		//Ler dados
		Scanner sc = new Scanner(System.in);
		double r1, r2;
		
		//Ler dados do teclado
		System.out.print("r1: ");
		r1 = sc.nextDouble();
		System.out.print("r2: ");
		r2 = sc.nextDouble();
		
		if (r1 > r2){
			System.out.printf("r1 = %4.0f", r1);
		}
		else if (r1 < r2){
			System.out.printf("r2 = %4.0f", r2);
		}
		else {
			System.out.print("r1 é igual a r2");
		}
	}
}
