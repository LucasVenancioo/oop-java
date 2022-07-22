public class App {
    

    public static void main(String[] args) throws Exception {
        Titular titular1 = new Titular("Lucas", "123456789", "11111111111", "12345678" ,"1234");
        System.out.println("Nome do titular: " + titular1.getNome());
        
    Diretor diretor = new Diretor("Lucas", "11111111111", 30000, "1234");
        Gerente gerente = new Gerente("Maria", "123456789101", 20000 , "123456");
        Desenvolvedor desenvolvedor = new Desenvolvedor("Pedro", "13245698711", 12000, "java", "12345");

        System.out.println("Bonificação do diretor: " + diretor.getBonificacao());
        System.out.println("Bonificação do gerente: " + gerente.getBonificacao());
        System.out.printf("Bonificação do desenvolvedor: %.2f\n" , desenvolvedor.getBonificacao());
        
        gerente.dizOi();

        if (diretor.autentica("12345")) {
            System.out.println("Diretor conseguiu logar no sistema. ");
        }else {
            System.out.println("Acesso negado. Senha inválida. ");
        }

        if (titular1.autentica("123456")) {
            System.out.println("Titular conseguiu logar. ");
        } else {
            System.out.println("Acesso negado. Senha invalida. ");
        }

    }
}
