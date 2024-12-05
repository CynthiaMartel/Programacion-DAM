package Ejer7;

public class Triangulo extends Figura {
    //atributos
    protected double base;
    protected double altura;

    //Herencia
    public Triangulo(){
        super();
    }

    //Constructores
    public Triangulo(double base, double altura){
        super();
        this.base = base;
        this.altura =altura;
    }
   
    //metodo
    @Override
    public double calcularArea(){
       return (base * altura) / 2;    
    }
}
