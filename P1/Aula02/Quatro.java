import java.util.Scanner;

public class Quatro
{
	public static void main(String[] args)
	{
		//Ler dados
		Scanner sc = new Scanner(System.in);
		int mes, ano;
		int i=0;
		
		//Ler dados do teclado
		System.out.print("Insira o ano: ");
		ano = sc.nextInt();
		System.out.println();
		
		System.out.print("Insira o mês: ");
		mes = sc.nextInt();
		System.out.println();
		
		if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12){
				
				i=31;
				
			}
			
			else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
				
				i=30;
				
			}
			
			else  if (mes==2){
				
				if((ano%4)==0){
					
					if((ano%100)==0){
						
						if((ano%400)==0){
							
							i=29;
							
						}
						
						else {
							
							i=28;
							
						}
						
					}
					
					else {
						
						i=29;
						
					}
					
				}
				
				else{
					
					i=28;
					
				}
				
			}
		    
		System.out.println("O mes " + mes + " do ano " + ano + " tem " + i + " dias.");

	}
}
