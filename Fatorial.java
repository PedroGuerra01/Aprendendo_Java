import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        int fatorial = 1;

        if (numero >= 0) {
            for (int i = 1; i <= numero; i++) {
                fatorial *= i;
            }

            System.out.println("O fatorial de " + numero + " é: " + fatorial);
        } else {
            System.out.println("Não é possível calcular o fatorial de um número negativo.");
        }

        scanner.close();
    }
}
