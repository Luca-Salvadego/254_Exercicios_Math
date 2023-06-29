import java.util.Scanner;

public class MaiorNumero {
    public static void main(String[] args) {
            double num1, num2, maior;
            Scanner leia = new Scanner(System.in);

            System.out.println("Digite um número: ");
            num1 = leia.nextDouble();

            System.out.println("Digite outro número: ");
            num2 = leia.nextDouble();

            maior = Math.max(num1,num2);

            System.out.println("O maior número é " + maior);
    }
}
