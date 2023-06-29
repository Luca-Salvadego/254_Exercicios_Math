import java.util.Scanner;

public class Atividade05 {
    public static void main(String[] args) {
        double d, h, r;
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite a quantidade de horas trabalhadas: ");
        d = leia.nextDouble();

        System.out.println("Digite quanto você ganha a hora: ");
        h = leia.nextDouble();

        r = d*h;

        System.out.println("A seu salário é " + r);
    }
}
