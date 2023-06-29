import java.util.Scanner;

public class Atividade13 {
    public static void main(String[] args) {
        double p, q, r;
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o preço do produto: ");
        p = leia.nextDouble();

        System.out.println("Digite a quantidade comprada: ");
        q = leia.nextDouble();

        r = p * q;

        System.out.println("A valor que você tem que pagar é " + r);
    }
}
