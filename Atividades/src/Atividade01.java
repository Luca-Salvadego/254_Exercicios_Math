import java.util.Scanner;

public class Atividade01 {
    public static void main(String[] args) {
        double p1,p2,x1,x2,y1,y2,d;
        Scanner leia = new Scanner(System.in);

        System.out.println("Escreva y1:");
        y1 = leia.nextFloat();
        System.out.println("Escreva y2:");
        y2 = leia.nextFloat();
        System.out.println("Escreva x1:");
        x1 = leia.nextFloat();
        System.out.println("Escreva x2:");
        x2 = leia.nextFloat();

        p1 = Math.pow(y1-y2, 2);
        p2 = Math.pow(x1-x2, 2);
        d = Math.sqrt(p1 + p2);
        System.out.println(d);
    }
}
