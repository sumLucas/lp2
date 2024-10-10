import java.util.Scanner;

public class E13 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o tempo gasto: ");
        int tempo = scanner.nextInt();

        System.out.println("Digite a velocidade: ");
        int velocidade = scanner.nextInt();


        double distancia = tempo * velocidade;
        double gasolina = distancia / 12;

        String resultado = String.format("A gasolina gasta foi de: %.2f", gasolina);
        System.out.println(resultado + " litros");


        scanner.close();
    }
}
