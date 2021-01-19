import static java.lang.System.*;
import java.util.Scanner;
import p2utils.*;
public class Palindrome{
	public static void main (String[] args){
		String s = args[0];
		char[] ca = new char[s.length()];
		for (int k = 0; k < s.length(); k++){
			ca[k] = s.charAt(k);
		}
		Stack<Character> pilha = new Stack<Character>();
		Queue<Character> fila = new Queue<Character>();
		for (int i = 0; i < s.length(); i++){
			 pilha.push(ca[i]);
		}
		for (int j = 0; j < s.length(); j++){
			fila.in(ca[j]);
		}
		while(!pilha.isEmpty() && pilha.top()==fila.peek()){
			pilha.pop();
			fila.out();
		}
		if(pilha.isEmpty()){
			out.println("é palindrome");
		}
		else{
			out.println("nao é palindrome");
		}
	}
}
