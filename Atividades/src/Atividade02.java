import java.util.Scanner;

public class Atividade02 {
    public static void main(String[] args) {
        double x, x1,x2, x3, paracima, parabaixo, random, absoluto, nummax, nummin, seno, cosseno;
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        x = leia.nextDouble();
        paracima = Math.floor(x);
        System.out.println("O numero arrendodado pra cima :" + paracima);
        parabaixo = Math.ceil(x);
        System.out.println("O numero arrendodadopra baixo:" + parabaixo);
        random = Math.random();
        System.out.println("Um numero aleatorio:" + random);
        absoluto = Math.abs(x);
        System.out.println("Valor aboluto:" + absoluto);
        System.out.println("Digite um numero: ");
        x1 = leia.nextDouble();
        System.out.println("Digite um segundo numero: ");
        x2 = leia.nextDouble();
        nummax = Math.max(x1 , x2);
        System.out.println("Valor maximo entre os seus numeros:" + nummax);
        nummin = Math.min(x1 , x2);
        System.out.println("Valor minimo entre os seus numeros:" + nummin);
        System.out.println("Digite um angulo: ");
        x3 = leia.nextDouble();
        seno = Math.sin(x3);
        System.out.println("o seno de " + x3 + "º: " + seno);
        cosseno = Math.cos(x3);
        System.out.println("o cosseno de " + x3 + "º: " + cosseno);
    }
}
