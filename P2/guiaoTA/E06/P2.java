import static java.lang.System.*;
public class P2{
	public static void main(String[] args){
		out.print(countPairs("abbcc", 0));
	}
	public static int countPairs(String s, int i){
		if(s.length() > 1){
			if(s.charAt(0) == s.charAt(1)){
				i++;
			}
			i = countPairs(s.substring(1),i);
		}
		else{
			return i;
		}
		return i;
	}
}
