package Ejer6;

public class Vagon {
    //atributos:
    protected int numeroIdentificacion;
    protected double cargaMax;
    protected double cargaActual;
    protected String tipoMercancia;

    //Constructores:
    public Vagon(int numeroIdentificacion, double cargaMax, double cargaActual, String tipoMercancia){
        this.numeroIdentificacion = numeroIdentificacion;
        this.cargaMax = cargaMax;
        this.cargaActual = cargaActual;
        this.tipoMercancia = tipoMercancia;
    }

    //setters:
    public void setNumeroIdentificacion(int numeroIdentificacion){
        this.numeroIdentificacion = numeroIdentificacion;
    }
    public void setCargaMax(double cargaMax){
        this.cargaMax = cargaMax;
    }
    public void setCargaActual(double cargaActual){
        this.cargaActual = cargaActual;
    }
    public void setTipoMercancia(String tipoMercancia){
        this.tipoMercancia = tipoMercancia;
    }
    //getters:
    public int getNumeroIdentificacion(){
        return this.numeroIdentificacion;
    }
    public double getCargaMax(){
        return this.cargaMax;
    }
    public double getCargaActual(){
        return this.cargaActual;
    }
    public String getTipoMercancia(){
        return this.tipoMercancia;
    }

    @Override
    public String toString(){
        return "Número de Identificación: " + numeroIdentificacion + "\n" +
                "Carga máxima: " + cargaMax + "Kg" + "\n" +
                "Carga Actual: " + cargaActual + "Kg" + "\n" +
                "Tipo de mercancia: " + tipoMercancia + "\n" ;
    }
}
