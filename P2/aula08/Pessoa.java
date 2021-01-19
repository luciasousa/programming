import static java.lang.System.*;

public class Pessoa implements Comparable<Pessoa>
{
	private Data nasc;
	private String nome;
	
	public Pessoa(Data nasc, String nome){
		this.nasc = nasc;
		this.nome = nome;
	}
	
	public String toString(Data nasc, String nome){
		
		String s = nasc.toString() + "" + nome;
		return s;
	}
	
	public int compareTo(Data d2){

		int d = 0;
		
		if(this.nasc.mes > d2.mes){
			d = 1;
		}
		else if(this.nasc.mes < d2.mes){
			d = -1;
		}
		else{
			if(this.nasc.dia > d2.dia){
			d = 1;
			}
		
			else if(this.nasc.dia < d2.dia){
			d = -1;
			}
		}
		return d;
	}
}
