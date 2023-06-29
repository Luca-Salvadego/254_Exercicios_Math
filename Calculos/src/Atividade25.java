import java.util.Scanner;

public class Atividade25 {
    public static void main(String[] args) {
        double dolar, real;
        Scanner leia = new Scanner(System.in);

        System.out.println("Escreva uma quantidade em dólar: ");
        dolar = leia.nextDouble();

        real = dolar * 4.7;
        System.out.println("A sua quantidade em reais é: R$" + real);
    }
}
