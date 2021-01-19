import java.util.Scanner;

public class Cincoseis
{
	public static void main(String[] args)
	{
		Scanner ler = new Scanner(System.in);
		int x = ler.nextInt();
		tabuada(x);
		
	}
	
	public static void tabuada(int n)
	{
		for (int i=1; i<=n; i++) System.out.printf("%2d x %2d = %3d\n", n, i, n*i);
	}
}

