/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectocuenta;

/**
 *
 * @author LENOVO
 */
public class cuenta {
    
    private int noCuenta;
    private String nombreCliente;
    private double saldo;
    
    public cuenta(){
        this.noCuenta=0;
        this.nombreCliente = " ";
        this.saldo=0.0;
        
    }
    
    public int getNoCuenta(){
        return this. noCuenta;
    }
    
    public String getNombreCliente(){
        return this.nombreCliente;
    }
    
    public double getSaldo(){
        return this. saldo;
    }
    
    public void setNoCuenta( int n ){
        this.noCuenta=n;
    }
    
    public void setNombreCliente(String name){
       this. nombreCliente=name;
    }
    
    public void setSaldo(double v){
       this. saldo = v;
    }
    
    public boolean consignar(double monto){
        if(monto>0){
            saldo+=monto;
            return true;
        }else{
                System.out.println("El monto debe ser mayor a 0");
                return false;
            }
    } 
    
    public boolean retirar(double monto){
        if(monto>0 && saldo >= monto){
            saldo -=monto;
            return true;
        }else{
                System.out.println("El valor a retirar debe ser mayor a o");
                return false;
            }
    }
    
}


