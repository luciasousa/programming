import static java.lang.System.*;
import java.util.Calendar;

public class Data {
  private int dia, mes, ano;

  /** Inicia esta data com o dia de hoje. */
  public Data() {
    // Aqui usamos a classe Calendar da biblioteca standard para obter a data atual.
    Calendar today = Calendar.getInstance();
    dia = today.get(Calendar.DAY_OF_MONTH);
    mes = today.get(Calendar.MONTH) + 1;
    ano = today.get(Calendar.YEAR);
  }
  /** Inicia a data a partir do dia, mes e ano dados. */
  public Data(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
  }
  /** Devolve esta data segundo a norma ISO 8601. */
  public String toString() {	
		return String.format("%04d-%02d-%02d", ano, mes, dia);
  }
  /** Indica se ano é bissexto. */
  public static boolean bissexto(int ano) {
		if(ano%4 == 0 && ano%100 != 0 || ano%400 == 0) {
			return true;
		}
		else{
			return false;
		}
  }
  // Crie métodos para obter o dia, mes e ano da data.
	public int mes() {	
		return mes;
	}
	public int dia() {	
		return dia;
	}
	public int ano() {	
		return ano;
	}	
  /** Dimensões dos meses num ano comum. */
  private static final
  int[] diasMesComum = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
  /** Devolve o número de dias do mês dado. */
  public static int diasDoMes(int mes, int ano) {
    int d = 0;
    for (int i = 0; i < diasMesComum.length; i++){
		if (mes !=2) {
			if(diasMesComum[i] == 31) {
				d = 31;
			}
			if(diasMesComum[i] == 30) {	
				d = 30;
			}	
		}
		else {
			if (bissexto(ano) && i ==1 ) {
				d = 29;
			}
			else if (!bissexto(ano) && i ==1){	
				d = 28;
			}
		}	
	}
    return d; 
  }
  /** Devolve o mes da data por extenso. */
  public String mesExtenso() {
	  String[] meses = {"janeiro", "fevereiro", "marco", "abril", "maio", "junho", "julho", "agosto", "setembro", "outubro", "novembro", "dezembro"};
	  String m;
	  m = meses[mes-1]; 
	 return m; 
  }
  /** Devolve esta data por extenso. */
  public String extenso() {
		String d = dia + " de " + mesExtenso() + " de " + ano;	
		return d;
  }
  /** Indica se um terno (dia, mes, ano) forma uma data válida. */
  public static boolean dataValida(int dia, int mes, int ano) {
		if (mes == 2 && bissexto(ano)) {
			if(dia >= 1 && dia <= 29){		
				return true;
			}
		}
		if (mes == 2 && !bissexto(ano)) {
			if(dia >= 1 && dia <= 28){		
				return true;
			}
		}
		if((mes == 4 || mes == 6 || mes == 9 || mes == 11) && (dia >= 1 && dia <= 30)) {	
			return true;
		}
		if ((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) && (dia >= 1 && dia <= 31)) {	
			return true;
		}	
		return false;
  }
  public void seguinte() {
		if(mes != 12 && mes != 2){
			if(dia < diasMesComum[mes-1]) {	
				dia++;
			}
			if(diasMesComum[mes-1] == dia){	
				dia = 1;
				mes++;
			}	
		}
		if(mes == 12){
			if(dia < diasMesComum[mes-1]) {	
				dia++;
			}
			if(diasMesComum[mes-1] == dia){	
				dia = 1;
				mes = 1;
				ano++;
			}	
		}
		if (mes == 2){
			if(dia < diasMesComum[mes-1]) {	
				dia++;
			}
			if(diasMesComum[mes-1] == dia){
				dia = 1;
				mes++;		
			}
		}	
  }
}

