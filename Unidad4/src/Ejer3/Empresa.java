package Ejer3;
import java.util.ArrayList;

public class Empresa {

    // Atributos
    protected String nombre;
    protected int cif;
    protected Direccion direccion;
    protected ArrayList<Departamento> departamentos;

    // Constructor
    public Empresa(String nombre, int cif, Direccion direccion, ArrayList<Departamento> departamentos) {
        this.nombre = nombre;
        this.cif = cif;
        this.direccion = direccion;

        // Inicializa con un ArrayList vacío por defecto
        this.departamentos = departamentos;
    }

    //sets:
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setCif(int cif){
        this.cif = cif;
    }
    public void setDireccion(Direccion direccion){
        this.direccion = direccion;
    }
    public void setDepartamento(ArrayList<Departamento> departamentos){
        this.departamentos = departamentos;
    }
    //gets:
    public String getNombre(){
        return nombre;
    }
    public int getCif(){
        return cif;
    }
    public Direccion getDireccion(){
        return direccion;
    }
    public ArrayList<Departamento> getDepartamento(){
        return departamentos;
    }

    //Métodos:
    public void addDepartamento(Departamento departamento){
        departamentos.add(departamento);
    }
    public void delateDepartamento(Departamento departamento){
        if (Departamento.numeroEmpleados(departamento) == 0){
            departamentos.remove(departamento);
        }   
    }

}

