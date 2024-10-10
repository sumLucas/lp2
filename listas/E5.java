import java.util.Scanner;

public class E5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite dois numeros\n");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        int quociente = num1 / num2;
        int resto = num1 % num2;

        System.out.println("O quociente é = " + quociente);
        System.out.println("O resto é = " + resto);


        scanner.close();
    }
}
