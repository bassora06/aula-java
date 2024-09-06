
package javaaplication3;


public class Carro extends Veiculo{

    @Override
    public void imprimir(){
        System.out.println("Teste");
    }
    
    @Override
    public int quantidade(int qtde){
        return qtde;
    }
}
