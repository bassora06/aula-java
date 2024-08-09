package oi;


public class MinhaClasse {
    private int x;
    private String y;
    private double z;
    
    public void dizerOi(){
        System.out.println("Olá");
    }
    
    public int metodo(int x, int y){
        return (x + y);
    }
    
    public MinhaClasse(int x, String y, double z){
        this.x = x;
        this.y = y;
        this.z = z; 
    }
    
    public static void imprimir(){
        System.out.println("Oi");
    }
}
