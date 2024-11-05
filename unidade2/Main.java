public class Imovel{
    private String endereco;
    private double preco;


    public Imovel(String endereco, double preco){
        this.endereco = endereco;
        this.preco = preco;
    }
    
    public void setEndereco() {
        this.endereco = endereco;
    }

    public void setPreco(){
        this.preco = preco;
    }

    public String getEndereco{
        return this.endereco;
    }

    public double getPreco{
        return this.preco;
    }

    public void interface{
        System.out.println("Endereço: " + endereco);
        System.out.println("Preço: R$ " + preco);
    }

}


class Novo extends Imovel{
    public Novo(String endereco, double preco){
        super(endereco, preco);

        public void aumentar(double aumento){
            double adicional = getPreco() + aumento;
            setPreco = (getPreco() + adicional);

        }
    }
}

class Velho extends Imovel{
    public Velho(String endereco, double preco){
        super(endereco, preco);
        
        public void diminuir(double desconto){
            double descontado = getPreco() - desconto;
            setPreco = (getPreco() - descontado);
        }
    }
}


public class Main {
    public static void main(String[] args) {
        Novo imovelNovo = new Novo("Rua A, 123", 300000.0);
        imovelNovo.interface();
        imovelNovo.aumentar(10);
        System.out.println("Após aumento de 1000$:");
        imovelNovo.interface();

        System.out.println("--------------------------");

        Velho imovelVelho = new Velho("Avenida B, 456", 150000.0);
        imovelVelho.interface();
        imovelVelho.diminuir(15);
        System.out.println("Após desconto de 1000$:");
        imovelVelho.interface();
    }
}











