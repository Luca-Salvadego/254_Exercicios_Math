import java.util.Scanner;

public class Atividade04 {
    public static void main(String[] args) {
        double c, f;
        Scanner leia = new Scanner(System.in);

        System.out.println("Digiteuma temperatura em Celsius: ");
        c = leia.nextDouble();

        f = c * 1.8 + 32;

        System.out.println("A sua temperatura em Fahrenheit é " + f);
    }
}
