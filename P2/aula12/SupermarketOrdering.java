import static java.lang.System.*;
import java.util.Scanner;
import p2utils.*;

public class SupermarketOrdering{
	
	private int numOrders = 0;
	private Queue<Order> orders = new Queue<>();
	private HashTable<Integer> products = new HashTable<>(10);
	
	public void enterOrder(Order o){
		orders.in(o); //adicionar order na fila
		numOrders++;
		
		if(products.contains(o.prodName)){
			products.set(o.prodName, products.get(o.prodName) + o.quantity);
		}
		else{
			products.set(o.prodName, o.quantity);
		}
	}
	
	public Order serveOrder(){
		
		Order served = orders.peek();
		
		products.set(served.prodName, products.get(served.prodName) - served.quantity);
		
		orders.out();
		numOrders--;
		
		return served;
	}
	
	public int query(String product){
		
		return products.get(product);
	}
	
	public void displayOrders(){
		String[] keys = products.keys();
		out.println("Ordered products:");
		for (int i = 0; i < keys.length; i++){
			int requested = products.get(keys[i]);
			if(requested > 0){
				out.println(keys[i]+":"+requested+" ");
			}
		}
		out.println();
	}
	
	public int numOrders(){
		return numOrders;
	}
}
