import static java.lang.System.*;

public class Fibonacci {
  public static	int[] a = new int[47];
  public static void main(String[] args) {
    if (args.length < 1) {
      out.println("USO: java -ea Fibonacci N [N ...]");
      exit(1);
    }

    // Alguns testes:
    //~ assert fibonacci(0) == 0;
    //~ assert fibonacci(1) == 1;
    //~ assert fibonacci(2) == 1;
    //~ assert fibonacci(5) == 5;

    for(int i = 0; i < args.length; i++) {
      int n = Integer.parseInt(args[i]);
      long time = nanoTime();  // System.nanoTime() gives the time in ns.
      int f = fibonacci(n);
      time = nanoTime() - time;
      out.printf("fibonacci(%d) = %d (%d ns)\n", n, f, time);
    }
  }

  public static int fibonacci(int n) {
    assert n >= 0;
    int result = 0;
    if(n == 0){
		result = 0;
	}
    
    else if(n == 1){
		result = 1;
	}
	
	if(a[n] != 0){
		a[n] = result;
	}
	
	else if(n > 1) {
		result = fibonacci(n-2) + fibonacci(n-1);
	}
	
   return result;
  }
  
}
