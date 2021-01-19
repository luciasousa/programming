import static java.lang.System.*;
public class P3 {
	public static void main(String[] args) {
		out.println(isPrefix("ola","m", false));
		out.println(isPrefix("ola","o", false));
		out.println(isPrefix("lucia","lu", false));
	}
	public static boolean isPrefix(String s, String p, boolean b){
		if(s.length() >= 1){
			if(s.charAt(0) == p.charAt(0)){
				b = true;
			}
		b = isPrefix(s.substring(0,p.length()), p, b);
		}
		return b;
	}
}

