import static java.lang.System.*;
import java.util.Scanner;
import java.io.*;
import p2utils.*;

public class Restaurante {
	
	static HashTable<Integer> stock = new HashTable<Integer>(100);
	static Queue<HashTable<Integer>> fila = new Queue<HashTable<Integer>>();
	
	public static void main(String[] args) throws IOException{
		
		for(String arg : args){
			processOrders(arg);
		}
		
		printStock();
		printPending();
	}
	
	public static void processOrders(String fname) throws IOException{
		
		Scanner sf = new Scanner(fname);
		
		while(sf.hasNextLine()){
			String action = sf.nextLine();
			
			if(action.contains("entrada:")){
				String stockIn = action.split(" ")[1];
				if(stock.contains(stockIn)){
					stock.set(stockIn, stock.get(stockIn) + 1);
				}
				else{
					stock.set(stockIn, 1);
				}
			}
			
			else if (action.contains("saída:")){
				String[] items = action.split(" ");
				HashTable<Integer> hash = new HashTable<Integer>(30);
				for (int i = 1; i < items.length; i++){
					String[] order = items[i].split(":"); //sopa:1, ou seja uma sopa
					hash.set(order[0], Integer.parseInt(order[1])); 
				}
				fila.in(hash);
			}
			
			if(!fila.isEmpty()){
				HashTable<Integer> nextOrder = fila.peek();
				if(canBeServed(nextOrder)){
					serveOrder(nextOrder);
					out.printf("Refeicao servida: %s\n",orderToString(nextOrder));
				}
				
			}
			
		}
		sf.close();
	}
	
	public static void serveOrder(HashTable<Integer> order){
		String[] keys = order.keys();
		for(String key : keys){
			stock.set(key, stock.get(key) - order.get(key)); //quantidade do stock menos quantidade do que foi servido
		}
		fila.out();
	}
	
	public static boolean canBeServed(HashTable<Integer> order){
		String[] keys = order.keys();
		boolean serve = true;
		for (String key : keys){
			if(stock.contains(key)){
				if(order.get(key) > stock.get(key)){
					serve = false;
					break;
				}
			}
			else{
				serve = false;
				break;
			}
		}
		return serve;
	}
	
	public static void printStock(){
		String[] keys = stock.keys();
		out.println("Comida em stock: ");
		for(String key : keys){
			out.printf(" %s: %d\n",key, stock.get(key));
		}
	}
	
	public static void printPending(){
		while(!fila.isEmpty()){
			out.printf("Refeicao pendente : %s\n", orderToString(fila.peek()));
			fila.out();
		}
	}
	
	public static String orderToString(HashTable<Integer> order){
		String str = "";
		String[] keys = order.keys();
		for(String key : keys){
			str += key + ":" + order.get(key) + " ";
		}
		return str;
	}
}

