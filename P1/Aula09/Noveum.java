import java.util.Scanner;

public class Noveum {
	
	public static void main (String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int minusc=0, maiusc=0, digitos=0, vogal=0, consoante=0;
		
		System.out.println("Analise a frase");
		char letra;
		String s1 = new String();
		s1 = ler.nextLine();
		
		for (int i=0; i < s1.length(); i++){
			
			letra = s1.charAt(i);
			
			if(Character.isLowerCase(letra)) {
				minusc++;
			}
			
			else if(Character.isUpperCase(letra)) {
				maiusc++;
			}
			
			else if(Character.isDigit(letra)) {
				digitos++;
			}
			

		}

				
		for (int i=0; i < s1.length(); i++){
			
			letra = s1.charAt(i);
			
			if(isVowel(letra)) {
				vogal++;
			}
			else {
				consoante++;
			}
			
		} 
			System.out.printf("Número de caracteres minúsculos -> %d\n", minusc);
			System.out.printf("Número de caracteres maiusculos -> %d\n", maiusc);
			System.out.printf("Número de caracteres numéricos  -> %d\n", digitos);
			System.out.printf("Número de consoantes            -> %d\n", consoante);
			System.out.printf("Número de vogais                -> %d\n", vogal);
			
	}
	
		public static boolean isVowel(char letra){
			
			boolean v = false;
			
			char c = Character.toLowerCase(letra);
			
			if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
				v = true;
			}
			
			return v;
			
		}
}

