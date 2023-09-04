/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectocuenta;
/**
 *
 * @author LENOVO
 */

public class Main {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       cuenta a=new cuenta();
       a.setNoCuenta(123);
       a.setNombreCliente("Juan C");
       a.setSaldo(5000);
       a.consignar(1500);
       a.retirar(800);
       
       System.out.println("Información de la cuenta:");
       System.out.println("Número de cuenta: " + a.getNoCuenta());
       System.out.println("Nombre del cliente: " + a.getNombreCliente());
       System.out.println("Saldo actual: " + a.getSaldo());
    }
    
}
