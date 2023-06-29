import java.util.Scanner;

public class Atividade04 {
    public static void main(String[] args) {
        double raio, area, cir, c1, c2, hip, a, b, p, ar;
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite o raio de um circulo: ");
        raio = leia.nextDouble();

        area = Math.PI * Math.pow(raio,2);
        System.out.println("A area de em circulo com o raio " + raio + ": " + area);
        cir = 2 * Math.PI * raio;
        System.out.println("A circunferencia de em circulo com o raio " + raio + ": " + cir);

        System.out.println("Digite o cateto 1: ");
        c1 = leia.nextDouble();
        System.out.println("Digite o ceteto 2: ");
        c2 = leia.nextDouble();

        hip = Math.sqrt(Math.pow(c1,2) + Math.pow(c2,2));
        System.out.println("A hipotenusa do seu triangulo retangulo é: " + hip);

        System.out.println("Digite um lado do retangulo: ");
        a = leia.nextDouble();
        System.out.println("Digite outro lado do retangulo: ");
        b = leia.nextDouble();
        p = 2*(a+b);
        ar = a * b;
        System.out.println("O perimetro do seu retangulo é: " + p);
        System.out.println("A area do seu retangulo é: " + ar);

    }
}
