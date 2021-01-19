import java.io.*;

public class Setetres {
	
	public static void main(String[] args) {

	int option;
	int num;
	
	//MENU
	System.out.printf("-->> Análise de uma sequência de números inteiros <<--\n");
	System.out.printf("\n");
	System.out.printf("1 - Ler sequência\n");
	System.out.printf("2 - Imprimir sequência\n");
	System.out.printf("3 - Calcular o máximo da sequência\n");
	System.out.printf("4 - Calcular o mínimo da sequência\n");
	System.out.printf("5 - Calcular média da sequência\n");
	System.out.printf("6 - Detetar se é uma sequência só constituída por números pares\n");
	System.out.printf("10 - Terminar o programa\n");
	
	System.out.printf("11 - Ler uma sequência de números de um ficheiro de texto\n");
	System.out.printf("12 - Adicionar números à sequência existente\n");
	System.out.printf("13 - Gravar a sequência atual de números num ficheiro\n"); 
	
	System.out.printf("\n");
	
	do {
		
			System.out.printf("Opção -> ");
			option=read.nextInt();
			switch(option){
				
				case 1:
					lerSeq(arrayInt);
					break;
					
				case 2:
					impSeq(arrayInt);
					break;
					
				case 3:
					System.out.printf("O valor máximo da sequência é: %d\n",max(arrayInt));
					break;
					
				case 4:
					System.out.printf("O valor mínimo da sequência é: %d\n",min(arrayInt));
					break;
					
				case 5:
					System.out.printf("O valor médio da sequência é: %d\n",med(arrayInt));
					break;
					
				case 6:
					par(arrayInt);
					break;
					
				case 10:
				
					break;
					
				case 11:
				
					System.out.printf("Nome do ficheiro que contém os números: ");
					String nameFile = read.next();
					fileIn = new File(nameFile);
					checkFile(fileIn, nameFile);
					read = new Scanner(fileIn);
					
					for(int i=0;scf.hasNextLine();i++){
						arrayFile[i] = scf.nextInt();
						numNewEl++;
					}
					
					System.out.printf("Numeros lidos com sucesso!\n");
				
					break;
				
				case 12:
					
					for(int i=0;i<(numEl+numNewEl);i++){
						arrayInt[numEl+i] = arrayFile[i];
					}
					
					numEl += numNewEl;
					System.out.printf("Numeros adicionados com sucesso!\n");			
				
					break;
				
				case 13:
					
					for(int i=0;i<numEl;i++){
						write.println(arrayInt[i]);
					}
					
					write.close();
					System.out.printf("Sequencia imprimida para o ficheiro!\n");
					
					break;
					
				default:
					System.out.printf("OPÇÃO INVÁLIDA!\n");
					break;
					
			}
			
		}while(option!=10);//TERMINA QUANDO É INTRODUZIDO 10
		
	}
	
	//Ler sequência
	
	public static void lerSeq(int[] array){
		Scanner read = new Scanner(System.in);
		int i=0;
		int count=0;
		do{
			System.out.print("Valor: ");
			array[i]=read.nextInt();
			i++;
			count++;
		}while(array[i-1]!=0);
		count--;
	}
	
	//Imprimir sequência
	
	public static void impSeq(int array[]){
		for(int i=0;array[i]!=0;i++){
			System.out.printf("array[%d] = %d\n",i,array[i]);
		}
	}
	
	//Calcular máximo da sequência
	
	public static int max(int[] array){
		int max = array[0];
		int count =0;
		for(int i=0;i<count;i++){
			if(array[i]>max){max=array[i];}
		}
		return max;
	}
	
	//Calcular mínimo da sequência
	
	public static int min(int[] array){
		int min = array[0];
		int count=0;
		for(int i=0; i<count; i++){
			if(array[i]<min){min=array[i];}
		}
		return min;
	}
	
	//Calcular a média da sequência
	
	public static int med(int[] array){
		int soma=0, media;
		int count=0;
		for(int i=0; i<count; i++){
			soma+=array[i];
		}
		System.out.printf("Soma: %d\n",soma);
		System.out.printf("Nº ELEMENTOS: %d\n",count);
		media = soma/(count);
		return media;
	}
	
	//Detetar se é uma sequência par
	
	public static void par(int[] array){
		int numPar=0;
		int count=0;
		for(int i=0; i<count; i++){
			if(array[i]%2==0) numPar++;
		}
		if(numPar==count){ 
			
			System.out.print("A sequência é constituida por números pares\n");
		
		}
		
		else{
			
			System.out.print("A sequência não é constituida por números pares\n");
		}
		
		public static void checkFile(File fileIn, String nameFile){
		
			File fin = new File(nameIn);
			if(!fileIn.exists()){
			System.out.printf("ERROR: The file %s doesn't exist.\n",nameFile);
			System.exit(1);
			}
			
			if(!fileIn.canRead()){
			System.out.printf("ERROR: The file %s cannot be read.\n",nameFile);
			System.exit(2);
			}

		}
	}
}
