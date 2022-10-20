package POO.cutucada1;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		int num1, num2, soma;
		String numero1, numero2;

		soma = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Qual o valor do número 1");
		num1 = sc.nextInt();

		System.out.println("Qual o valor do segundo número");
		num2 = sc.nextInt();

		soma = num1 + num2;

		System.out.println("O resultado da soma é" + soma);

		System.out.println("Escreva um número");
		numero1 = sc.nextLine();

		System.out.println("Escreva outro número");
		numero2 = sc.nextLine();

		soma = Integer.parseInt(numero1) + Integer.parseInt(numero2);

		System.out.println("A soma dos dois números é " + soma);



		sc.close();
	}
}
