package program4;

import java.util.Scanner;

public class program4 {

	public static void main(String[] args) {
		  Scanner input = new Scanner(System.in);
	        int contador = 0;
	        int resposta;
	        
	        do {
	            System.out.print("Digite 1 para sim ou 0 para não: ");
	            resposta = input.nextInt();
	            
	            if (resposta == 1) {
	                contador++;
	                // Coloque aqui o bloco de código que deve ser executado quando a resposta for "sim"
	            }
	        } while (resposta != 0);
	        
	        System.out.println("Você respondeu sim " + contador + " vezes.");
	    }
	}