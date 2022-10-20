package POO.lista1;

import java.util.Scanner;

public class Exe5 {
	public static void main(String[] args) {
		double avenida, carro, multa;

		multa = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Qual a velocidade máxima da avenida");
		avenida = sc.nextDouble();

		System.out.println("Qual era a velocidade do carro");
		carro = sc.nextDouble();

		if(carro - avenida <= 10){
			multa = 50;
		}else if(carro - avenida <= 30){
			multa = 100;
		}else if(carro - avenida >= 31){
			multa = 200;
		}

		if(multa != 0){
			System.out.println("Você recebeu uma multa de " + multa);
		}else{
			System.out.println("Sem multas para pagar");
		}

		sc.close();
	}
}
