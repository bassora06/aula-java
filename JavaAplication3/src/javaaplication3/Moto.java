
package javaaplication3;


public class Moto extends Veiculo {

    @Override
    public void imprimir() {
        System.out.println("Vrum Vrum");
    }

    @Override
    public int quantidade(int qtde) {
        return qtde;
    }
    
}
