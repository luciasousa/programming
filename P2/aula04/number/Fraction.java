package number;

/**
 * Tipo de dados representando uma fracção.
 * Nesta versão pretende-se garantir um invariante (interno) mais forte:
 * as frações armazenadas devem ter sempre denominador positivo.
 * Isto permite simplificar alguns métodos.
 *
 * AVISO: Vários métodos podem dar erros devidos a overflow.
 * (Não deve haver problemas com numeradores e denominadores até 46430.)
 *
 * @author João Manuel Rodrigues
 * 2007--2018
 */

public class Fraction
{
  private int num;
  private int den;
  
  static final Fraction ZERO = new Fraction(0, 1);
  static final Fraction ONE = new Fraction(1, 1);
  /** Cria uma nova fracção a partir de um par (numerador, denominador).
   *  @param num numerador da nova fracção.
   *  @param den denominador da nova fracção.
   *  <b>Exige (pré-condição):</b> den != 0.
   */
  public Fraction(int num, int den) {
    assert den != 0; // check precondition
    
    if (den < 0) {
		
		den = Math.abs(den);
		num = -num;
	}
    
    this.num = num;
    this.den = den;
    this.reduce();
    assert invariant(); // check object invariant
  }

  /* Testa o invariante do objeto.
   * Ou seja, a propriedade que define a validade de uma fração.
   * É para testar em asserções nos métodos.
   */
  public boolean invariant() {
    return den > 0;   // O denominador não pode ser nulo!
  }

  /** Converte uma string numa fracção.
   *  @param str String no formato {@code "inteiro/inteiro"}
   *             representando uma fracção válida.
   *  @return fracção correspondente a {@code str}.
   */
  public static Fraction parseFraction(String str) {
    String[] p = str.split("/", 2);  // divide a string em até 2 partes
    int n = Integer.parseInt(p[0]);  // extrai numerador
    int d = (p.length==2)? Integer.parseInt(p[1]) : 1;
        // se tem 2 partes, extrai denominador, senão fica d=1
    if (d == 0) return null;
    
    if (d < 0){
		d =-d;
		n = -n;
	}
    return new Fraction(n, d);
  }

  /** Converte a fracção numa string.
   *  @return string com a representação desta fracção.
   */
  public String toString() {
    // Com um invariante mais forte, podemos simplificar este método!
    String s;
    
    s = num + "/" + den;

    return s;
  }

  /** Devolve o numerador da fracção.
   *  @return numerador desta fração.
   */
  public int num() { return num; }

  /** Devolve o denominador da fracção.
   *  @return denominador desta fração.
   */
  public int den() { return den; }

  /** Multiplica esta fracção por outra (this * b).
   *  @param b multiplicando.
   *  @return fracção produto de this * b.
   */
  public Fraction multiply(Fraction b) {
    int n = num*b.num;
    int d = den*b.den;
    Fraction p = new Fraction(n, d); // product
    p.reduce();
    return p;
  }

  /** Adiciona esta fracção com outra (this + b).
   *  @param b fracção a adicionar a esta.
   *  @return fracção soma de this + b.
   */
  public Fraction add(Fraction b) {
    int n = num*b.den + den*b.num;
    int d = den*b.den;
    Fraction s = new Fraction(n, d); // sum
    s.reduce();
    return s;
  }

  public Fraction divide(Fraction b) {
    
    assert b.den != 0 && this.den != 0 : "Dividir por zero! Erro";
    
    int x = this.num * b.den;
    int y = this.den * b.num;
    
    Fraction a = new Fraction(x,y);
    a.reduce();
    assert invariant();
    
    return a;
  }

  public Fraction subtract(Fraction b) {
   
    int w = 0;
	
	int z = 0;
	
	
	for(int i = 1; i < this.den; i++){
		
		for(int j = 1; j < b.den; j++){
		
			if(i*b.den == this.den){
				z = this.den;
				w = this.num - i*b.num;
			}
		
			if(b.den == j*this.den){
				z = b.den;
				w = this.num*j - b.num;
			}
			
			if(b.den*i == j*this.den){
				z = b.den*i;
				w = this.num*j - b.den*i;
			}
		
		}
	}
	
	Fraction c = new Fraction(w,z);
	c.reduce();
    assert invariant();
	
	return c;
  }

  public boolean equals(Fraction b) {
    
    if((this.num == b.num) && (this.den == b.den)){
		
		return true;
	}
	
	else{
		
		return false;
	}
    
  }

  public int compareTo(Fraction b) {
   
	double x1 = b.num / b.den;
	double x2 = this.num / this.den;
	
	int a = 0;
	
	if (x1 == x2){
		a = 0;
	}
	
	if (x1 < x2){
		a = -1;
	}
	
	if (x1 > x2){
		a = 1;
	}
   
   return a;
  }
  
  private void reduce() {
	  
	  int n = this.num, d = this.den;
	  int div;
	  
	  div = (n<d) ? n:d;
	  
	  for(;div >= 0;div--) {
		  
		  if(n%div==0 && d%div==0){
			  break;
		  }
		  if(div==0){
			  return;
		  }
		  this.num =n/div;
		  this.den =d/div;
	  }
  }

}
