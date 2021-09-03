package Atividades;

import java.util.Scanner;

/*Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de 21 anos.
Total de pessoas com mais de 50 anos.
O programa termina quando idade for =-99. (WHILE)*/

public class atividade03 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int idade = 0, jovens = 0, velhos = 0, totalDePessoas = 0;
		
		while(idade != -99) {
			System.out.println("Digite sua idade: ");
			idade = leia.nextInt();
			
			if(idade > 50) {
				velhos++;
			}
			else if(idade < 21) {
				jovens++;
			}
		    totalDePessoas++;
		    }
		    System.out.println("O numero de pessoas com menos de 21 anos é: " + jovens);
		    System.out.println("O numero de pessoas com mais de 50 anos é: " + velhos);
		    System.out.println("O numero total de pessoas é: " + totalDePessoas);

	}

}
