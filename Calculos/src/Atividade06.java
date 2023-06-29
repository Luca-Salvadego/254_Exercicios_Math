import java.util.Scanner;

public class Atividade06 {
    public static void main(String[] args) {
        double d, h, m , s, t;
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite uma quantidade de dias: ");
        d = leia.nextDouble();
        System.out.println("Digite uma quantidade de horas: ");
        h = leia.nextDouble();
        System.out.println("Digite uma quantidade de minutos: ");
        m = leia.nextDouble();
        System.out.println("Digite uma quantidade de segundos: ");
        s = leia.nextDouble();

        d = d*24*60*60;
        h = h*60*60;
        m = m*60;
        t = d+h+m+s;

        System.out.println("Esse tempo é " + t + " segundos");



    }
}
