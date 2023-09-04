/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectotrianguloisósceles;

/**
 *
 * @author LENOVO
 */
public class CalcularTriangulo {
    private double Base;
    private double Altura;
    
    public CalcularTriangulo(){
        this.Base=0;
        this.Altura=0;
    }
    
    public double getBase(){
        return this.Base;
    }
    
    public double getAltura(){
        return this.Altura;
    }
    
    public void setBase(double B){
        this.Base=B;
    }
    
    public void setAltura(double A){
        this.Altura=A;
    }
    
    public double CalcularArea(){
        return (Base*Altura)/2;
    }
    
    public double CalcularLLI(){
        return Math.sqrt((Base)/2+(Altura*Altura));
    }
    
    public double CalcularPerimetro(){
        double LadosIguales=CalcularLLI();
        return LadosIguales*2 + Base;
    }
    
    public double CalcularValorAnVer(){
        double LadosIguales = CalcularLLI();
        return Math.acos((Base/2) / LadosIguales );
    }
}
