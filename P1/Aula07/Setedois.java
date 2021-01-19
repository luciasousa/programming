import java.util.*;

public class Setedois {
	
	public static void main(String[] args) {
	
	Scanner ler = new Scanner(System.in);
		
		int i, num, numCount=0, count=0, intPos;   
		
		System.out.print("Número a verificar: ");
		num = ler.nextInt();
		
		do{
			System.out.print("Inteiro positivo: ");
			intPos = ler.nextInt();
			if(intPos==num){
				numCount++;
			}
			count++;
			
		}while(count<100 && intPos>=0);
		
		System.out.printf("O número %d apareceu %d vezes",num,numCount);
		
	}
}
	
