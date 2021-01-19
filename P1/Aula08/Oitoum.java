import java.util.*;

public class Oitoum {
	 
	 static final Scanner sc = new Scanner(System.in);
	 
	 public static void main(String[] args) {
		 Hora inicio;
		 Hora fim;
		 
		 inicio = new Hora();
		 inicio.h = 9;
		 inicio.m = 23;
		 inicio.s = 5;
		 
		 System.out.print("Começou às ");
		 printHora(inicio); 
		 System.out.println(".");
		 System.out.println("Quando termina?");

		 fim = lerHora(); 
		 System.out.print("Início: ");
         printHora(inicio);
         System.out.print(" Fim: ");
         printHora(fim);
  }
  
	public static void printHora(Hora hora) {
		System.out.printf("%02d:%02d:%02d ",hora.h, hora.m, hora.s);
	}
	public static Hora lerHora() {
		Hora fim = new Hora();
		System.out.print("Horas: ");
		fim.h = sc.nextInt();
		System.out.print("Minutos: ");
		fim.m = sc.nextInt();
		System.out.print("Segundos: ");
		fim.s = sc.nextInt();
		return fim;
	}
  
}		

class Hora {
	int h;
	int m;
	int s;
}
