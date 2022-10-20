package POO.cutucada2;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		double nota1, nota2, media;

		Scanner sc = new Scanner(System.in);

		System.out.println("Qual a primeira nota");
		nota1 = sc.nextDouble();

		System.out.println("Qual a segunda nota");
		nota2 = sc.nextDouble();

		media = (nota1 + nota2) / 2;

		if(media >= 7){
			System.out.println("Aprovado");
		}else if(media >= 5){
			System.out.println("Exame final");
		}else{
			System.out.println("Reprovado");
		}

		sc.close();
	}
}
