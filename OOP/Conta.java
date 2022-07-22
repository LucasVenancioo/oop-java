import javax.print.attribute.standard.RequestingUserName;

public class Conta {
        // Atributos
    public double saldo;
    public int agencia;
    public int conta;
    public Titular titular;
    
        //Métodos
        public void deposita(double valor) {
            this.saldo += valor;
        }

        public boolean sacar(double valor) {
            if (this.saldo < valor) {
                return false;
            }

            this.saldo -= valor;
            return true;
        }

        public boolean transferir(double valor, Conta contaDestino) {
            if (this.saldo < valor) {
                return false;
            }
            this.saldo -= valor + 5;
            contaDestino.saldo += valor;
            return true;
        }



    public static void main(String[] args) {
        //Instanciando um objeto da classe conta 
        Conta conta1 = new Conta();
        conta1.saldo = 10000;
        conta1.agencia = 1000;
        conta1.conta = 123456789;
        conta1.deposita(1000);

        Titular titular1 = new Titular();
        titular1.nome = "lucas";
        titular1.cpf = "111.111.111-11";


        conta1.titular = titular1;

        System.out.println(conta1.saldo);
        System.out.println(conta1.agencia);
        System.out.println(conta1.conta);

        Conta conta2 = new Conta();
        conta2.saldo = 50000;
        conta2.agencia = 1001;
        conta2.conta = 1234567890;

        
        Titular titular2 = new Titular();
        titular2.nome = "Crhis";
        titular2.cpf = "111.111.111-10";

        conta2.titular = titular2;


        System.out.printf("Saldo na conta1: %.2f | Saldo conta2: %.2f\n", conta1.saldo, conta2.saldo);
        System.out.println(conta2.agencia);
        System.out.println(conta2.conta);
        if (conta1.sacar(5000)){
            System.out.println("Saque bem sucedido.");
        } else {
            System.out.println("falha na operação");
        }
        
        System.out.println("saldo" + conta1.saldo);

        if (conta1.transferir(1000, conta2)) {
            System.out.println("Tranferecia bem sucedida");
        } else {
            System.out.println("Saldo insulficiente");
        }


    System.out.println("Titular da conta 1: " + conta1.titular.nome);
    System.out.println("Saldo da conta 1: " + conta1.saldo);
    System.out.println("Titular da conta 2: " + vconta2.titular.nome);
    System.out.println("Saldo da conta 2: " + conta2.saldo);
    }
}
