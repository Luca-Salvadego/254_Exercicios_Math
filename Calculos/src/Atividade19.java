import java.util.Scanner;

public class Atividade19 {
    public static void main(String[] args) {
        double i, m, d;
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        i = leia.nextDouble();

        System.out.println("Digite quantos meses você viveu: ");
        m = leia.nextDouble();

        i = i*12*30;
        m = m*30;
        d = i+m;

        System.out.println("Você viveu por " + d + " dias");
    }
}
