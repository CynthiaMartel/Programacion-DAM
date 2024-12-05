package Ejer9;

public class Mascotas {
    //Atributos
    protected String nombre;
    protected int edad;
    protected String color;

    //Constructores
    public Mascotas(String nombre, int edad, String color){
        this.nombre = nombre;
        this.edad = edad;
        this.color = color;
    }

    //setters
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public void setColor(String color){
        this.color = color;
    }
    //getters
    public String getNombre(){
        return this.nombre;
    }
    public int getEdad(){
        return this.edad;
    }
    public String getColor(){
        return this.color;
    }
    //métodos
    
    public String tipoSonido(){
        return "Sonido no definido";
    }
    @Override
    public String toString(){
        return "Nombre: " + nombre + "\n" +
                "Edad: " + edad + " años" + "\n" +
                "Color de pelo: " + color + "\n";
    }
}
