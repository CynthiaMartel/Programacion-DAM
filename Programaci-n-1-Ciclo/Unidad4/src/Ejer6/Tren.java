package Ejer6;

import java.util.ArrayList;

public class Tren {
    //atributos
    protected Locomotora locomotoras; //solo una locomotora
    protected ArrayList<Vagon> vagones; //máximo 3 vagones
    protected Maquinista maquinistas; //Solo un maquinista

    //Constructores
    public Tren(Locomotora locomotoras, ArrayList<Vagon> vagones,Maquinista maquinistas){
        if (vagones.size() > 5) {
            throw new IllegalArgumentException("Un tren no puede tener más de 5 vagones.");
        }
        this.locomotoras = locomotoras;
        this.vagones = vagones;
        this.maquinistas = maquinistas;
    }
    //setters
    public void setLocomotoras(Locomotora locomotoras){
        if (this.locomotoras != null){
            throw new IllegalArgumentException("Ya hay una locomotora asignada.");
        }
        this.locomotoras = locomotoras;
    }
    public void setVagones(ArrayList<Vagon> vagones){
        this.vagones = vagones;
    }
    public void setMaquinista(Maquinista maquinistas){
        if (this.maquinistas != null){
            throw new IllegalArgumentException("Ya hay un maquinista asignado.");
        }
        this.maquinistas = maquinistas;
    }
    //getters
    public Locomotora getLocomotoras(){
        return this.locomotoras;
    }
    public ArrayList<Vagon> getVagon(){
        return this.vagones;
    }
    public Maquinista getMaquinistas(){
        return this.maquinistas;
    }

    //metodos:
    public void addVagon(Vagon vagon){
        if (this.vagones.size() >= 3){
            throw new IllegalArgumentException("Solo se pueden añadir hasta 3 vagones.");
        }
        this.vagones.add(vagon);
    }
    @Override
    public String toString(){
        return "Locomotoras: " + locomotoras + "\n" +
                "Vagones: " + vagones + "\n" +
                "Maquinista: " + maquinistas + "\n";
    }
}
