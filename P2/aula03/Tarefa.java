import static java.lang.System.*;

public class Tarefa {
	
	Data inicio = new Data();
	
	String texto;
	
	Data fim = new Data();
	
	public Data inicio(){
		
		return inicio;
	}
	
	public String texto(){
			
		return texto;
	}
	
	public Data fim(){
		
		return fim;
	}
	
	public boolean intersecta(Tarefa t) {
		
		int i = this.inicio.compareTo(t.inicio);
		int j = this.inicio.compareTo(t.fim);
		int f = this.fim.compareTo(t.fim);
		int g = this.fim.compareTo(t.inicio);
		
		if((i >= 0 && j <= 0) || (g >= 0 && f <= 0) || (i<=0 &&f>=0)) {
			
			return true;
		}
		else {
			
			return false; 
		}
	
	}
	
	public Tarefa (Data inicio,Data fim,String texto) {
		
		this.inicio = inicio;
		this.texto = texto;
		this.fim = fim;

	}
	
	public String toString(){
	
		String tasks = this.inicio+"\t"+this.fim+"\t"+this.texto;
		
		return tasks;
	}
}
