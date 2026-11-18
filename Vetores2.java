package exercicio02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] estoque = new int[10];
        int quantidade = 0;

        for(int i = 0; i < 10; i++){
            System.out.print("Estoque do produto " + (i + 1) + ": ");
            estoque[i] = sc.nextInt();

            if(estoque[i] < 5){
                quantidade++;
            }
        }

        System.out.println("\nQuantidade de produtos com estoque critico: " + quantidade);
        System.out.println("Posicoes dos produtos:");

        for(int i = 0; i < 10; i++){
            if(estoque[i] < 5){
                System.out.println("Posicao " + i);
            }
        }

        sc.close();
    }
}
