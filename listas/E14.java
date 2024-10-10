import java.util.Scanner;

public class E14 {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("A:  ");
    int a = scanner.nextInt();

    System.out.println("B:  ");
    int b = scanner.nextInt();

    a = a - b;
    b = b + a;
    a = b - a;

    System.out.printf("A = " + a + "\n");
    System.out.printf("B = " + b);

    scanner.close();

    }
}
