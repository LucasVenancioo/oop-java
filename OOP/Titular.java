public class Titular {
    private String nome;
    private String telefone;
    private String cpf;
    private String rg;

    // Constructor - define os valores que o objeto vai ter na sua criação
    public Titular(String cpf, String rg) {
        // Verificação para saber se o cpf é vá.lido
        this.cpf = cpf;
    }

    // Getters e Setters
    // Getter --> Obtém a propriedade
    // Setter --> Modifica a propriedade

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
