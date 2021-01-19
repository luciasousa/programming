import java.util.*;

public class Oitotres {
  static final Scanner sc = new Scanner(System.in);
  
  public static void main(String[] args) {

    Statistics xstat = new Statistics();
		xstat.num = 0;
		xstat.sum = 0;
		xstat.sum2 = 0;   
		
    while (sc.hasNextDouble()) {
      double x = sc.nextDouble();
      updateStats(xstat, x);
    }
    
    System.out.printf("numero de valores = %d\n", xstat.num);
    System.out.printf("soma dos valores = %f\n", xstat.sum);
    System.out.printf("soma dos quadrados = %f\n", xstat.sum2);
    if (xstat.num > 0) {
      System.out.printf("min = %f\n", xstat.min);
      System.out.printf("max = %f\n", xstat.max);
      System.out.printf("média = %f\n", mean(xstat));
      System.out.printf("variancia = %f\n", variance(xstat));
    } else {
      System.out.printf("Lista vazia!");
    }
  }
 
	public static void updateStats(Statistics xstat, double x) {
	  xstat.num++;
		if(xstat.num == 1){
			xstat.min = x;
			xstat.max = x;
		}
		if(x > xstat.max) xstat.max = x;
		if(x < xstat.min) xstat.min = x;
		xstat.sum += x;
		xstat.sum2 += Math.pow(x,2);
	}
 
	public static double mean(Statistics xstat) {
		return xstat.sum/xstat.num;
	}

	public static double variance(Statistics xstat){
		return Math.sqrt((Math.pow(xstat.sum,2)/xstat.num)-mean(xstat));
	}

}

class Statistics {
	double max;
	double min;
	int num;
	double sum;
	double sum2;
	
}
