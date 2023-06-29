import java.util.Scanner;

public class Atividade14 {
    public static void main(String[] args) {
        double num1, c;
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite um número: ");
        num1 = leia.nextDouble();

        c = Math.pow(num1,3);

        System.out.println("O cubo do seu número é " + c);
    }
}
