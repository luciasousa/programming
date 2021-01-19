import java.util.Scanner;

public class Tres {
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int n;
		while (true) {
			System.out.print("N? ");
			n = sc.nextInt();
			if (n > 0) break;
			System.err.println("ERROR: invalid number!");
		}

    String verb = isPrime(n)? "is" : "is not";
    System.out.printf("Number %d %s prime\n", n, verb);
    
	}

	public static boolean isPrime(int n) {
		
		for (int i = 1; i <= n; i++){
			
			double resto;
			
			resto = n % i;
			
			if(resto == 0) {
				
				if (i == n && i == 1){
					return true;
				}
			}
			
			else {
				return false;
			}
		}
		return true;
	}
}
