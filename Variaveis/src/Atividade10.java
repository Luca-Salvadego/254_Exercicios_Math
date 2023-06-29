import java.util.Scanner;

public class Atividade10 {
    public static void main(String[] args) {
        double A, B, X;

        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o valor de A: ");
        A = leia.nextDouble();
        System.out.println("Digite o valor de B: ");
        B = leia.nextDouble();

        X = A;
        A = B;
        B = X;

        System.out.println("A = " + A + "B = " + B);


    }
}
