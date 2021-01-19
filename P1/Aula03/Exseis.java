import java.util.Scanner;

public class Exseis
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int largura, altura;
		System.out.print("Insira largura: ");
		largura = sc.nextInt();
		System.out.print("Insira altura: ");
		altura = sc.nextInt();

		for(int i=0; i<altura; i++){
			for (int j=0; j<largura; j++){
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
}
