import java.util.Scanner;
import java.io.*;

public class Sete2 {
	
	public static void main(String[] args) throws IOException {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nome do ficheiro: ");
		String nome = sc.nextLine();
		
		File fin1 = new File(nome);
		
		if (!fin1.canRead()) {
			
			System.out.print("Nao consegue ler ficheiro");
		}
		
		System.out.print("Nome do ficheiro para copiar: ");
		String nome2 = sc.nextLine();
		
		File fin2 = new File(nome2);
		
		Scanner sf1 = new Scanner(fin1);
		PrintWriter pw2 = new PrintWriter(fin2);
		
		while(sf1.hasNextLine()) {
			
			String linha = sf1.nextLine();
			pw2.println(linha);
		}
		sf1.close();
		pw2.close();
	}
}
