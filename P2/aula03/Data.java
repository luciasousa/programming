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
    return ano%4 == 0 && ano%100 != 0 || ano%400 == 0;
  }

  public int dia() {
	  
	  return dia;
  }
	
  public int mes() {
	  
	  return mes;
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

	d = diasMesComum[mes-1];
	
	if(mes == 2 && bissexto(ano)) {
		
		d = 29;
	}
    
    return d;
    
  }

  /** Devolve o mes da data por extenso. */
  public String mesExtenso() {
    
    String[] m = {"janeiro", "fevereiro", "marco", "abril", "maio", "junho", "julho", "agosto", "setembro", "outubro", "novembro", "dezembro"};
    
	return m[this.mes-1];
    
  }


  /** Devolve esta data por extenso. */
  public String extenso() {
    
    String linha = dia + " de " + mesExtenso() + " de " + ano;
    
    return linha;
    
  }

  /** Indica se um terno (dia, mes, ano) forma uma data válida. */
  public static boolean dataValida(int dia, int mes, int ano) {
    
    if ((dia <= diasMesComum[mes-1] && dia > 0) && (!bissexto(ano)) && (mes > 0 && mes <= 12)){
		
		return true;
	}
	
	if (bissexto(ano) && (mes == 2) && (dia <= 29)){
		
		return true;
	}
	
	if (bissexto(ano) && (mes > 0 && mes <= 12) && (mes != 2) && (dia <= diasMesComum[mes-1])){
		
		return true;
	}
	
    return false;
    
  }


  public void seguinte() {
	  
	  if(this.dia < diasMesComum[mes-1]) {
		  
		  this.dia++;
	  }
	  
	  else {
		  
		  if(this.mes == 12){
			  
			  this.dia = 1;
			  this.mes = 1;
			  this.ano++;
		  }
		  
		  else{
			  
			  this.dia = 1;
			  this.mes++;
		  }
		  
	  }
    
  }
  
  public Data(String s) {
	    
	  String[] p = s.split("-");
	  
	  this.ano = Integer.parseInt(p[0]);
	  this.mes = Integer.parseInt(p[1]);
	  this.dia = Integer.parseInt(p[2]);
	  
	  if(!dataValida(this.dia,this.mes,this.ano)) {
		 
		 out.print("Data invalida");
		 System.exit(0);
	}
  }
  
  
  
  public int compareTo(Data d2){
	  
	  int n = 0;

	  if(this.ano > d2.ano()){
		  
		  n = 3;
	  }
	  
	  if(this.ano < d2.ano()){
		  
		  n = -5;
	  }
	  
	  if(this.ano == d2.ano()){
		  
		  if(this.mes > d2.mes()){
			  
			  n = 3;
		  }
		  
		  if(this.mes < d2.mes()){
			  
			  n = -5;
		  }
		  
		  if(this.mes == d2.mes()){
			  
			  if(this.dia > d2.dia()){
				  
				  n = 3;
			  }
			  
			  if(this.dia > d2.dia()){
				  
				  n = -5;
			  }
			  
			  if(this.dia == d2.dia()){
				  
				  n = 0;
			  }
		  }
		  
	  }
	  
	  //fazer com a diferença ano1-ano2 se != 0 retorna diferença se igual a 0 difrença de meses e dias...
  
	  return n;
  }
}
