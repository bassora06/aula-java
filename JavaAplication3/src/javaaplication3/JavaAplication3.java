
package javaaplication3;


public class JavaAplication3 {

   
    public static void main(String[] args) {
       
        /*Veiculo v = new Veiculo(4, "V8");
        
        System.out.println("Rodas: "+ v.getRodas());
        System.out.println("Motor: " +v.getMotor());*/
        
        Carro c = new Carro();
        c.imprimir();
        System.out.println("Qtde:"+c.quantidade(3));
        
    }
    
}
