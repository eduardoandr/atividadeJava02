package Atividades;

public class atividade01 {

	//Informar todos os n�meros de 1000 a 1999 que quando 
	//divididos por 11 obtemos resto = 5. (FOR)
	
	public static void main(String[] args) {
		
		for(int numero = 1000; numero <= 1999; numero++) {//repeti��o, 3 
		
			if(numero % 11 == 5) {//verificando se o numero dividido por 11, sobra 5 
			
				System.out.println(numero);
				
		
		}

	}
    
 }
}