import static java.lang.System.*;

public class Ex69{
	
	public static void main(String[] args){
		
		int n = Integer.parseInt(args[0]);
		int e = Integer.parseInt(args[1]);
		int t = Integer.parseInt(args[2]);
		int p = Integer.parseInt(args[3]);

		out.println(dividaCalculadora(n,e,t,p));
	}
	
	public static double dividaCalculadora(int n, int e, int t, int p){
		
		double resAux = e + ((e *(t/100))^n); //o que vou ficar a dever 1000€ + taxa ao mes
		
		double devo = resAux - (p*n); // pago p por mes ao fim de n meses paguei p*n
		
		return devo;
	}    
}
