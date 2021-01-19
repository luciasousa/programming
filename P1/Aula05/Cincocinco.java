import java.util.Scanner;

public class Cincocinco
{
	
	public static void main(String[] args)
{
		Scanner sc = new Scanner(System.in);
		
		int largura, altura;
		
		System.out.print("insira largura: ");
		largura = sc.nextInt();
		
		System.out.print("insira altura: ");
		altura = sc.nextInt();
		printRect(altura,largura);
		
}
	
	public static void printNtimes(int count, String s){
		for (int i = 0; i < count; i++)		{
			System.out.print(s);
		}	
}

	public static void printRect (int altura,int largura){
			printNtimes(largura,"*");
			System.out.println();
			for (int contagem = 2 ; contagem < altura ; contagem++)	{
				System.out.print("*");
				printNtimes(largura -2 ," ");
				System.out.println("*");
	}
			printNtimes(largura,"*");
			System.out.println();
			
			
			
	}
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	public static void printNtimes(int n, String s1, String s2){
		System.out.print(s1);
		Scanner sc = new Scanner(System.in);

		int altura, largura;
		System.out.print("Insira altura: ");
		altura = sc.nextInt();
		System.out.print("Insira largura: ");
		largura = sc.nextInt();
		
		for (int i =1; i<n-2; i++) System.out.print(s2);
		printNtimes(altura,"*");
		printNtimes(largura,"*");
		}*/
		
}	
