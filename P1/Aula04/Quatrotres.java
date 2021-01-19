import java.util.Scanner;

public class Quatrotres
{
	public static void main(String[] args)
	{

		Scanner sc = new Scanner(System.in);
		
		int r, num=0, max,min, prim;
		float media, soma=0;
		System.out.print("Valor: ");
		prim = sc.nextInt();
		max = prim;
		min = prim;
		r = prim;
		do {
			if (r > max)max = r;
			if (r < min)min = r;
			soma = soma + r;
			num++;
			System.out.print("Valor: ");
			r = sc.nextInt();
		} while (r != prim);
		media = soma/num;
		System.out.printf("Media = %4.1f\n ", media);
		System.out.printf("max = %d\n",max);
		System.out.printf("min = %d\n",min);
		
	}
}
		
		
