import static java.lang.System.*;

public class Ex68{
	
	public static void main(String[] args){
		
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		out.println(maxDiv(a, b));
	}
	
	public static int maxDiv(int a, int b){
		
		int mdc = 0;
		if(b == 0){
			mdc = a;
		}
		else {		
			mdc = maxDiv(b, a % b);
		}
		return mdc;
	}
}
