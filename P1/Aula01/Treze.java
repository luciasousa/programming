import java.util.Scanner;

public class Treze
{
	public static void main(String []args)
	{
		//Ler dados do teclado
		Scanner sc = new Scanner(System.in);
		double x1, y1, x2, y2; //Variáveis de entrada
		double distancia; //Variável de saída
		
		//Ler dados
		System.out.print("x1: ");
		x1 = sc.nextDouble();
		System.out.print("x2: ");
		x2 = sc.nextDouble();
		System.out.print("y1: ");
		y1 = sc.nextDouble();
		System.out.print("y2: ");
		y2 = sc.nextDouble();
		
		//Calcular
		distancia = Math.sqrt(((x2-x1)*(x2-x1)) + ((y2-y1)*(y2-y1))) * 100;
		
		//Escrever resultados
		System.out.printf("distancia = %4.1f Km\n", distancia);
	}
}

		
		
