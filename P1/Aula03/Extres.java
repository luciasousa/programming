import java.util.Scanner;

public class Extres {

    public static void main(String[] args)
    {
        // Scanner para leitura de dados do teclado
        Scanner ler = new Scanner(System.in);
        long n, fact;

        System.out.print("Factorial de: ");
        n = ler.nextInt();
        
        for (n=2; n < 20; n++) {
            fact =1;
            
            for (int i = 2; i<= n; i++) {
                fact = fact * i;
            }
            System.out.printf(" %3d! = % d %n",n,fact);
        }
    }
}
