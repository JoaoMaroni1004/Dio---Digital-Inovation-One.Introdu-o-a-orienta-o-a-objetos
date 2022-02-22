package poo.Modelo;

public class Endereco {

    public enum tipoEndereco {
        RESIDENCIAL, ENTREGA, TRABALHO
    }
    public String endereco;
    public String numero;
    public String complemento;
    public String bairro;
    public String estado;
    public String cep;
}
