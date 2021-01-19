import java.util.*;

public class Oitoquatro {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		String operacao = "";
		while(!operacao.equals("=")){
			System.out.print("Operação: ");
			operacao = sc.nextLine();
			Complexo comp1 = Lercomplexo();
			Complexo comp2 = Lercomplexo();
			Complexo resultado = new Complexo();
			if(operacao.equals("+")){
				resultado = Adicao(comp1,comp2);
			}else if(operacao.equals("-")){
				resultado = Subtracao(comp1,comp2);
			}else if (operacao.equals("*")){
				resultado = Multiplicacao(comp1,comp2);
			}else if (operacao.equals("/")){
				resultado = Divisao (comp1,comp2);
			}
			ImprimirComplexo(resultado);
			
		}
	}
	
	public static void ImprimirComplexo(Complexo c){
		System.out.printf("%2.0f+%2.0fi\n", c.real, c.im);
	}
	
	public static Complexo Lercomplexo () {
		Complexo c = new Complexo();
		System.out.print("Introduza um número complexo: \n");
		System.out.print("Parte real: ");
		c.real = sc.nextInt();
		System.out.print("Parte imaginária: ");
		c.im = sc.nextInt();
		return c;
	}
	
	public static Complexo Adicao(Complexo comp1, Complexo comp2) {
		Complexo r = new Complexo();
		r.real= comp1.real + comp2.real;
		r.im=comp1.im+comp2.im;
		return r;
	}
	public static Complexo Subtracao(Complexo comp1, Complexo comp2) {
		Complexo r = new Complexo();
		r.real= comp1.real - comp2.real;
		r.im=comp1.im - comp2.im;
		return r;
	}
	
	public static Complexo Multiplicacao (Complexo comp1, Complexo comp2) {
		Complexo r = new Complexo();
		r.real= (comp1.real*comp2.real) - (comp1.im+comp2.im);
		r.im = (comp1.im*comp2.real) + (comp2.im*comp1.real);
		return r;
	}
	
	public static Complexo Divisao (Complexo comp1, Complexo comp2) {
		Complexo r = new Complexo();
		r.real= ((comp1.real*comp2.real)+(comp1.im*comp2.im))/(Math.pow(comp2.real,2)+Math.pow(comp2.im,2));
		r.im = ((comp1.im*comp2.real)- (comp1.real*comp2.im))/(Math.pow(comp2.real,2)+Math.pow(comp2.im,2));
		return r;
	}
}	
	class Complexo {
		double real;
		double im;
	
	}
	
