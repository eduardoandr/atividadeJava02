package Atividades;

import java.util.Scanner;

//Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
public class atividade02 {

	public static void main(String[] args) {
		
		int contagem = 0, numPar = 0, numImpar = 0, numero = 0;
		
		Scanner leia = new Scanner(System.in);

		for(; contagem <= 10; contagem++) {
			
			System.out.println("Digite os contagems: ");
			 numero = leia.nextInt();
			
			 if(numero % 2 == 0) {
				numPar++;
				System.out.println("Par! ");
			}
			else {
				System.out.println("Impar! ");
				numImpar++;
			}
				
		}
		System.out.println("Numeros pares " + numPar);
		System.out.println("numeros impares " + numImpar);
		
		
		
		
		


			
	}
}
