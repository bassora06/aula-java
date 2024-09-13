
package javaaplication3;


public class Carro extends Terrestres{

    @Override
    public void mover() {
        System.out.println("Andar, vrum vrum");
    }

    @Override
    public void abastecer() {
        System.out.println("gasolina ou etanol");
    }

    @Override
    public void imprimir() {
        System.out.println("Fiat uno");
    }

    @Override
    public int quantidade(int qtde) {
        System.out.println("O carro tem " + qtde + " rodas.");
        return qtde;
    }
    
}

   

   
    
