package Ejer6;

public class Mecanico {
    //Atributos
    protected String nombre;
    protected int telefono;
    protected String especialidad;

    //Constructores
    public Mecanico(String nombre, int telefono, String especialidad){
        this.nombre = nombre;
        this.telefono = telefono;
        this.especialidad = especialidad;
    }
    //setters:
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setTelefono(int telefono){
        this.telefono = telefono;
    }
    public void setEspecilaidad(String especialidad){
        this.especialidad = especialidad;
    }
    //getters:
    public String getNombre(){
        return this.nombre;
    }
    public int getTelefono(){
        return this.telefono;
    }
    public String getEspecialidad(){
        return this.especialidad;
    }

    @Override
    public String toString(){
        return "Nombre: " + nombre + "\n" +
                "Teléfono: " + telefono + "\n" +
                "Especialidad: " + especialidad + "\n";
    }

}
