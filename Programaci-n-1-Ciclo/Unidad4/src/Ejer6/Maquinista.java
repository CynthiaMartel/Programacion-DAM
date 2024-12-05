package Ejer6;

public class Maquinista {
    //Atributos:
    protected String nombre;
    protected int dni;
    protected double sueldo;
    protected String rango;

    //Constructores:
    public Maquinista (String nombre, int dni, double sueldo, String rango){
        this.nombre = nombre;
        this.dni = dni;
        this.sueldo = sueldo;
        this.rango = rango;
    }
    //Setters:
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setDni(int dni){
        this.dni = dni;
    }
    public void setSueldo(double sueldo){
        this.sueldo = sueldo;
    }
    public void setRango(String rango){
        this.rango = rango;
    }
    //getters:
    public String getNombre(String nombre){
        return this.nombre;
    }
    public int getDni(int dni){
        return this.dni;
    }
    public double getSueldo(double sueldo){
        return this.sueldo;
    }
    public String getRango(String rango){
        return this.rango;
    }

    @Override
    public String toString(){
        return "Nombre: " + nombre + "\n" +
                "DNI: " + dni + "\n" +
                "Sueldo: " + sueldo + "\n" +
                "Rango: " + rango + "\n" ;
    }
}
