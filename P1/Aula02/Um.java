import java.util.Scanner;

public class Um
{
	public static void main(String[] args)
	{
		//Ler dados
		Scanner ler = new Scanner(System.in);
		double tpg1, tpg2, ei; //Variáveis de entrada
		double nota; //Variável de saída
		
		//Ler dados do teclado
		System.out.print("tpg1: ");
		tpg1 = ler.nextDouble();
		System.out.print("tpg2: ");
		tpg2 = ler.nextDouble();
		System.out.print("ei: ");
		ei = ler.nextDouble();
		
		//Calcular
		nota = (tpg1 * 0.2) + (tpg2 * 0.3) + (ei * 0.5);
		
		if (nota >= 9.5){
			System.out.print("Aluno aprovado");
		}
		else {
			System.out.print("Aluno reprovado");
		}
	}
}
