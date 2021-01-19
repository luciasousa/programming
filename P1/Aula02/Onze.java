import java.util.Scanner;

public class Onze
{
	public static void main(String[] args)
	{
		double a, b, c, delta, x1, x2;
		Scanner sc = new Scanner(System.in);
		System.out.print("Insira os valores de a, b e c.\n\ta:");
		a = sc.nextDouble();	
		System.out.print("\n\tb:");
		b = sc.nextDouble();
		System.out.print("\n\tc:");
		c = sc.nextDouble();
		
		delta = (Math.pow(b, 2))-(4*a*c);
		
		if (delta==0){
			
			x1=((-b)/(2*a));
			System.out.println("A única solução é " + x1 + ".");
		}
		else if (delta<0){
			System.out.println("É impossível calcular a equação em IR.");
			
		}
		else{
			x1=(((-b)+delta)/(2*a));
			x2=(((-b)-delta)/(2*a));
			System.out.println("As soluções são " + x1 + " e " + x2 + ".");
		}
	}

}
