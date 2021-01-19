import static java.lang.System.*;

public class Agenda {
	
	Tarefa[] tarefas;
	
	public Agenda() {
		
		tarefas = new Tarefa[1000];
	}
	
	public void novaTarefa(Tarefa t) { 
		
		int n = 0;
		Tarefa[] temp = new Tarefa[1000];
		
		for(Tarefa tTemp : this.tarefas) {
			
			if(tTemp == null) {
				break;
			}
			
			else {
				 n++;
			}
		}
		
		System.arraycopy(tarefas, 0, temp, 0, n);
		
		temp[n] = new Tarefa(t.inicio, t.fim, t.texto);
		
		n++;
		
		for (int i = n; i < 1000; i++){
			
			if(this.tarefas[i] == null) {
				break;
			}
			temp[i] = this.tarefas[i-1];
		}
		
		//this.tarefas = temp
		
		n = 0;
		
		for(Tarefa t1 : temp)  {
			if(t == null) {
				break;
			}
			this.tarefas[n] = t1;
			n++;
		}
	}
	
	public void escreve() {
		
		for(Tarefa tarefa : this.tarefas) {
			if(tarefa == null) {
				break;
			}
			System.out.println(tarefa.toString());
		}
	}
	
	public Agenda filtra(Data d1, Data d2) {
		
		Tarefa intr = new Tarefa(d1, d2, "");
		
		Agenda inter = new Agenda();
		
		for (Tarefa t : this.tarefas) {
			
			if( t == null) {
				break;
			}
			if(t.intersecta(intr)) {
				inter.novaTarefa(t);
			}
			else {
				continue;
			}	
		}
		return inter;
	}
}
