
package interfaces;

public abstract class DispositivosEletronicos {
    
    private String modeloTela;

    public DispositivosEletronicos(String modeloTela) {
        this.modeloTela = modeloTela;
    }

    public String getModeloTela() {
        return modeloTela;
    }

    public void setModeloTela(String modeloTela) {
        this.modeloTela = modeloTela;
    }
    
    public abstract void carregar();
}
