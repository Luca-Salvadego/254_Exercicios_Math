import java.util.Scanner;

public class Atividade06 {
    public static void main(String[] args) {
        double num1, num2;

        Scanner leia = new Scanner(System.in);

        System.out.println("Digite um número: ");
        num1 = leia.nextDouble();

        System.out.println("Digite outro número: ");
        num2 = leia.nextDouble();

        System.out.println("Você digitou: " + num1 + " e " + num2);
    }
}
