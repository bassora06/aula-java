
package javaaplication3;


public class Moto extends Terrestres{

    @Override
    public void mover() {
        System.out.println("Andando");
    }

    @Override
    public void abastecer() {
        System.out.println("Gasolina/Alcool");
    }

    @Override
    public void imprimir() {
        System.out.println("Harley davidson 1500cc");
    }

    @Override
    public int quantidade(int qtde) {
        return qtde;
    }

    
    
}
