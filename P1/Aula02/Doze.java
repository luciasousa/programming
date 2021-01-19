import java.util.Scanner;

public class Doze
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		double x1, x2, x3, x4, y1, y2, y3, y4, x5, x6, x7, x8, y5, y6, y7, y8, dist1, dist2, dist3, dist4;
		System.out.print("Primeiro quadrado");
		System.out.println("\nCoordenadas do primeiro ponto");
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
		
		System.out.print("Segundo quadrado");
		System.out.println("\nCoordenadas do primeiro ponto");
		System.out.print("X: ");
		x5 = sc.nextDouble();
		System.out.print("Y: ");
		y5 = sc.nextDouble();
		
		System.out.println("Coordenadas do segundo ponto");
		System.out.print("X: ");
		x6 = sc.nextDouble();
		System.out.print("Y: ");
		y6 = sc.nextDouble();

		System.out.println("Coordenadas do terceiro ponto");
		System.out.print("X: ");
		x7 = sc.nextDouble();
		System.out.print("Y: ");
		y7 = sc.nextDouble();
		
		System.out.println("Coordenadas do quarto ponto");
		System.out.print("X: ");
		x8 = sc.nextDouble();
		System.out.print("Y: ");
		y8 = sc.nextDouble();
		
		dist1 = Math.sqrt(Math.pow((x1-x2), 2)+Math.pow((y1-y2),2));
		dist2 = Math.sqrt(Math.pow((x3-x4), 2)+Math.pow((y3-y4), 2));
		dist3 = Math.sqrt(Math.pow((x5-x6), 2)+Math.pow((y5-y6),2));
		dist4 = Math.sqrt(Math.pow((x7-x8), 2)+Math.pow((y7-y8), 2));
		
		if (dist1==dist2 && dist3==dist4){
			System.out.print("é quadrado");
			if (
		}
		else {
			System.out.print("não é quadrado");
		}
		
	}
}

