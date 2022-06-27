
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // mostrou no terminal esse texto abaixo
        System.out.println("Digite seu nome:");

        // interrompeu a execução do código para esperar o usuário digitar algo
        // após o usuário digitar algo, coloca o valor que foi digitado em name
	    String name = scanner.nextLine();

        if(name.equals("Nanda")) {
            System.out.println("Oi Nanda");
        } else {
            System.out.println("Não sei quem é você");
        }
    }
}