package Ejer6;

import java.util.ArrayList;

public class EmpresaFerroviaria {

    // Atributos
    protected String nombre;
    protected int cif;
    protected ArrayList<Maquinista> maquinistas;
    protected ArrayList<Mecanico> mecanicos;
    protected ArrayList<JefeEstacion> jefesEstacion;
    protected ArrayList<Vagon> vagones;
    protected ArrayList<Locomotora> locomotoras;
    protected ArrayList<Tren> trenes;


    // Constructores
    public EmpresaFerroviaria(String nombre, int cif) {
        this.nombre = nombre;
        this.cif = cif;
        
        this.maquinistas = new ArrayList<>();
        this.mecanicos = new ArrayList<>();
        this.jefesEstacion = new ArrayList<>();
        this.vagones = new ArrayList<>();
        this.locomotoras = new ArrayList<>();
        this.trenes = new ArrayList<>();
    }
        

    //setters
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setCif(int cif){
        this.cif = cif;
    }
    public void setMaquinistas(ArrayList<Maquinista> maquinistas){
        this.maquinistas = maquinistas;
    }
    public void setMecanicos(ArrayList<Mecanico> mecanicos){
        this.mecanicos = mecanicos;
    }
    public void setJefeEstacion (ArrayList<JefeEstacion> jefesEstacion){
        this.jefesEstacion = jefesEstacion;
    }
    public void setVagones(ArrayList<Vagon> vagones){
        this.vagones = vagones;
    }
    public void setLocomotoras(ArrayList<Locomotora> locomotoras){
        this.locomotoras = locomotoras;
    }
    public void setTrenes(ArrayList<Tren> trenes){
        this.trenes = trenes;
    }

    //getters
    public String getNombre(String nombre){
        return this.nombre;
    }
    public int getCif(int cif){
        return this.cif;
    }
    public ArrayList<Maquinista> getMaquinista(){
        return this.maquinistas;
    }
    public ArrayList<Mecanico> getMecanico(){
        return this.mecanicos;
    }
    public ArrayList<JefeEstacion> getJefeEstacion(){
        return this.jefesEstacion;
    }
    public ArrayList<Vagon> getVagones(){
        return this.vagones;
    }
    public ArrayList<Locomotora> getLocomotoras(){
        return this.locomotoras;
    }
    public ArrayList<Tren> getTrenes(){
        return this.trenes;
    }

    //métodos
    public void addTren(Tren tren){
        trenes.add(tren);
    }

    @Override
    public String toString() {
        String result = "Empresa: " + nombre + "\n";
        result += "CIF: " + cif + "\n";
    
        result += "Mecánicos:\n";
        for (Mecanico mecanico : mecanicos) {
            result += "  - " + mecanico.toString() + "\n";
        }
    
        result += "Jefes de Estación:\n";
        for (JefeEstacion jefe : jefesEstacion) {
            result += "  - " + jefe.toString() + "\n";
        }
    
        result += "Vagones:\n";
        for (Vagon vagon : vagones) {
            result += "  - " + vagon.toString() + "\n";
        }
    
        result += "Locomotoras:\n";
        for (Locomotora locomotora : locomotoras) {
            result += "  - " + locomotora.toString() + "\n";
        }
    
        result += "Trenes:\n";
        for (Tren tren : trenes) {
            result += "  - " + tren.toString() + "\n";
        }
    
        return result;
    }
}