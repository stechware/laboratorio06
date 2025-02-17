/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ventana;

/**
 *
 * @author IDAT
 */
public class PruebaVentana {
    
    public static void main(String[] args) {
        
        Ventana ventana = new Ventana(0, 0, 20, 30);
        ventana.mostrar();
        ventana.cambiarDimensiones(10, 10);
        ventana.mostrar();
        
        VentanaTitulo ventanaTitulo = new VentanaTitulo(0, 0, 20, 30, "Principal");
        ventanaTitulo.mostrar();
        ventanaTitulo.desplazar(4, 3);
        ventanaTitulo.cambiarDimensiones(10, -5);
        ventanaTitulo.mostrar();


    }
    
}
