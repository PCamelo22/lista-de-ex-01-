package program3;

import java.util.Scanner;

public class program3 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		
		System.out.println("me fale a altura da primeira pesssoa: ");
		double altura1 = sc.nextDouble();
		
		System.out.println("me fale a altura da segunda pesssoa: ");
		double altura2 = sc.nextDouble();
		
		System.out.println("me fale a altura da terceira pesssoa: ");
		double altura3 = sc.nextDouble();
		
		System.out.println("me fale a altura da quarta pesssoa: ");
		double altura4 = sc.nextDouble();
		
		System.out.println("me fale a altura da quinta pesssoa: ");
		double altura5 = sc.nextDouble();
		
		double resultado = ((altura1+altura2+altura3+altura4+altura5)/5);
		
		System.out.println("irei mostra á media de alruta entre os 5. ");
		
		System.out.println("a altura em media é:"+resultado);

	}

}