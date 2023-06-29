import java.util.Scanner;

public class Atividade18 {
    public static void main(String[] args) {
        double i, a, n;
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        i = leia.nextDouble();

        System.out.println("Digite em que ano estamos: ");
        a = leia.nextDouble();

        n = a-i;

        System.out.println("Você nasceu em " + n);
    }
}
