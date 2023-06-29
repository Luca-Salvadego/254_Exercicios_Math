import java.util.Scanner;

public class Atividade07 {
    public static void main(String[] args) {
        String cidade, nome;
        double idade;

        Scanner leia = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        nome = leia.nextLine();

        System.out.println("Digite a cidade que mora: ");
        cidade = leia.nextLine();

        System.out.println("Digite sua idade: ");
        idade = leia.nextDouble();

        System.out.println("Você se chama " + nome + " tem " + idade + " anos, e mora em " + cidade);
    }
}
