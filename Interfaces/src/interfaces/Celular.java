
package interfaces;

public class Celular extends DispositivosEletronicos implements GPS{
    
    public Celular(String modeloTela) {
        super(modeloTela);
    }

    @Override
    public void carregar() {
        System.out.println("Carregando");
    }

    @Override
    public void navegar() {
        System.out.println("Navegando");
    }
    
}
