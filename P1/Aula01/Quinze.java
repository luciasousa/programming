import java.util.Scanner;

public class Quinze
{
	public static void main(String[] args)
	{
		//Ler dados do teclado
		Scanner sc = new Scanner(System.in);
		double tp1, tp2, ap1, ep; //Variáveis de entrada
		double nota; //Variáveis de saída
		
		//Ler dados
		System.out.print("tp1: ");
		tp1 = sc.nextDouble();
		System.out.print("tp2: ");
		tp2 = sc.nextDouble();
		System.out.print("ap1: ");
		ap1 = sc.nextDouble();
		System.out.print("ep: ");
		ep = sc.nextDouble();
		
		//Calcular
		nota = (tp1 * 0.15) + (tp2 * 0.15) + (ap1 * 0.30) + (ep * 0.40);
		
		//Escrever resultados
		System.out.printf("nota = %4.1f\n",nota);
	}
}
