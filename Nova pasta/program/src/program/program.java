package program;

import java.util.Scanner;

public class program {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);	
		
		int resultado = 0;
		
		for(int numero = 1; numero <= 50; numero++) {
			if(numero % 2 != 0) {
				resultado =(resultado + numero);
				
				
			}
		}
		System.out.println(resultado);
	}

}