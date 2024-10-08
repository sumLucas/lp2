import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Quantos termos da sequência de Fibonacci você quer ver? ");
        int n = scanner.nextInt();
        
        int primeiro = 1, segundo = 1, proximo;
        
        System.out.println("Sequência de Fibonacci:");
        System.out.print(primeiro + " " + segundo + " ");
        
        for (int i = 3; i <= n; i++) {
            proximo = primeiro + segundo;
            System.out.print(proximo + " ");
            primeiro = segundo;
            segundo = proximo;
        }
        
        scanner.close();
    }
}
