import java.util.Scanner;

public class Atividade07 {
    public static void main(String[] args) {
        double num1, num2, num3;
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite um número: ");
        num1 = leia.nextDouble();

        System.out.println("Digite outro número: ");
        num2 = leia.nextDouble();

        num3 = num1 * num2;

        System.out.println("A multiplicação dos seus digitos é " + num3);
    }
}
