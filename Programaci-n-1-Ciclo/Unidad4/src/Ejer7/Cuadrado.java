package Ejer7;

public class Cuadrado extends  Figura{
    //atributos
    protected double lado;
    
    //Herencia
    public Cuadrado() {
        super();        
    }
    
    //Constructores:
    public Cuadrado(double lado){
        super();
        this.lado = lado;
    }
    @Override
    public double calcularArea(){
        return this.lado + this.lado + this.lado + this.lado;
    }
    
}
