import java.util.*;

public class Novedois {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		

		String s;

		System.out.print("Escreva um nome: ");
		s = sc.nextLine();
		
		String x=acronimo(s);
		System.out.print(x);
		
	}
		
	public static String acronimo (String s) {
		

		String acronimo = "";
		
		for(int i=0; i < s.length();i++) {
			
			if(Character.isUpperCase(s.charAt(i))) {
				acronimo += s.charAt(i);
			}
		}
		
		return acronimo;
			
	}
		
}
