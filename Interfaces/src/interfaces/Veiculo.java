
package interfaces;

public abstract class Veiculo {
    
    private int rodas;
    
    public Veiculo(int rodas){
        this.rodas = rodas;
    }

    
    public int getRodas() {
        return rodas;
    }

    
    public void setRodas(int rodas) {
        this.rodas = rodas;
    }
    
    public abstract void abastecer();
    
    
}
