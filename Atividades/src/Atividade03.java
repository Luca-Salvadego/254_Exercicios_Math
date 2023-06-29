import java.util.Scanner;

public class Atividade03 {
    public static void main(String[] args) {
        double x, tan, asin, acos, atan, log;
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite algum valor: ");
        x = leia.nextDouble();

        tan = Math.tan(x);
        System.out.println("A tangente do numero: " + tan);
        asin = Math.asin(x);
        System.out.println("O arco do seno: " + asin);
        acos = Math.acos(x);
        System.out.println("O arco do cosseno: " + acos);
        atan = Math.atan(x);
        System.out.println("O arco da tangente: " + atan);
        log = Math.log(x);
        System.out.println("O logaritimo natural: " + log);
    }
}
