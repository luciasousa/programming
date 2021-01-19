import static java.lang.System.*;

public class DatasPassadas {

	public static void main(String[] args) {
		
		Data atual = new Data();
		
		Data natal = new Data(25,12,2018);
		
		
		do{
			natal.seguinte();
			System.out.println(natal.extenso());
			
		} while( natal.dia() != atual.dia() || natal.mes() != atual.mes() || natal.ano() != atual.ano() );
	}

}

	
