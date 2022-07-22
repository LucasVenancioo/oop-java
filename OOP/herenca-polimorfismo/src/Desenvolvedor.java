// Herança: Desenvolvedor é um funcionario
    public class Desenvolvedor extends Funcionario{
        private String linguagem;
        public String getLinguagem() {
            return linguagem;
        }

        public void setLinguagem(String linguagem) {
            this.linguagem = linguagem;
        }

// Contrutor
public Desenvolvedor(String nome , String cpf , double salario , String linguagem, String senha) {
    super(nome, cpf, salario, senha);
    this.linguagem = linguagem;
}

// polimorfismo - sobrescrever métodosde uma classe pai/mãe.
@Override
public double getBonificacao() {
    // TODO Auto-generated method stub
    return this.getSalario() * 1.25;
}   
}
