import static java.lang.System.*;
public class P2{
	public static void main(String[] args){	
		out.print(InvertString("Maria", 0, ""));
	}
	public static String InvertString(String s, int n, String a){
		if(n == s.length() - 1){
			a = a + s.charAt(n);
			return a;
		}
		else{
			return InvertString(s, n+1, a) + s.charAt(n);
		}
	}
}
