package principal;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		
		System.out.println("Insira uma nota entre 0 e 10: ");
		double nota = sc.nextDouble();
		
		
		while(nota < 0 || nota > 10) {
			System.out.println("Valor inválido! \nInsira uma nota entre 0 e 10: ");
			
			nota = sc.nextDouble();
		}
	
		System.out.printf("A nota digitada foi: " + nota);

	sc.close();
	}
}
