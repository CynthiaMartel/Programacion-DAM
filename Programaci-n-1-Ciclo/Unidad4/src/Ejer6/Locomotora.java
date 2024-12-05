package Ejer6;

public class Locomotora {
    //atributos
    protected int matricula;
    protected double potenciaMotores;
    protected int anoFabricacion;
    protected Mecanico mecanicos;
    //constructores:
    public Locomotora(int matricula, double potenciaMotores, int anoFabricacion, Mecanico mecanicos){
        this.matricula = matricula;
        this.potenciaMotores = potenciaMotores;
        this.anoFabricacion = anoFabricacion;
        this.mecanicos = mecanicos;
    }
    //setters:
    public void setMatricula(int matricula){
        this.matricula = matricula;
    }
    public void setMotores(double potenciaMotores){
        this.potenciaMotores = potenciaMotores;
    }
    public void setAnoFabricacion(int anoFabricacion){
        this.anoFabricacion = anoFabricacion;
    }
    public void setMecanico(Mecanico mecanicos){
        if (this.mecanicos != null){
            throw new IllegalArgumentException("Ya hay un maquinista asignado");
        }
        this.mecanicos = mecanicos;
    }
    //getteres:
    public int getMatricula(){
        return this.matricula;
    }
    public double getPotenciaMotores(){
        return this.potenciaMotores;
    }
    public int getAnoFabricacion(){
        return this.anoFabricacion;
    }
    public Mecanico getMecanico(){
        return this.mecanicos;
    }
    
    @Override
    public String toString(){
        return "Matricula: " + matricula + "\n" +
                "Potencia de los motores: " + potenciaMotores + "\n" +
                "Año de fabricacion: " + anoFabricacion + "\n" +
                "Mecanico: " + mecanicos + "\n" ;
    }
}
