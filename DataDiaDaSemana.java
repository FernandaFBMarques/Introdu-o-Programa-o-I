package com.company;

import java.util.Scanner;

public class conversao {

    public static boolean validacaoAno(int ano) {
        boolean result = false;
        if (ano >= 1900 && ano <= 2399) {
            result = true;
        }
        return result;
    }

    public static boolean validacaoMes(int mes) {
        boolean result = false;
        if (mes > 0 && mes <= 12) {
            result = true;
        }
        return result;
    }

    public static boolean validacaoAnoBissexto(int ano) {
        boolean result = false;
        if (ano % 4 == 0 && ano % 100 != 0) {
            result = true;
        }
        return result;
    }

    public static double mesCurtoLongo(int mes) {
        int result = 0;
        if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
            result = 1;
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            result = 2;
        }
        return result;
    }

    public static boolean validacaoDia(int mes, int dia, int ano, boolean resAno, boolean resMes,boolean resAnoBi) {
        boolean result = false;
        if ((resAno == true) && resMes == true) {
                if ((mesCurtoLongo(mes)) == 1 && dia <= 31) {
                    result = true;
                } else if ((mesCurtoLongo(mes)) == 2 && dia <= 30) {
                    result = true;
                } else if (resAnoBi == true && mes == 2 && dia <= 29) {
                    result = true;
                }
            }
        return result;
    }

    public static int novoValorMes(int mes){
        switch (mes){
            case 1:
                mes = 0;
                break;

            case 2:
                mes = 3;
                break;

            case 3:
                mes = 3;
                break;

            case 4:
                mes = 6;
                break;

            case 5:
                mes = 1;
                break;

            case 6:
                mes = 4;
                break;

            case 7:
                mes = 6;
                break;

            case 8:
                mes = 2;
                break;

            case 9:
                mes = 5;
                break;

            case 10:
                mes = 0;
                break;

            case 11:
                mes = 3;
                break;

            case 12:
                mes = 5;
                break;

            default:
                mes = mes;
        }
        return mes;
    }

    public static double diaSemanaFun(int dia, int mes, int ano){
        int a = ano - 1900;
        int b = 0;
        double result;
        if((validacaoAnoBissexto(ano)) == true){
            b = (a / 4) - 1;
        }else{
            b = a / 4;
        }
        int c = novoValorMes(mes);
        int d = dia - 1;
        double soma = (a + b + c + d) % 7.0;
        return soma;
    }

    public static void diaSemanaFinal(int dia, int mes, int ano, double diaSemana){
        if(diaSemana == 0){
            System.out.println("Voc?? nasceu no dia " + dia + " de " + mes + " de " + ano + ".Essa data foi uma segunda-feira");
        }else if(diaSemana == 1){
            System.out.println("Voc?? nasceu no dia " + dia + " de " + mes + " de " + ano + ".Essa data foi uma ter??a-feira");
        }else if(diaSemana == 2){
            System.out.println("Voc?? nasceu no dia " + dia + " de " + mes + " de " + ano + ".Essa data foi uma quarta-feira");
        }else if(diaSemana == 3){
            System.out.println("Voc?? nasceu no dia " + dia + " de " + mes + " de " + ano + ".Essa data foi uma quinta-feira");
        }else if(diaSemana == 4){
            System.out.println("Voc?? nasceu no dia " + dia + " de " + mes + " de " + ano + ".Essa data foi uma sexta-feira");
        }else if(diaSemana == 5){
            System.out.println("Voc?? nasceu no dia " + dia + " de " + mes + " de " + ano + ".Essa data foi uma s??bado");
        }else if(diaSemana == 6){
            System.out.println("Voc?? nasceu no dia " + dia + " de " + mes + " de " + ano + ".Essa data foi uma domingo");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int dia = 0;
        int mes = 0;
        int ano = 0;
        char resposta;

        double tamanhoMes = mesCurtoLongo(mes);
        double diaSemana = diaSemanaFun(dia, mes, ano);

        do {
            System.out.println("Por favor informe uma data: ");
            System.out.print("Ano: ");
            ano = input.nextInt();
            boolean resAno = validacaoAno(ano);
            boolean resAnoBi = validacaoAnoBissexto(ano);
            System.out.println("Valida????o ano: " + resAno);
            System.out.println("Valida????o ano bissexto: " + resAnoBi);
            while(resAno == false){
                System.out.println("ERRO! Digite um ano entre 1900 e 2399");
                System.out.print("Ano: ");
                ano = input.nextInt();
                resAno = validacaoAno(ano);
                resAnoBi = validacaoAnoBissexto(ano);
                System.out.println("Valida????o ano: " + resAno);
                System.out.println("Valida????o ano bissexto: " + resAnoBi);
            }
            System.out.print("M??s: ");
            mes = input.nextInt();
            boolean resMes = validacaoMes(mes);
            System.out.println("Valida????o m??s: " + resMes);
            while(resMes == false){
                System.out.println("ERRO! Digite um m??s entre 1 e 12");
                System.out.print("M??s: ");
                mes = input.nextInt();
                resMes = validacaoMes(mes);
                System.out.println("Valida????o m??s: " + resMes);
            }
            System.out.print("Dia: ");
            dia = input.nextInt();
            boolean resDia = validacaoDia(mes, dia, ano, resAno, resMes, resAnoBi);
            System.out.println("Valida????o dia: " + resDia);
            while(resDia == false){
                System.out.println("ERRO! Digite outro dia");
                System.out.print("Dia: ");
                dia = input.nextInt();
                resDia = validacaoDia(mes, dia, ano, resAno, resMes, resAnoBi);
                System.out.println("Valida????o dia: " + resDia);
            }

            diaSemanaFinal(dia, mes, ano, diaSemana);

            System.out.println("Voc?? deseja inserir outra data? (s para sim e n para n??o)");
            resposta = input.next().charAt(0);
            resposta = Character.toLowerCase(resposta);
            while (resposta != 's' && resposta != 'n') {
                System.out.println("ERRO! a resposta deve ser s para sim e n para n??o");
                System.out.println("Voc?? deseja inserir outra data?");
                resposta = input.next().charAt(0);
                resposta = Character.toLowerCase(resposta);
            }
        } while (resposta == 's');
    }
}