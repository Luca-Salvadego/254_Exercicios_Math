import java.util.Scanner;

public class Atividade17 {
    public static void main(String[] args) {
        double q, v, p;
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o preço do produto: ");
        q = leia.nextDouble();

        System.out.println("Digite o  número de parcelas: ");
        p = leia.nextDouble();

        v = q/p;

        System.out.println("Cada parcela é " + v);
    }
}
