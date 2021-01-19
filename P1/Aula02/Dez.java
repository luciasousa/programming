import java.util.Scanner;

public class Dez
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int ano, mes, dia, ano2=0, mes2=0, dia2=0, ano1=0, mes1=0, dia1=0;
		int i=0;
		
		System.out.print("Insira o ano: ");
		ano = sc.nextInt();
		System.out.println();
		
		System.out.print("Insira o mes: ");
		mes = sc.nextInt();
		System.out.println();
		
		System.out.print("Insira o dia: ");
		dia = sc.nextInt();
		System.out.println();

		if ((mes == 1) || (mes == 3)||(mes == 5)||(mes == 7)|| (mes == 8)||(mes == 10)||(mes == 12)){
			
			i=31;
			if(dia==31){
				if(mes==12){
					ano2=ano+1;
					mes2=1;
					dia2=1;
				}
			if(dia==1){
				if (mes==1){
					ano1=ano-1;
					mes1=12;
					dia=31;
					}
				}
				else{
					ano2=ano;
					mes2=mes+1;
					dia2=dia+1;
					ano1=ano;
					mes1=mes-1;
					dia1=dia-1;
					
				}
			}
			else{
				ano2=ano;
				mes2=mes;
				dia2=dia+1;
				ano1=ano;
				mes1=mes;
				dia1=dia-1;
				
			}
				
			
			
		}
		else if ((mes == 4) || (mes == 6)||(mes == 9)||(mes == 11)){
			
			i=30;
			if (dia==30){
				dia2=1;
				mes2=mes+1;
				ano2=ano;
				dia1=dia-1;
				mes1=mes;
				ano1=ano;
			}
			if (dia==1){
				dia2=dia+1;
				mes2=mes;
				ano2=ano;
				dia1=31;
				mes1=mes-1;
				ano1=ano;
			}
			else{
				dia2=dia+1;
				mes2=mes;
				ano2=ano;
				dia1=dia-1;
				mes1=mes;
				ano1=ano;
				
			}
			
		}
		
		else if (mes==2){
			
			if((ano%4)==0){
				
				if((ano%100)==0){
					if((ano%400)==0){
						i=29;
						
						if(dia==29){
							dia2=1;
							mes2=3;
							ano2=ano;
							dia1=dia-1;
							mes1=mes;
							ano1=ano;
						}
						else if(dia==1){
							dia2=dia+1;
							mes2=mes;
							ano2=ano;
							dia1=31;
							mes1=mes-1;
							ano1=ano;
						}
						else{
							dia2=dia+1;
							mes2=2;
							ano2=ano;
							dia1=dia-1;
							mes1=mes;
							ano1=ano;
							
						}
						
					}
					else{
						i=28;
						if (dia==28){
							dia2=1;
							mes2=3;
							ano2=ano;
							dia1=dia-1;
							mes1=mes;
							ano1=ano;
						}
						else if(dia==1){
							dia2=dia+1;
							mes2=mes;
							ano2=ano;
							dia1=31;
							mes1=mes-1;
							ano1=ano;
						}
						else{
							dia2=dia+1;
							mes2=2;
							ano2=ano;
							dia1=dia-1;
							mes1=mes;
							ano1=ano;
							
						}
					}
					
					
				}
				
				else {
					i=29;
					if (dia==29){
						dia2=1;
						mes2=3;
						ano2=ano;
						dia1=dia-1;
						mes1=mes;
						ano1=ano;
					}
					else if(dia==1){
						dia2=dia+1;
						mes2=mes;
						ano2=ano;
						dia1=31;
						mes1=1;
						ano1=ano;
					}
					else{
						dia2=dia+1;
						mes2=2;
						ano2=ano;
						dia1=dia-1;
						mes1=mes;
						ano1=ano;
					}
				}

				
			}
			else{
				i=28;
				if(dia==28){
					dia2=1;
					mes2=3;
					ano2=ano;
					dia1=dia-1;
					mes1=mes;
					ano1=ano;
				}
				else if(dia==1){
					dia2=dia+1;
					mes2=mes;
					ano2=ano;
					dia1=31;
					mes1=1;
					ano1=ano;
				}
				else{
					dia2=dia+1;
					mes2=2;
					ano2=ano;
					dia1=dia-1;
					mes1=mes;
					ano1=ano;
				}
			}

			
		}
		
		System.out.println("O dia anterior é dia " + dia1 + " do mês " + mes1 + " do ano " + ano1 + ".");
		System.out.println("O dia seguinte é dia " + dia2 + " do mês " + mes2 + " do ano " + ano2 + ".");
	}

}
	
