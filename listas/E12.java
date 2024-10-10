import java.util.Scanner;

public class E12 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite R1: ");
        int r1 = scanner.nextInt();

        System.out.println("Digite R2: ");
        int r2 = scanner.nextInt();

        System.out.println("Digite R3: ");
        int r3 = scanner.nextInt();


        int resistencia = ((r1 + r2) / 2) + r3;

        System.out.println("A resistencia total é: " + resistencia);


        scanner.close();

    }
}
