import java.util.Scanner;

public class Atividade21 {
    public static void main(String[] args) {
        double p, a, m;
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite sua altura em metros: ");
        a = leia.nextDouble();

        System.out.println("Digite seu peso em kg: ");
        p = leia.nextDouble();

        m = p/(a*a);

        System.out.println("Seu índice de massa corporal é " + m);
    }
}
