import java.util.Scanner;

public class E7 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a temperatura em Fahrenheit: ");
        double fah = scanner.nextDouble();

        double celsius = (fah - 32) * 5/9;


        String resultado = String.format("A temperatura em Celsius é aproximadamente: %.1f", celsius);
        System.out.println(resultado);
        
        scanner.close();
    }
}
