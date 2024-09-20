
package javaaplication3;


public class JavaAplication3 {

   
    public static void main(String[] args) {
            
        Carro c = new Carro();
        c.imprimir();
        System.out.println("Qtde:"+c.quantidade(3)+"\n");
        
        Moto m = new Moto();
        m.imprimir();
        System.out.println("Qtde da moto:"+m.quantidade(10));
        
    }
    
}
