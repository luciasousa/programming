import java.util.Scanner;

public class Dezasseis
{
	public static void main(String[] args)
	{
		//Ler dados do teclado
		Scanner sc = new Scanner(System.in);
		double dia1, dia2, dia3, dia4; //Variáveis de entrada
		double despesa; //Variável de saída
		
		//Ler dados
		System.out.print("dia1: ");
		dia1 = sc.nextDouble();
		
		//Calcular
		dia2 = (0.20 * dia1) + dia1;
		dia3 = (0.20 * dia2) + dia2;
		dia4 = (0.20 * dia3) + dia3;
		despesa = dia1 + dia2 + dia3 + dia4;
		
		//Escrever resultados
		System.out.printf("despesa = %4.1f\n", despesa);
	}
}
