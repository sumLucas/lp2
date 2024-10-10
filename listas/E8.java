public class E8{
    public static void main(String[] args){
        double raio = 2.6;
        double altura = 22.1;
    
        double volume =  3.14 * ((raio * raio) * altura);
    

        String resultado = String.format("O volume da lata é: %.2f", volume);
        System.out.println(resultado);

    }
}
