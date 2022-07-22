public class Tesoureiro extends Funcionario {

    public Tesoureiro(String nome, String cpf, double salario, String senha) {
        super(nome, cpf, salario, senha);
    }

    @Override
    public double getBonificacao() {
        return this.getSalario() / 2;
    }
    
}
