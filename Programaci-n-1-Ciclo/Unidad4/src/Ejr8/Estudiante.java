package Ejr8;

public class Estudiante extends Persona{
    //atributos
    protected String carrera;
    protected int semestre;

    //Herencia 
    public Estudiante(){
        super("nombre", "direccion");
    }
    //Constructores
    public Estudiante(String nombre, String direccion,String carrera, int semestre){
        super(nombre, direccion);
        this.carrera = carrera;
        this.semestre= semestre;
    }
    //setters
    public void setCarrera(String carrera){
        this.carrera = carrera;
    }
    public void setSemestre(int semestre){
        this.semestre = semestre;
    }
    //getters
    public String getCarrera(){
        return this.carrera;
    }
    public int getSemestre(){
        return this.semestre;
    }
    @Override
    public String toString(){
        return super.toString() + 
                "----Estudiante ----" + "\n" +
                "Carrera: " + carrera + "\n" +
                "semestre: " + semestre + "\n";
        
    }
}
