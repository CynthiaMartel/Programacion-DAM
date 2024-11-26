package Ejer3;



public class Direccion {
   
    //Atributos:
    protected String calle;
    protected int numero;
    protected int codigoPostal;
    protected String localidad;
    protected String provincia;

    //Constructores:
    public Direccion(String calle, int numero, int codigoPostal, String localidad, String provincia){
        this.calle= calle;
        this.numero = numero;
        this.codigoPostal = codigoPostal;
        this.localidad= localidad;
        this.provincia = provincia;
    }

    //setters:
    public void setCalle(String calle){
        this.calle = calle;
    }
    public void setNumero(int numero){
        this.numero = numero;
    }
    public void setCodigoPostal(int codigoPostal){
        this.codigoPostal = codigoPostal;
    }
    public void setLocalidad(String localidad){
        this.localidad = localidad;
    }
    public void setProvincia(String provincia){
        this.provincia = provincia;
    }
    //getters
    public String getCalle(){
        return calle;
    }
    public int getNumero(){
        return numero;
    }
    public int getCodigoPostal(){
        return codigoPostal;
    }
    public String getLocalidad(){
        return localidad;
    }
    public String getProvincia(){
        return provincia;
    }
}
