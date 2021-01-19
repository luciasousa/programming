import static java.lang.System.*;
import java.io.*;
import java.util.*;


public class ListDir{
	
	public static void main(String[] args){
		
		String dir = "";
		File file;
		
		try{
			dir = args[0];
			file = new File(dir);
			if(!file.canRead()) throw new IOException();
		
		}catch(ArrayIndexOutOfBoundsException | IOException e){
			dir = ".\\";
			file = new File(dir);
		}
		finally{
			out.println("O diretorio é " +dir);
		}
		
		File afile[] = file.listFiles();
		int i = 0;
		
		for (int j = afile.length; i < j; i++){
			
			File arquivos = afile[i];
			out.print(arquivos.getName()+"\t\t\t( ");
			
			if(!arquivos.isFile()) out.print("Dir ");
			if(arquivos.canWrite()) out.print("Write ");
			if(arquivos.canRead()) out.print("Read ");
			
			out.print(" )\n");
			
		}
		
	}
}
