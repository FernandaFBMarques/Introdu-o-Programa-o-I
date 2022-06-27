import java.util.Scanner;
Class main {
    public static void main(String args[]) {
        scanner input = new Scanner (System.in);
        double A,B,X;
        System.out.print("informe o valor de A:");
        A = input.nextDouble(4);
        System.out.print("informe o valor de B");
        B = input.nextDouble(2);
        X = B/A;
        System.out.println("X = "+ X);

    }
}