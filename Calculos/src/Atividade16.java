import java.util.Scanner;

public class Atividade16 {
    public static void main(String[] args) {
        double p, d, r;
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o valor de um produto: ");
        p = leia.nextDouble();

        System.out.println("Digite a porcentagem do desconto: ");
        d = leia.nextDouble();

        r = p - (p/100*d);

        System.out.println("A seu produto com seu desconto é " + r);
    }
}
