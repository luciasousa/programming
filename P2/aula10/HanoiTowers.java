import static java.lang.System.*;
import java.util.Scanner;
import p2utils.*;

public class HanoiTowers{
	Stack<Integer> p1 = new Stack<Integer>();
	Stack<Integer> p2 = new Stack<Integer>();
	Stack<Integer> p3 = new Stack<Integer>();
	int n;
	public HanoiTowers(int a){
		n = a;
		for (int i = a+1; i > 0; i--){
			 p1.push(i); //p1.size()=n
		}
	}
	
	public void solve(){
		p2.push(n);
		p1.pop();
		p3.push(n);
		p2.pop();
		moveDisk(p2,p3);
	}
	
	public int numberOfMoves(){
		int count = 0;
		while(p1.size()!=0){
			count++;
		}
		return count;
	}
	
	public void moveDisk(Stack a,Stack b){
		p.push(a);
	}
	
	public String afterMoves(){
		String s = "P1: "+p1.reverseToString()+"\nP2: " + p2.reverseToString()+"\nP3: " + p3.reverseToString()+"\n";
		return s;
	}
}
