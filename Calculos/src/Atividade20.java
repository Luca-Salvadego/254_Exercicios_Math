import java.util.Scanner;

public class Atividade20 {
    public static void main(String[] args) {
        double l, a;
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite um lado do quadrado: ");
        l = leia.nextDouble();

        a = Math.pow(l,2);

        System.out.println("A área do seu quadrado é " + a);


    }
}
