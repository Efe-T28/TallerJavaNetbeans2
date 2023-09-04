/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectocoche;

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
        PruebaCoche a = new PruebaCoche();
        a.setColor("Amarillo");
        a.setMarca("FORD");
        a.setMatricular("123KJR");
        a.setModelo("Fiesta");
        a.setNoCaballos(125.4);
        a.setNoPuertas(4);
        
        PruebaCoche b = new PruebaCoche();
        b.setColor("Rojo");
        b.setMarca("LAND ROVER");
        b.setMatricular("153ABN");
        b.setModelo("T-1000");
        b.setNoCaballos(135.4);
        b.setNoPuertas(4);
        
        System.out.println("Coche a:");
        System.out.println(a.toString());

        System.out.println("Coche b:");
        System.out.println(b.toString());
        
        b.setNoCaballos(250);
        
        System.out.println("Coche b después de cambiar uno de sus atributos(número de caballos)");
        System.out.println(b.toString());
    }
    
}
