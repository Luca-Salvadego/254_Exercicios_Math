import java.util.Scanner;

public class Atividade08 {
    public static void main(String[] args) {
        double p, d;
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o valor de um produto: ");
        p = leia.nextDouble();

        p = p - (p/100*10);

        System.out.println("A seu produto com 10% de desconto é " + p);
    }
}
