import java.util.Scanner;

public class Exdois
{
	public static void main(String[] args)
	{
     int i=0;
     //~System.out.printf("Tabuada do %d %n", 6);

     //~System.out.printf(" %d x %d = %d %n", 6, i, 6*i++);
     //~System.out.printf(" %d x %d = %d %n", 6, i, 6*i++);
     //~System.out.printf(" %d x %d = %d %n", 6, i, 6*i++);
     //~System.out.printf(" %d x %d = %d %n", 6, i, 6*i++);

     for (int n=1; n<=10; n++) {
         System.out.printf("Tabuada do %d %n", n);
         for (int j=0; j<=10; j++) {
             System.out.printf(" %d x %d = %d %n", n, j, n*j);
            }
        }
    }
}
