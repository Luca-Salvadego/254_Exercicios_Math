import java.util.Scanner;

public class Atividade09 {
    public static void main(String[] args) {
        String nome, rua, cidade, estado;
        double cpf, telefone, numero, cep;

        Scanner leia = new Scanner(System.in);

        System.out.println("Escreva seu nome: ");
        nome = leia.nextLine();
        System.out.println("Escreva o nome da sua rua: ");
        rua = leia.nextLine();
        System.out.println("Escreva o nome da sua cidade: ");
        cidade = leia.nextLine();
        System.out.println("Escreva seu estado: ");
        estado = leia.nextLine();
        System.out.println("Escreva o número da sua casa: ");
        numero = leia.nextDouble();
        System.out.println("Escreva seu CEP: ");
        cep = leia.nextDouble();
        System.out.println("Digite seu CPF: ");
        cpf = leia.nextDouble();
        System.out.println("Digite seu número de telefone: ");
        telefone = leia.nextDouble();

        System.out.println("Nome: " + nome);
        System.out.println("Endereço: RUA " + rua + ", NÚMERO: " + numero + ", CEP: " + cep);
        System.out.println("Cidade: " + cidade);
        System.out.println("Estado; " + estado);
        System.out.println("CPF: " + cpf);
        System.out.println("Tel. Celular: " + telefone);
    }
}
