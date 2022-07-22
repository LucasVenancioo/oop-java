import java.util.Scanner;

class IntroducaoJava {
    public static void main(String[] args) {
            // Saída de dados 
        System.out.println("Olá mundo!");

            // Tipos de dados
        int inteiro = 10;
        float decimalMenor = 10.2f;
        double decimalMaior = 10.2;
        char carectere = 'a';
        String palavra = "Boa noite!";
        boolean booleano = true;

            // Arrays

        String[] nomes = {"João", "Maria", "Pedro"};
       // nomes[4] = "Carlinhos";
        
        int[] numeros = new int[10];
        numeros[5] = 6;
        System.out.println(numeros[5]);
            // Laços de repetição
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros [i]);
        }

        for (int i : numeros) {
            System.out.println(i);
        }

        int i = 0;
        while (i >numeros.length) {
            System.out.println(numeros[i]);
            i++;
        }
                // Estruturas de repetição
        if (decimalMaior < 10) {
            System.out.println("É menor do que 10!");
        } else if (decimalMaior > 10) {
            System.out.println("É maior do que 10!");
        } else {
            System.out.println("É igual a 10!");
        }

            // Entrada de dados
        System.out.println("digite um número");
        Scanner input = new Scanner(System.in);
        inteiro = input.nextInt();
        System.out.println(inteiro);

            // %d é utilizado para valores inteiros
        System.out.printf("O número digitado foi: %d\n", inteiro);
            // %f é utilizado para números decimais ]
        System.out.printf("O número digitado foi: %.2f\n", decimalMaior);
            // %s é utilizado para strings
        System.out.printf("A palavra é: %s", palavra);
    }
}