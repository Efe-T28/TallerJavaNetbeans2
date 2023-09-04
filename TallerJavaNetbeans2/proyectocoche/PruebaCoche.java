/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectocoche;

/**
 *
 * @author LENOVO
 */
public class PruebaCoche {
    private String Color;
    private String Marca;
    private String Modelo;
    private double NoCaballos;
    private int NoPuertas;
    private String Matricula;
    
    public PruebaCoche(){
        this.Color=" ";
        this.Marca=" ";
        this.Matricula=" ";
        this.Modelo=" ";
        this.NoCaballos=0.0;
        this.NoPuertas=0;
    }
    
   public String getColor() {
        return this.Color;
    }
    
    public String getMarca(){
        return this.Marca;
    }
    
    public String getModelo(){
        return this.Modelo;
    }
    
    public double getNoCaballos(){
        return this.NoCaballos;
    }
    
    public int getNoPuertas(){
        return this.NoPuertas;
    }
    
    public String getMatricula(){
        return this.Matricula;
    }
    
    public void setColor(String c){
        this.Color=c;
    }
    
    public void setMarca(String m){
        this.Marca=m;
    }
    
    public void setModelo(String Mo){
        this.Modelo=Mo;
    }
    
    public void setNoCaballos(double cb){
        this.NoCaballos=cb;
    }
    
    public void setNoPuertas(int p){
        this.NoPuertas=p;
    }
    
    public void setMatricular(String m){
        this.Matricula=m;
    }
    
    public String toString() {
        return "Coche{" +
                "color='" + Color + '\'' +
                ", marca='" + Marca + '\'' +
                ", modelo='" + Modelo + '\'' +
                ", numeroCaballos=" + NoCaballos +
                ", numeroPuertas=" + NoPuertas +
                ", matricula='" + Matricula + '\'' +
                '}';
    }
}
