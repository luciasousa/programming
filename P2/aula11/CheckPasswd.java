import p2utils.KeyValueList;
import java.lang.System.*;
import java.util.Scanner;
import java.io.*;

public class CheckPasswd{
	public static void main(String[] args) throws IOException {
		File f = new File(args[0]);
		Scanner sf = new Scanner(f);
		String[] a = new String[10];
		String username = "";
		String password = "";
		do{
			String s = sf.nextLine();
			a = s.split(" ");
			username = a[0];
			password = a[1];
		}while(!sf.hasNextLine());
		sf.close();
		KeyValueList<String> lista = new KeyValueList<>();
		for (int i = 0; i < 10; i++){
			lista.set(a[0], a[1]);
		}
		do{
		System.out.printf("\n\nUsername: %s\nPassword: %s\n", username, password);
		}while(!lista.isEmpty());
		if(lista.set(username, password)){
			System.out.println("Authentication successful");
		}
		else{
			System.out.println("Authentication failed");
		}
	}
}
