package Ejer7;

public class Rectangulo extends Figura {

    //atributos
    protected double base;
    protected double altura;

    //Herencia
    public Rectangulo(){
        super(); //Se puede utilizar un super() vacío porque existe un constructor sin argumentos en la clase Figura! 
    }           //si hubiesemos construido una clase Figura con parámetros predeterminados en esas líneas de código,entonces super no puede quedar vacío

    //Constructores
    public Rectangulo(double base, double altura){
        super();
        this.base = base;
        this.altura =altura;
    }
    //setters
    public void setBase(double base){
        this.base = base;
    }
    public void setAltura(double altura){
        this.altura = altura;
    }
   
    //metodos
    @Override
    public double calcularArea(){
        return base * altura;
    }
}
