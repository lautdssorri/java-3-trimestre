import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome: ");
        String nome = scanner.nextLine();


        pessoa pessoa = new pessoa();
        pessoa.setNome(nome);
        

        System.out.println("Nome: " + pessoa.getNome());
    }      
}