import java.util.Scanner;

public class Cincotres {
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int mes, ano;
		int data, dias =0;
		
		System.out.print("mes: ");
		mes = sc.nextInt();
		System.out.print("ano: ");
		ano = sc.nextInt();
		
		boolean cond1, cond2, cond3, cond4;
		cond1 = (mes ==2);
		cond2 = ((mes == 1) || (mes == 3) || (mes == 5) || (mes == 7) || (mes == 8) || (mes == 10) || (mes == 12));
		cond3 = ((mes == 4) || (mes == 6) || (mes == 9) || (mes == 11));
		
		if (cond1)
		{
			dias = 28;
			if (ano % 400 == 0 || (ano % 4 == 0 && ano % 100 != 0))dias = 29;
		}
		
		if (cond2)
		{
			dias = 31;
		}
		if (cond3)
		{
			dias = 30;
		}
		System.out.printf("O mês %d do ano %d tem %d dias\n", mes, ano, dias);

	    
	}
}

		
		
