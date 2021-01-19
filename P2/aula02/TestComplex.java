import java.util.Scanner;
import static java.lang.System.*;

public class TestComplex {
  // Exemplo simples de utilização da class Complex
  public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		double r = 0;
		double i = 0;
		
		if (args.length < 2) {
			System.out.print("Re: ");
			r = sc.nextDouble();
		
			System.out.print("Im: ");
			i = sc.nextDouble();
		}
		
		else {
			
			r = Double.parseDouble(args[0]);
			i = Double.parseDouble(args[1]);
		}
		Complex a = new Complex(r, i);

    // Vamos usar métodos do objeto a
		out.println("(" + a.real() + " + " + a.imag() + "i)");
		out.println("  parte real = " + a.real());
		out.println("  parte imaginaria = " + a.imag());
		out.println("  modulo = " + a.abs());
		out.printf("  argumento =  %2.2f\n", a.arg());
		
  }

}
 class Complex {
  private double re; // stores the real part
  private double im; // stores the imaginary part

  // Constructor
  // Example usage: "Complex n1 = new Complex(2,3);"
  public Complex(double real, double imag) {
    re = real;
    im = imag;
  }

  public double real() {   // real part
    return re;
  } 

  public double imag() {   // imaginary part
    return im;
  } 

  public double abs() {    // absolute value (modulus)
    return Math.sqrt(re * re + im * im);
  } 

  public double arg() {  // argument (aka angle or phase) between -pi and pi
    return Math.atan2(im, re);
  } 

}
