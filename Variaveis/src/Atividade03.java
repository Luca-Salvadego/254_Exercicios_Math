import java.util.Scanner;

public class Atividade03 {
    public static void main(String[] args) {
        double idade;

        Scanner leia = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        idade = leia.nextDouble();

        System.out.println("Você tem " + idade + " anos");
    }
}
