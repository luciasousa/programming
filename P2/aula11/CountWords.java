import static java.lang.System.*;
import java.util.Scanner;
import java.io.IOException;
import java.io.File;
import p2utils.KeyValueList;

public class CountWords{
public static	int count = 0;
  public static void main(String[] args) throws IOException {
    KeyValueList<Integer> counts = new KeyValueList<>();

    for (int a = 0; a < args.length; a++) { // Processa cada ficheiro
	  
      File fin = new File(args[a]);
      if (fin.exists() && fin.canRead()) {
        Scanner scf = new Scanner(fin);
        while (scf.hasNextLine()) { // Processa cada linha
          String line = scf.nextLine();
          // Divide a linha em "palavras", considerando como separador
          // qualquer sequência de 1 ou mais carateres não alfabéticos:
          String[] palavras = line.split("[^\\p{IsAlphabetic}]+");
          // (Sobre expressões regulares usadas no split: https://docs.oracle.com/javase/8/docs/api/java/util/regex/Pattern.html)

          for (int i = 0; i < palavras.length; i++) { // Processa cada palavra
			  palavras[i].toLowerCase();
          }
          for (int j = 0; j < 10; j++){
			  for (int k = 0; k < 10; k++){
				  if(palavras[j].equals(palavras[k])){
					  count++;
				  }
			  }
			  
		  }
		  
        }
        scf.close();
      }
      else {
        err.println("ERRO: Nao foi possivel ler do ficheiro "+args[a]);
      }
    }
    out.println(counts.toString("Results:\n", ";\n", "\nEnd"));
    out.println(counts.toString()); // mesma lista, outro formato
    mostFrequent(counts);
  }

  // Find and print the key with most occurrences
  // and its relative frequency.
  static void mostFrequent(KeyValueList<Integer> counts) {
		int[] f = new f[10];
		int m = 0;
		for (int i = 0; i < 10; i++){
			for (int j = 0; j < 10; j++){
				f[i] = count;
				if(f[i] > f[j]){
					m = f[i];
				}
			}
		}
		
  }
}

