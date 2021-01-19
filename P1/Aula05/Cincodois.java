import java.util.Scanner;

public class Cincodois {
	
	public static void main (String args[]) {
 
		// Testar função sqr:
		System.out.printf("sqr(%f) = %f\n", 10.1, sqr(10.1));
		System.out.printf("sqr(%f) = %f\n", -2.0, sqr(-2.0));
	
		// Invoque as funções pedidas no enunciado para as testar:
		// Por exemplo, para testar func f (problema 5.2):
		System.out.printf("f(%d) = %4.2f\n", 5, f(5));

		// Testar as restantes funções desenvolvidas
		System.out.printf("max(%f,%f) = %f\n", 3.1, 5.2, max(3.1, 5.2));
		System.out.printf("max(%d,%d) = %d\n", 3, 2, max(3, 2));
		int ano = getIntPos(ano);
		System.out.printf("ano = %d\n", ano);
	
	}
	
	/**
	 * sqr - calcula o quadrado de um número (real).
	 * (A classe Math tem uma função para a raiz quadrada, sqrt,
	 * mas falta-lhe uma para o quadrado: sqr colmata essa lacuna!)
	 **/
	public static double sqr(double x) {
		double y;	// variavel para resultado
		y = x*x;	// calculo do resultado a partir dos dados
		return y;	// devolver o resultado
	}
	
	// Defina as funções pedidas no enunciado:
	public static double divisao(int x){
		return (1/(1+Math.pow(x, 2)));
	}
	public static double max(double x, double y){
		double i;
		if(y>x){ i=y; y=x; x=i;}
		return x;
	}
	public static double max(int x, int y){
		int i;
		if(y>x){ i=y; y=x; x=i;}
		return x;
	}
	public static double poly3(int a, int b, int c, int d){
		double e;
		
		e = Math.pow(a, 3) + Math.pow(b, 2) + Math.pow(c, 1) + Math.pow(d, 0);
		
		return e;
	}
	public static int fact(int n){
		int f=1;
		
		for(int i=n; i>=1;i--){
			f = f*i;
		}
		
		return f;
	}
	public static int getintpos(){
		Scanner c = new Scanner (System.in);
		double a;
		do{
			System.out.println("Escreva um nmero positivo.");
			a = c.nextDouble();
		}while(a<=0 || Math.floor(a)!=a);

		c.close();
		return (int)a;
	}
	public static int getIntRange(int a, int b){

		Scanner sc = new Scanner (System.in);
		int c;
		if (a<b){
			c=a;
			a=b;
			b=c;
		}
		do{
			System.out.print("\nInsira um nmero: ");
			c = sc.nextInt();
		}while(c>=a || c<=b);
		sc.close();
		return c;
	}
	public static void printntimes(){
		
		Scanner ab = new Scanner (System.in);
		
		int a;
		System.out.print("Insere o nmero de vezes: ");
		a = ab.nextInt();
		
		for(int i=0; i<a; i++){
			System.out.print("*");
		}
		
		ab.close();
	}
	public static void retangulo(int a, int b){
		
		int i, c;
		for(i=0; i<a; i++){
			if(i==0 || i == a-1){
				for (c=0; c<b; c++){
					System.out.print("*");
				}
			}
			else{
				System.out.print("*");
				for (int d =1; d<b-1; d++){
					System.out.print(" ");
				}
				System.out.print("*");
			}
			System.out.print("\n");			
			
		}
	}
	public static double poly4(double a, double b, double c, double d){
		double e;
		
		e = 7*Math.pow(a, 3) + 3*Math.pow(b, 2) + 5*Math.pow(c, 1) + Math.pow(d, 0);
		
		return e;
	}
}

