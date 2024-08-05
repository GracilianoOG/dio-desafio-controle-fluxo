import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro: ");
        int primeiroParametro = scanner.nextInt();

        System.out.println("Digite o segundo parâmetro: ");
        int segundoParametro = scanner.nextInt();

        scanner.close();

        try {
            contar(primeiroParametro, segundoParametro);
        } catch(ParametrosInvalidosException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro!");
        }
    }

    public static void contar(int primeiroNumero, int segundoNumero) throws ParametrosInvalidosException {
        if(primeiroNumero >= segundoNumero) {
            throw new ParametrosInvalidosException();
        }

        int contagem = segundoNumero - primeiroNumero;

        for(int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}
