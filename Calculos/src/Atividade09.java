import java.util.Scanner;

public class Atividade09 {
    public static void main(String[] args) {
        double g, v, r;
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite quantos litros de gasolina: ");
        g = leia.nextDouble();

        System.out.println("Digite o valor da gasolina por litro: ");
        v = leia.nextDouble();

        r = g * v;

        System.out.println("A o valor que você tem que pagar é " + r);
    }
}
