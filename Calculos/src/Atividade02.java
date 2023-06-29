import java.util.Scanner;

public class Atividade02 {
    public static void main(String[] args) {
        double r, a;
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o raio do seu círculo: ");
        r = leia.nextDouble();

        a = Math.PI * Math.pow(r,2);

        System.out.println("A área do seu círculo é " + a);


    }
}
