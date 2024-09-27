
package interfaces;

public class Carro extends Veiculo{
    
    public Carro(int rodas) {
        super(rodas);
    }

    @Override
    public void abastecer() {
        System.out.println("Abastecendo");
    }

    @Override
    public void navegar() {
        System.out.println("Carro Navegando");
    }
    
    public void imprimir(){
        super.navegar();
    }
    
    
}
