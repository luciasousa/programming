import java.util.Scanner;

public class Onze
{
	public static void main(String []args)
	{
		//Ler dados do teclado
		Scanner sc = new Scanner(System.in);
		double dolares; //Variável de entrada
		double euros; //Variável de saída
		
		//Ler dados 
		System.out.print("Dólares: ");
		dolares = sc.nextDouble();
		
		//Calcular
		euros = 0.87 * dolares;
		
		//Escrever resultados 
		System.out.printf("%3.1f dólares equivalem a %3.1f euros\n",dolares, euros);
	}
}
