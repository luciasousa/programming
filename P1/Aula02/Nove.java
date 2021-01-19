import java.util.Scanner;

public class Nove 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner (System.in);
		int i;
		double a;
		
		System.out.print("Quer converter em Celsius escreva 0, em Fahrenheit escreva 1: ");
		i = sc.nextInt();
		System.out.print("\nEscreva a temperatura que deseja converter: ");
		a = sc.nextDouble();
		
		if (i==0){
			
			a = 1.8*a + 32;
			System.out.println("São " + a + " Fahrenheit.");
			
		}
		else if (i==1){
			
		
			a = (a-32)/1.8;
			System.out.println("São " + a + " Celsius.");
			
		}
		else{
			System.out.print("Erro!");
			
		}

	}

}
