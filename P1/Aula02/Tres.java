import java.util.Scanner;

public class Tres
{
	public static void main(String[] args)
	{
		//Ler dados
		Scanner ler = new Scanner(System.in);
		double idade;
		
		//Ler dados do teclado
		System.out.print("idade: ");
		idade = ler.nextDouble();
		
		//Condição
		if (idade <= 6) {
			System.out.print("Isento de pagamento");
		}
		else if (idade > 6 && idade <=12){
			System.out.print("Bilhete de criança");
		}
		else if (idade > 12 && idade <=65){
			System.out.print("Bilhete normal");
		}
		else {
			System.out.print("Bilhete de terceira idade");
		}
	}
}
