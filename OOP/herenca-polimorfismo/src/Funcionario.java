// Classes abstratas não podem se instanciadas (criar um objeto) - 
abstract public class Funcionario {
    private String nome;
    private String cpf;
    private double salario;
   

    public Funcionario(String nome , String cpf , double salario, String senha) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
        

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    



    // Método abstrato -> Método que as classes filhas devem implementar
    abstract public double getBonificacao();
}
