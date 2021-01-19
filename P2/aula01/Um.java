import java.util.Scanner;

public class Um{
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double a, b;
		String op;
		double res = 0;
		
		//System.out.print("Numero: ");
		a = sc.nextDouble();
		//System.out.print("Operacao: ");
		op = sc.next();
		//System.out.print("Numero: ");
		b = sc.nextDouble();
		
		if (op.equals("+")){
			
			res = a + b;
			System.out.printf("%4.2f",res);
		}
		
		if (op.equals("-")){
			
			res = a - b;
			System.out.printf("%4.2f",res);
		}
		
		if (op.equals("*")){
			
			res = a * b;
			System.out.printf("%4.2f",res);
		}
		
		if (op.equals("/")){
			
			res = a / b;
			System.out.printf("%4.2f",res);
		}
		
	}
}
