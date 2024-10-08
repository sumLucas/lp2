public class Triangulo {
    public static void main(String[] args) {
        int linhas = 9;  // Número de linhas do triângulo
        
        for (int i = 1; i <= linhas; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();  // Pula para a próxima linha após imprimir os '*' de cada linha
        }
    }
}
