package poo.Modelo;

public class MainEntregarCartaoApp {
    public static void main(String[] args) {
        // dados do endereço
        Endereco endereco = new Endereco();
        endereco.cep = "13800-515";

        // dados do cliente
        Cliente cliente = new Cliente();
        try {
            cliente.adicionaEndereco(endereco);
            System.out.println("Endereço adicionado com sucesso !!!");
            System.out.println("Cep: " + endereco.cep);

        } catch (Exception errro){
            System.err.println("Houve um erro ao adicionar o endereço: " + errro.getMessage());
        }
    }
}
