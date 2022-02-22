package poo.Modelo;

public class Pessoa {
    private static final int tamanhoCPF = 11;
    private static final int tamanhoCNPJ = 14;

    public enum tipoPessoa {
        FISICA, JURIDICA
    }

    public Integer codigo;
    public String nome;
    private String documento;
    public tipoPessoa tipo;

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        if (documento == null || documento.isEmpty()){
            throw new RuntimeException("Documento não pode ser nulo ou vazio");
        }

        if (documento.length() == tamanhoCPF){
            setDocumento(documento, tipo = tipoPessoa.FISICA);
        }else if (documento.length() == tamanhoCNPJ){
            setDocumento(documento, tipo = tipoPessoa.JURIDICA);
        }else{
            throw new RuntimeException("Documento inválido para pessoa física ou jurídica");
        }
    }

    private void setDocumento(String documento, tipoPessoa tipo){
        this.documento = documento;
        this.tipo = tipo;
    }

    public tipoPessoa getTipo() {
        return tipo;
    }
}
