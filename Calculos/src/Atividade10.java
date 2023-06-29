import java.util.Scanner;

public class Atividade10 {
    public static void main(String[] args) {
        double d, v, r;
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite quantos dias você alugou: ");
        d = leia.nextDouble();

        System.out.println("Digite o valor da diaria: ");
        v = leia.nextDouble();

        r = d * v;

        System.out.println("A valor que você tem que pagar é " + r);
    }
}
