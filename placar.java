package com.company;

import java.util.Scanner;

public class conversao {

    public static int resultado(int golTime1, int golTime2) {
        int result = 0;
        if (golTime1 > golTime2) {
            result = 1;
        } else {
            result = 2;
        }
        return result;
    }

    public static void resultadoFinal(int golA, int golC, int golB, int golD) {
        int result1 = resultado(golA, golC);
        int result2 = resultado(golB, golD);
        if ((result1 == 1 && (result2) == 1)) {
            System.out.println("Os times que irão disputar a final são o time A e o time B");
            System.out.println("Os times que irão disputar o terceiro lugar são o time C e o time D");
        } else if ((result1 == 1 && (result2) == 2)) {
            System.out.println("Os times que irão disputar a final são o time A e o time D");
            System.out.println("Os times que irão disputar o terceiro lugar são o time C e o time B");
        } else if ((result1 == 2 && (result2) == 1)) {
            System.out.println("Os times que irão disputar a final são o time C e o time B");
            System.out.println("Os times que irão disputar o terceiro lugar são o time A e o time D");
        } else if ((result1 == 2 && (result2) == 2)) {
            System.out.println("Os times que irão disputar a final são o time C e o time D");
            System.out.println("Os times que irão disputar o terceiro lugar são o time A e o time B");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int golA;
        int golB;
        int golC;
        int golD;

        System.out.println("Por favor informe o placar do jogo A X C");
        System.out.println("A quantidade de gol(s) que o time A fez no jogo: ");
        golA = input.nextInt();
        while (golA < 0) {
            System.out.println("ERRO! O número de gol(s) deve ser maior ou igual a 0");
            System.out.println("Por favor informe novamente a quantidade de gol(s) que o time A fez no jogo: ");
            golA = input.nextInt();
        }
        System.out.println("A quantidade de gol(s) que o time C fez no jogo: ");
        golC = input.nextInt();
        while (golC < 0) {
            System.out.println("ERRO! O número de gol(s) deve ser maior ou igual a 0");
            System.out.println("Por favor informe novamente a quantidade de gol(s) que o time C fez no jogo: ");
            golC = input.nextInt();
        }
        while(golA == golC){
            System.out.println("ERRO! Não é possível haver empates na semifinal");
            System.out.println("Por favor informe novamente a quantidade de gol(s) que o time A fez no jogo: ");
            golA = input.nextInt();
            System.out.println("Por favor informe novamente a quantidade de gol(s) que o time C fez no jogo: ");
            golC = input.nextInt();
        }
        System.out.println("Por favor informe o placar do jogo B X D");
        System.out.println("A quantidade de gol(s) que o time B fez no jogo: ");
        golB = input.nextInt();
        while (golB < 0) {
            System.out.println("ERRO! O número de gol(s) deve ser maior ou igual a 0");
            System.out.println("Por favor informe novamente a quantidade de gol(s) que o time B fez no jogo: ");
            golB = input.nextInt();
        }
        System.out.println("A quantidade de gol(s) que o time D fez no jogo: ");
        golD = input.nextInt();
        while (golD < 0) {
            System.out.println("ERRO! O número de gol(s) deve ser maior ou igual a 0");
            System.out.println("Por favor informe novamente a quantidade de gol(s) que o time D fez no jogo: ");
            golD = input.nextInt();
        }
        while(golB == golD){
            System.out.println("ERRO! Não é possível haver empates na semifinal");
            System.out.println("Por favor informe novamente a quantidade de gol(s) que o time B fez no jogo: ");
            golB = input.nextInt();
            System.out.println("Por favor informe novamente a quantidade de gol(s) que o time D fez no jogo: ");
            golD = input.nextInt();
        }
        resultadoFinal(golA, golC, golB, golD);
    }
}