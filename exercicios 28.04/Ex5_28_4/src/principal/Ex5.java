package principal;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int n1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int n2 = scanner.nextInt();

        System.out.println("Números no intervalo:");

        if (n1 <= n2) {
            for (int inicio = n1; inicio <= n2; inicio++) {
                System.out.println(inicio);
            }
        } else {
            for (int inicio = n1; inicio >= n2; inicio--) {
                System.out.println(inicio);
            }
        }
        }
        }


