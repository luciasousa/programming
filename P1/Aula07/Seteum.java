import java.util.Scanner;
import java.io.*;

public class Seteum {
	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		
		listaDir(".");
		
		System.out.print("Ficheiro de entrada: ");
		String nameIn = sc.nextLine();
		File fin = new File(nameIn);
		
		if(!fin.exists()) {
			
			System.out.println("ERRO: ficheiro " + nameIn + " não existe!");
			System.exit(2);
		}
		if(!fin.isDirectory()) {
			
			System.out.println("ERRO: ficheiro " + nameIn + " é um diretório!");
			System.exit(3);
		}
		if(!fin.canRead()) {
			
			System.out.println("ERRO: ficheiro " + nameIn + " não pode ser lido!");
			System.exit(4);
		}
		
		System.out.println("Ficheiro válido!");
		
		System.out.print("Ficheiro de saída: ");
		String nameOut = sc.nextLine();
		
		File fout = new File(nameOut);
		PrintWriter pw = new PrintWriter(fout);
		
		 Scanner scf = new Scanner(fin);
        int cont = 0;
       
        while(scf.hasNextLine()) {
            cont++;
            scf.nextLine();
        }

        String[] linhas = new String[cont];

        scf.close();  
        
        scf = new Scanner(new FileReader("t1.txt")); 
        for(int i = 0 ; i < cont ; i++) {
            String s = scf.nextLine();
            linhas[i] = s;
        }
        scf.close();
       
        for(int i = 0 ; i < cont ; i++) {
            pw.println(linhas[i]);
        }
        pw.printf("\n%10s \n%d\n", "Numero de linhas copiadas: ", cont); 
        pw.close();



    }

    public static void listaDir(String nomeDir) {
        String[] lista = new String[100];
        File fin1 = new File(nomeDir);
        lista = fin1.list();  
        for (String n : lista) {
            File f = new File(n);
            System.out.printf("%-30s %5s\n", n, f.isDirectory()? "DIR":f.length());
        }
    }
}

