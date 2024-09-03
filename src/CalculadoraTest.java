public class CalculadoraTest {
    public static void main(String[] args) {
        testAdicao();
        testSubtracao();
        testMultiplicacao();
        testDivisao();
        testDivisaoPorZero();
        testOperacaoInvalida();
    }
    public static void testAdicao() {
        double resultado = Calculadora.realizarOperacao(1, 5, 3);
        if (resultado == 8.0) {
            System.out.println("Teste de adição passou!");
        } else {
            System.out.println("Teste de adição falhou. Resultado: " + resultado);
        }
    }
    public static void testSubtracao() {
        double resultado = Calculadora.realizarOperacao(2, 10, 4);
        if (resultado == 6.0) {
            System.out.println("Teste de subtração passou!");
        } else {
            System.out.println("Teste de subtração falhou. Resultado: " + resultado);
        }
    }
    public static void testMultiplicacao() {
        double resultado = Calculadora.realizarOperacao(3, 7, 2);
        if (resultado == 14.0) {
            System.out.println("Teste de multiplicação passou!");
        } else {
            System.out.println("Teste de multiplicação falhou. Resultado: " + resultado);
        }
    }
    public static void testDivisao() {
        double resultado = Calculadora.realizarOperacao(4, 12, 4);
        if (resultado == 3.0) {
            System.out.println("Teste de divisão passou!");
        } else {
            System.out.println("Teste de divisão falhou. Resultado: " + resultado);
        }
    }
    public static void testDivisaoPorZero() {
        try {
            Calculadora.realizarOperacao(4, 8, 0);
            System.out.println("Teste de divisão por zero falhou. Não lançou exceção.");
        } catch (ArithmeticException e) {
            System.out.println("Teste de divisão por zero passou!");
        }
    }
    public static void testOperacaoInvalida() {
        try {
            Calculadora.realizarOperacao(5, 8, 4);
            System.out.println("Teste de operação inválida falhou. Não lançou exceção.");
        } catch (IllegalArgumentException e) {
            System.out.println("Teste de operação inválida passou!");
        }
    }
}