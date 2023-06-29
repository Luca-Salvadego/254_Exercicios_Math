import java.util.Scanner;

public class Atividade01 {
    public static void main(String[] args) {
        String nome, cidade;

        Scanner leia = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        nome = leia.nextLine();
        System.out.println("Digite a cidade que mora: ");
        cidade = leia.nextLine();

        System.out.println("Olá " + nome + ", você mora na cidade de " + cidade + ".");

    }
}
