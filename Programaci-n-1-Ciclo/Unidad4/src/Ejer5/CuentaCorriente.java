package Ejer5;


public class CuentaCorriente {
    
    //Atributos
    protected int DNI;
    protected String titular;
    protected double saldo;
    
    //Constructores
    public CuentaCorriente(int DNI, String titular){
        this.DNI = DNI;
        this.titular = titular;
        this.saldo = 0;     
    }

    //getters:
    public int getDNI(){
        return this.DNI;
    }
    public String getTitular(){
        return this.titular;
    }
    public double getSaldo(){
        return this.saldo;
    }

    //setters:
    public void setDNI(int DNI){
        this.DNI = DNI;
    }
    public void setTitular(String titular){
        this.titular = titular;
    }
    public void setSaldo(int saldo){
        this.saldo = saldo;    
    }

    //Métodos:
    public boolean sacarDinero(double dineroRetirado){
        if(dineroRetirado > 0 && dineroRetirado <= saldo){
            saldo =- dineroRetirado;
            System.out.println("Se ha retirado exitosamente :" + dineroRetirado + " euros");
            return true;
        }
        else{
            System.out.print("NOperación denegada. Saldo insuciente o cantidad no válida.");
            return false;
        }
    }
    public double ingresarDinero(double dineroIngresado){
        saldo =+ dineroIngresado;
        System.out.println("Se ha ingresado dinero exitosamente :" + dineroIngresado + " euros");
        return saldo;
    }
   
    public void mostrarInfo(){
        System.out.println( "_Info de la cuenta_");
        System.out.println("Titular: " + this.titular);
        System.out.println("DNI: " + this.DNI);
        System.out.println("saldo: " + this.saldo + " euros");
      
    }
}
