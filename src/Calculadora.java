import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculadora Simples");
        System.out.println("Operações disponíveis:");
        System.out.println("1. Adição (+)");
        System.out.println("2. Subtração (-)");
        System.out.println("3. Multiplicação (*)");
        System.out.println("4. Divisão (/)");
        System.out.print("Escolha uma operação (1/2/3/4): ");
        int escolha = scanner.nextInt();
        System.out.print("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();
        System.out.print("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();
        double resultado = 0;


        switch (escolha) {
            case 1:
                resultado = numero1 + numero2;

                break;
            case 2:
                resultado = numero1 - numero2;
                break;
            case 3:
                resultado = numero1 * numero2;
                break;
            case 4:
                if (numero2 != 0) {
                    resultado = numero1 / numero2;
                } else {
                    System.out.println("Erro: Divisão por zero!");
                    System.exit(1);
                }
                break;
            default:
                System.out.println("Operação inválida!");
                System.exit(1);
        }
        System.out.println("Resultado: " + resultado);
        scanner.close();
    }

    public static double realizarOperacao(int i, int i1, int i2) {
        switch (i) {
            case 1:
                return i1 + i2;

            case 2:
                return i1 - i2;

            case 3:
                return i1 * i2;

            case 4:
                if (i2 != 0) {
                    return (double) i1 / i2;
                }     else {
                    throw new ArithmeticException();
                }

            default:
                throw new IllegalArgumentException();
        }
    }
}