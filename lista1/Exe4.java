package POO.lista1;

import java.util.Scanner;

public class Exe4 {
	public static void main(String[] args) {
		double horas, valorHora, valorBruto;

		valorBruto = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Quantas horas trabalhadas");
		horas = sc.nextDouble();

		System.out.println("Qual o valor da hora");
		valorHora = sc.nextDouble();

		valorBruto = valorHora * horas;

		if(valorBruto <= 500){
			valorBruto = (valorBruto * 15) / 100;
		}else if(valorBruto <= 1000){
			valorBruto = (valorBruto * 10) / 100;
		}else if(valorBruto > 1000){
			valorBruto = (valorBruto * 5) / 100;
		}

		System.out.println("O reajuste do seu salário é " + valorBruto);

		sc.close();
	}
}
