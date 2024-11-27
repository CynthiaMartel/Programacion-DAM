package Ejer3;

public class DNI {
    
    //atributos
    protected int numero;
    protected char letra;

    //Constructores
    public DNI (int numero, char letra){
        this.numero = numero;
        this.letra= letra;
    }
    
    //setters
    public void setNumero(int numero){
        this.numero = numero;
    }
    public void setLetra(char letra){
        this.letra = letra;
    }
    //getters
    public int getNumero(){
        return this.numero;
    }
    public char getLetra(){
        return this.letra;
    }

    //Métodos
    public boolean validacionDNI(){
        if (Integer.toString(numero).length() == 8){
            System.out.print("DNI válido");
            return true;
        }
        else{
            System.out.print("DNI no válido");
            return false;
            
        }
    }
    

    static char[] LETRAS_DNI = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 
     'N', 'J','Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
    public static char asignarLetraDni(int numero){
        int letra = numero % 23;
        return LETRAS_DNI[letra];
    }
}
