package Ejer3;

public class Empleado {
    
    //Atributos
    protected String nombre;
    protected int dni;
    protected int edad;
    protected double salario;
    protected String categoria;

    //Constructores
    public Empleado(String nombre, int dni, int edad, double salario, String categoria){
        this.nombre = nombre;
        this.dni = dni;
        this.edad = edad;
        this.salario = salario;
        this.categoria = categoria;
    }

    //sets:
    public void setNombre(String nombre){
        this.nombre= nombre;
    }
    public void setDni(int dni){
        this.dni=dni;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public void setSalario(double salario){
        this.salario = salario;
    }
    public void setCategoria(String categoria){
        this.categoria = categoria;
    }
    //getters:
    public String getNombre(){
        return nombre;
    }
    public int getEdad(){
        return edad;
    }
    public double getSalario(){
        return salario;
    }
    public String getCategoria(){
        return categoria;
    }

}
