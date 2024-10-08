import java.util.Scanner;

public class E9{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira nota: \n");
        int nota1 = scanner.nextInt();

        System.out.print("Digite a segunda nota: \n");
        int nota2 = scanner.nextInt();

        System.out.print("Digite a terceira nota: \n");
        int nota3 = scanner.nextInt();
        
        System.out.print("Digite a quarta nota: \n");
        int nota4 = scanner.nextInt();

        int media1 = (nota1 + nota2) / 2;
        int media2 = (nota3 + nota4) / 2;

        int mediaFinal = (media1 + media2) / 2;

        System.out.println("A sua media semestral é: " + mediaFinal);

        
        

    }
}