import java.util.Scanner;

public class Catorze
{
	public static void main(String[] args)
	{
		//Ler dados do teclado
		Scanner sc = new Scanner(System.in);
		double a, b; //Variáveis de entrada
		double c, angulo; //Variáveis de saída
		
		//Ler dados
		System.out.print("a: ");
		a = sc.nextDouble();
		System.out.print("b: ");
		b = sc.nextDouble();
		
		//Calcular
		c = Math.sqrt ((a*a) + (b*b));
		angulo = Math.acos (a/c) * 57.3;
		
		//Escrever resultados
		System.out.printf("c = %4.1f, angulo = %4.1f/n", c, angulo);
	}
}
	
