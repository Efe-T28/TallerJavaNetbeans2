/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectotrianguloisósceles;
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
       CalcularTriangulo a=new CalcularTriangulo();
       a.setBase(50.4);
       a.setAltura(23.7);
       
       System.out.println("Triangulo Isósceles:");
       System.out.println("Área del triangulo: " + a.CalcularArea());
       System.out.println("Longitud de lados iguales: " + a.CalcularLLI());
       System.out.println("Perímetro: " + a.CalcularPerimetro());
       System.out.println("Valor del ángulo vértice" + a.CalcularValorAnVer());
    }
    
}
