import java.io.*;
import java.util.*;
import static java.lang.System.*;

public class CopyFile {

	public static void main(String[] args){

		String dir=null;
		File file;
		
		try{
			dir=args[0];
			file = new File(dir);
			if(!file.canRead()) throw new IOException();
		}catch(ArrayIndexOutOfBoundsException | IOException e){
			dir=".\\";
			file = new File(dir);
		}
		finally{
			out.println("O diretório é "+dir);
		}
		
		
		File afile[] = file.listFiles(); 
		int i = 0; 
		for (int j = afile.length; i < j; i++) { 
			File arquivos = afile[i]; 
			System.out.print(arquivos.getName()+"\t\t\t( ");
			if(!arquivos.isFile()) out.print("Dir ");
			if(arquivos.canWrite()) out.print("Write ");
			if(arquivos.canRead()) out.print("Read ");
			System.out.print(" )\n");
		} 
		
	}

}
