import java.util.Scanner;

public class Atividade11 {
    public static void main(String[] args) {
        double num1, r;
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite um número: ");
        num1 = leia.nextDouble();

        r = Math.sqrt(num1);

        System.out.println("A raiz quadrada do seu número é " + r);
    }
}
