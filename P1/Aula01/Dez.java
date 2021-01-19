import java.util.Scanner;

public class Dez
{
	public static void main(String []args)
	{
		//Ler dados do teclado
		Scanner sc = new Scanner(System.in);
		double celsius; //Variáveis de entrada
		double fahrenheit; //Variáveis de saída
		
		//Ler dados
		System.out.print("Celsius: ");
		celsius = sc.nextDouble();
		
		//Calcular
		fahrenheit = 1.8 * celsius + 32;
		
		//Escrever resultados
		System.out.printf("%4.1f celsius é equivalente a %4.1f fahrenheit\n", celsius, fahrenheit);
	}
}
		
