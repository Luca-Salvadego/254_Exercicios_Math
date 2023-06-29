import java.util.Scanner;

public class Atividade03 {
    public static void main(String[] args) {
        double b, h, r;
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite a base do triangulo: ");
        b = leia.nextDouble();

        System.out.println("Digite a altura do triangulo: ");
        h = leia.nextDouble();

        r = b*h/2;

        System.out.println("A area do seu triangulo é " + r);
    }
}
