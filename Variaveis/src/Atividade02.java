import java.util.Scanner;

public class Atividade02 {
    public static void main(String[] args) {
        String nome;

        Scanner leia = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        nome = leia.nextLine();

        System.out.println("Boas-Vindas " + nome);
    }
}
