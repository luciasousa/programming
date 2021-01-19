import java.util.Scanner;

public class Cinco 
{
	 public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		double x1, x2, x3, x4, y1, y2, y3, y4, dist1, dist2;
		
		System.out.println("Coordenadas do primeiro ponto");
		System.out.print("X: ");
		x1 = sc.nextDouble();
		System.out.print("Y: ");
		y1 = sc.nextDouble();
		
		System.out.println("Coordenadas do segundo ponto");
		System.out.print("X: ");
		x2 = sc.nextDouble();
		System.out.print("Y: ");
		y2 = sc.nextDouble();

		System.out.println("Coordenadas do terceiro ponto");
		System.out.print("X: ");
		x3 = sc.nextDouble();
		System.out.print("Y: ");
		y3 = sc.nextDouble();
		
		System.out.println("Coordenadas do quarto ponto");
		System.out.print("X: ");
		x4 = sc.nextDouble();
		System.out.print("Y: ");
		y4 = sc.nextDouble();
		
		dist1 = Math.sqrt(Math.pow((x1-x2), 2)+Math.pow((y1-y2),2));
		dist2 = Math.sqrt(Math.pow((x3-x4), 2)+Math.pow((y3-y4), 2));
		
		if(dist1==dist2){
			
			System.out.print("É um quadrado!");
			
		}
		else System.out.println("Não é um quadrado!");
		
	}
}
