package POO.lista1;

import java.util.Scanner;

public class Exe3 {
	public static void main(String[] args) {
		int a, b, c, x;

		Scanner sc = new Scanner(System.in);

		System.out.println("Qual o valor de a");
		a = sc.nextInt();
		
		System.out.println("Qual o valor de b");
		b = sc.nextInt();

		System.out.println("Qual o valor de x");
		x = sc.nextInt();

		if(x >= 10){
			c = a + b;
		}else{
			c = a - b;
		}

		System.out.println("O valor final de C é " + c);

		sc.close();
	}
}
