import java.util.Scanner;

public class E11 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        

        System.out.println("Digite a velocidade em m/s: ");
        double metrosPorSegundo = scanner.nextDouble();


        double kiloPorHora = metrosPorSegundo * 3.6;

        String resultado = String.format("A velocidade em km/h = %.0f", kiloPorHora);
        System.out.println(resultado + " km/h");

        scanner.close();
    }
}
