package program4;

import java.util.Scanner;

public class program4 {

	public static void main(String[] args) {
		  Scanner input = new Scanner(System.in);
	        int contador = 0;
	        int resposta;
	        
	        do {
	            System.out.print("Digite 1 para sim ou 0 para n�o: ");
	            resposta = input.nextInt();
	            
	            if (resposta == 1) {
	                contador++;
	                // Coloque aqui o bloco de c�digo que deve ser executado quando a resposta for "sim"
	            }
	        } while (resposta != 0);
	        
	        System.out.println("Voc� respondeu sim " + contador + " vezes.");
	    }
	}