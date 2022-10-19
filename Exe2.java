package POO;

import java.util.Scanner;

public class Exe2 {
    public static void main(String[] args) {
        double morango, maca, pera, menorMorango, menorMaca, menorPera, maiorMorango, maiorMaca, maiorPera, somaMorango, somaMaca, somaPera, somaTotal, resultado;
        int desconto;

        desconto = 5;

        resultado = 0;

        somaMorango = 0;
        somaMaca = 0;
        somaPera = 0;
        somaTotal = 0;

        menorMorango = 2.50;
        menorMaca = 2.80;
        menorPera = 2.20;

        maiorMorango = 2.20;
        maiorMaca = 2.50;
        maiorPera = 2.10;

        Scanner n = new Scanner(System.in);

        System.out.println("Quantos kg de Morango");
        morango = n.nextDouble();

        System.out.println("Quantos kg de maça");
        maca = n.nextDouble();

        System.out.println("Quantos kg de pera");
        pera = n.nextDouble();

        if(morango < 5){
            somaMorango = morango * menorMorango;
        }else if(morango > 5){
            somaMorango = morango * maiorMorango;
        }

        if(maca < 5){
            somaMaca = maca * menorMaca;
        }else if(maca > 5){
            somaMaca = maca * maiorMaca;
        }

        if(pera < 5){
            somaPera = pera * menorPera;
        }else if(pera > 5){
            somaPera = pera * maiorPera;
        }

        somaTotal = somaMaca + somaMorango + somaPera;

        if(morango > 8 & somaMorango > 25){
            resultado = (somaTotal * desconto) / 100;
        }

        if(maca > 8 & somaMaca > 25){
            resultado = (somaTotal * desconto) / 100;
        }

        if(pera > 8 & somaPera > 25){
            resultado = (somaTotal * desconto) / 100;
        }

        System.out.println("O valor final é " + resultado);

        n.close();
    }
}
