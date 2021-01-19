import static java.lang.System.*;

public class ReverseString {
  public static void main(String[] args) {
    out.println(reverseString("lucia"));
  }

  public static String reverseString(String a) {
	
	int n = a.length();

	if(a.length() == 1){
		
		return a;
	}
		
	else{
		
		return reverseString(a.substring(a.length()-1) + a.charAt(a.length()-2));
	}
	
  }
}

