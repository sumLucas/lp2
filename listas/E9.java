import java.util.Scanner;

public class E9 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite um número inteiro menor que 32: ");
    int numero = scanner.nextInt();

    String binario = converterParaBinario(numero);
    System.out.println("A representação em binário é: " + binario);

    scanner.close();
    }

    private static String converterParaBinario(int n) {
        // Representação binária de 0 a 31
        String[] binarios = {
            "00000", "00001", "00010", "00011", "00100",
            "00101", "00110", "00111", "01000", "01001",
            "01010", "01011", "01100", "01101", "01110",
            "01111", "10000", "10001", "10010", "10011",
            "10100", "10101", "10110", "10111", "11000",
            "11001", "11010", "11011", "11100", "11101",
            "11110", "11111"
        };

        return binarios[n];
    }
}
