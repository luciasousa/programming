import java.util.Scanner;

public class Dezassete
{
	public static void main(String[] args)
	{
		//Ler dados
		Scanner sc = new Scanner(System.in);
		double produto, desconto; //Variável de entrada
		double total; //Variável de saída
		
		//Ler dados do teclado
		System.out.print("produto: ");
		produto = sc.nextDouble();
		System.out.print("desconto: ");
		desconto = sc.nextDouble();
		
		//Calcular
		total = produto * (1 - desconto/100) * 1.23;
		
		//Escrever resultados
		System.out.printf("total = %4.1f\n", total);
		
		//OUTRA MANEIRA
		
		//Scanner sc = new Scanner (System.in);
        
        //double liq, des, iva, total;
        
        //System.out.print("Qual foi o total líquido da fatura? ");
        //liq = sc.nextDouble();
        //System.out.println();
        
        //System.out.print("Qual é o desconto em percentagem? ");
        //des = sc.nextDouble()/100;
        //System.out.println();
        
        //System.out.print("Qual é o iva em percentagem? ");
        //iva = sc.nextDouble()/100;
        //System.out.println();
        
        //total = (liq*(1-des))*(1+iva);
        
        //System.out.println("O total é " + total + ".");
	}
}

		
