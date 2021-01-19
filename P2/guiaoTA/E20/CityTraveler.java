import static java.lang.System.*;
import java.util.Scanner;
import java.io.*;
import pt.ua.p2utils.*;

public class CityTraveler{
	
	static HashTable<String> func = new HashTable<String>(100);
	
	public static void main(String[] args) throws IOException{
		
		for(String arg : args){
			ficFuncionarios(arg);
		}
		
		printList();
	}
	
	public static void ficFuncionarios(String fname) throws IOException{
		File f = new File(fname);
		Scanner sf = new Scanner(f);
		String city = fname; 
		while(sf.hasNextLine()){
			String funcionario = sf.nextLine();
			if(func.contains(funcionario)){
				func.set(funcionario, func.get(funcionario)+" "+city);
			}
			else{	
				func.set(funcionario, city);
			}
		}
		sf.close();
	}
	
	public static void printList(){
		String[] funcionarios = func.keys();
		for(String f : funcionarios){
			out.printf(" %s : %s\n",f, func.get(f));
		}
	}
}

