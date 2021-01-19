import java.util.Scanner;

public class Quatroquatro
{
	public static void main(String[] args)
	{
		int secret = (int)(100.0*Math.random()) + 1;
		int x;
		
		Scanner sc = new Scanner(System.in);
		
		do {
			
		System.out.print("\nTente a sua sorte, diga um número: ");
		x = sc.nextInt();
		
		if ( secret > x) System.out.print("Demasiado baixo");
	
		if ( secret < x) System.out.print("Demasiado alto");
	
		}while(x!=secret);
		
			System.out.print("ESTÁAAAA CERTAAAAAA!!!!");
		
	}
}


		
