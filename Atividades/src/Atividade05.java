import java.util.Scanner;

public class Atividade05 {
    public static void main(String[] args) {
        double hip, co, a;

        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o valor da hipotenusa");
        hip = leia.nextDouble();
        System.out.println("Digite o valor do lado oposto: ");
        co = leia.nextDouble();

        a = Math.sqrt(Math.pow(hip, 2) - Math.pow(co, 2));

        System.out.println("O cateto adjacente do seu triangulo retangulo é: " + a);
    }
}
