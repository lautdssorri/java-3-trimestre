import java.util.ArrayList;
import java.util.List;

public class cadastro{
  private List<cliente> clientes;

  public cadastro(){
    this.clientes = new ArrayList<cliente>();
  }
  public void adicionarCliente(cliente cliente){
    clientes.add(cliente);
    System.out.println("Cliente adicionado com sucesso!");
  }
  public void listarClientes(){
    if (clientes.isEmpty()){
      System.out.println("Nenhum clientes registrados no momento");
      return;

    }
    System.out.println("Listando clientes...");
    for(cliente cliente : clientes){
      System.out.println(cliente);
    }
  }
}