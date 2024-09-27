
package interfaces;

public class Carro extends Veiculo{
    
    public Carro(int rodas) {
        super(rodas);
    }

    @Override
    public void abastecer() {
        System.out.println("Abastecendo");
    }
    
}
