import java.util.Scanner;

public class Quatro {
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Frase: ");
		String f = sc.nextLine();
		
		for (int i = 0; i < f.length(); i++){
		
			if (f.charAt(i) == 'l'){
				
				f = f.replace('l','u');
			}
			
			if (f.charAt(i) == 'r') {
				
				f = f.replace('r',' ');
			}
		}
		
		System.out.println(f);
	}
}
