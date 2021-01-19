import static java.lang.System.*;
import java.io.File;

import p2utils.LinkedList;

public class ListRec2 {

  public static void main(String[] args) {
    if (args.length != 1) {
      err.println("Uso: java -ea ListRec2 <dir>");
      exit(1);
    }

    File dir = new File(args[0]);

    // Verificar entrada
    if (!dir.exists()) {
      err.printf("ERRO: %s nao existe!\n", dir);
      exit(2);
    }

    LinkedList<File> files = recListFiles(dir);
    files.print();
  }

  /** Devolve uma lista com o conteúdo de um directório f
   *  e de todos os seus subdirectórios recursivamente.
   */
  public static LinkedList<File> recListFiles(File f) {

    //~ for (int i = 0; i < f.length(); i++){
			
		//~ out.println(f.getPath());
			
		//~ if(!f.isFile()){
			//~ out.println(f.getPath());
		//~ }
	//~ }
	
	f.getPath();
	recListFiles(f);
  }
  
  public void clone(){
	  
  }
  
  public void reverse(){
	  
  }
  
  //... continuar com o resto das funções
  
}
