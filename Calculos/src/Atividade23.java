import java.util.Scanner;

public class Atividade23 {
    public static void main(String[] args) {
        double num1, num2, raiz, elevado;
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite uma raiz quadrada: ");
        num1 = leia.nextDouble();

        System.out.println("Digite um número para elevar a 2: ");
        num2 = leia.nextDouble();

        raiz = Math.sqrt(num1);
        elevado = Math.pow(num2,2);

        System.out.println("A raiz quadrada do seu número é " + raiz);
        System.out.println("A o seu número ao quadrado é " + elevado);
    }
}
