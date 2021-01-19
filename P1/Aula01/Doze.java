import java.util.Scanner;

public class Doze
{
	public static void main(String []args)
	{
		//Ler dados do tecldo
		Scanner sc = new Scanner(System.in);
		double segundos; //Variável de entrada
		double hh,mm,ss; //Variáveis de sáida
		
		//Ler dados
		System.out.print("Segundos: ");
		segundos = sc.nextDouble();
		
		//Calcular
		hh = segundos/3600;
		mm = segundos/60;
		ss = 1 * segundos;
		
		//Escrever resultados
		System.out.printf("%4.1f segundos são %4.1f hh % 4.1f mm %4.1f ss\n", segundos, hh, mm, ss);
	}
}
		
