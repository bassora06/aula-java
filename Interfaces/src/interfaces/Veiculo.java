
package interfaces;

public abstract class Veiculo implements GPS, Ligacao{
    
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
    
    @Override
    public void navegar(){
        System.out.println("O veiculo navega");
    };
    
    
}
