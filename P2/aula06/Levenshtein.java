import static java.lang.System.*;

public class Levenshtein{
	
	public static void main(String[] args) {
		
		if (args.length != 2) {
			out.println("Uso: java -ea Levenshtein <palavra1> <palavra2>");
			exit(1);
		}

		int d = distancia(args[0], args[1]);
		out.printf("\"%s\" <-> \"%s\" = %d\n", args[0], args[1], d);
	}
	
	public static int distancia(String a, String b){
		
		int d = 0;
		
		if(b.length() == 0){
			d = a.length();
		}
		
		if(a.length() == 0){
			d = b.length();
		}
		
		if(a.charAt(0) == b.charAt(0)){
			
			d = distancia(a.substring(1), b.substring(1));
		}
		
		if(a.charAt(0) != b.charAt(0)){
			
			int d1 = distancia(a.substring(1), b);
			int d2 = distancia(a, b.substring(1));
			int d3 = distancia(a.substring(1), b.substring(1));
			
			int f = min(d1, d2, d3);
			
			d = 1 + f;
		}
		
		return d;
	}
	
	public static int min(int d1, int d2, int d3){
		
		int m = 0;
		
		if(d1 < d2 && d1 < d3){
			m = d1;
		}
		
		if(d2 < d1 && d2 < d3){
			m = d2;
		}
		
		if(d3 < d1 && d3 < d2){
			m = d3;
		}
		
		return m;
	}
}
