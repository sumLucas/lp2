import java.util.Scanner;

public class E6 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in); 

        System.out.print("Digite sua IDADE em DIAS: ");
        int idadeEmDias = scanner.nextInt();
        
        int idadeEmAnos = idadeEmDias / 365;
        int idadeEmMeses = idadeEmAnos * 12;

        System.out.println("Idade em Anos = " + idadeEmAnos);
        System.out.println("Idade em Meses = " + idadeEmMeses);
        System.out.println("Idade em Dias = " + idadeEmDias);

        scanner.close();
    }
}
