import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    cadastro cadastro = new cadastro();

    while (true) {
      System.out.println("1.Adicionar Cliente");
      System.out.println("2.Listar Cliente");
      System.out.println("3.Sair");
      System.out.println("4.Escolha uma opção");

      int opcao = scanner.nextInt();
      scanner.nextLine();

      switch (opcao) {
        case 1:
          System.out.println("Digite o nome do cliente");
          String nome = scanner.nextLine();
          System.out.println("Digite o CPF do cliente");
          String CPF = scanner.nextLine();
          System.out.println("Digite o endereço do cliente");
          String endereco = scanner.nextLine();
          System.out.println("Digite o telefone do cliente");
          String telefone = scanner.nextLine();

          // Criando cadastro do novo cliente
          cliente cliente = new cliente(nome, CPF, endereco,telefone);
          cadastro.adicionarCliente(cliente);
          break;

        case 2:
          System.out.println("Listando cadastro dos clientes");
          // Listando todos os clientes
          cadastro.listarClientes();
          break;

        case 3:
          System.out.println("Saindo ...");
          scanner.close();
          return;

        default:
          System.out.println("Opção inválida! Teste novamente");

      }
    }
  }
}