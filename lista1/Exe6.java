package POO.lista1;

import java.util.Scanner;

public class Exe6 {
	public static void main(String[] args) {
		double horas, valorHora, liquido, valorBruto;
		int inss, ir;

		valorBruto = 0;
		liquido = 0;
		inss = 0;
		ir = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Quantas horas de trabalho");
		horas = sc.nextDouble();

		System.out.println("Qual o valor da hora de trabalho");
		valorHora = sc.nextDouble();

		valorBruto = horas * valorHora;

		if(valorBruto <= 1000){
			inss = 8;
		}else{
			inss = 9;
		}

		if(valorBruto <=500){
			ir = 0;
		}else if(valorBruto <= 1000){
			ir = 6;
		}else{
			ir = 7;
		}

		liquido = ((valorBruto * inss) / 100) - ((valorBruto * ir) / 100);

		System.out.println("Seu salário liquido é de R$" + liquido);

		sc.close();
	}
}
