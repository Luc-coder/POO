package POO.lista1;
import java.util.Scanner;

class Exe1{
    /**
     * @param args
     */
    public static void main(String[] args) {
        double valorProduto, soma, aumento;
        int cod;
        aumento = 0;

        Scanner n = new Scanner(System.in);

        System.out.println("Qual o valor do produto");
        valorProduto = n.nextDouble();

        System.out.println("Qual o código do aumento");
        cod = n.nextInt();

        if(cod == 1){
            aumento = 0.10;
        }else if(cod == 2){
            aumento = 0.15;
        }else if(cod == 3){
            aumento = 0.20;
        }else if(cod == 4){
            aumento = 0.25;
        }

        soma = valorProduto * aumento;

        System.out.println("O novo valor do produto é " + soma);

        n.close();
    }
}