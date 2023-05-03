package program2;

import java.util.Scanner;

public class program2 {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Vc quer adicionar mais uma pessoa na sua HOSPEDAGEM?");
		
		System.out.println("se sim Tecle 1 se não tecle 2:");
		int numero = sc.nextInt();
		
		int contador = 1;
		
		while(numero == 1){

	   System.out.println("quantifades de pessoas: "+contador);
	   contador++;
	   System.out.println("\nVc quer adicionar mais uma pessoa na sua HOSPEDAGEM?");
	   System.out.println("\nse sim Tecle 1 se não tecle 2:");
	   numero = sc.nextInt();
		}
	}

	}

