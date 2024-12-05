package Ejr8;

public class Persona {
    //atributos
    protected String nombre;
    protected String direccion;
    
    //Cosntructores
    public Persona(String nombre, String direccion){
        this.nombre = nombre;
        this.direccion = direccion;
    }

    //getters
    public String getNombre(){
        return this.nombre;
    }
    public String getDireccion(){
        return this.direccion;
    }
    //setters
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setDireccion(String direccion){
        this.direccion = direccion;
    }

    @Override
    public String toString(){
        return "Nombre: " + nombre + "\n" +
               "Dirección: " + direccion + "\n";
        
    }
}
