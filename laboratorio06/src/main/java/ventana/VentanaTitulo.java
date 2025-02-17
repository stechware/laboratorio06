/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ventana;

/**
 *
 * @author IDAT
 */
public class VentanaTitulo extends Ventana{
    
    private String titulo;
            
    public VentanaTitulo(int x, int y, int ancho, int alto, String titulo) {
        super(x, y, ancho, alto);
        this.titulo = titulo;
    }
    
    public void mostrar(){
     super.mostrar();
     System.out.println("Titulo : "+ titulo );
     
    }
    
    public void desplazar(int dx, int dy) {
        super.setX(super.getX()+ dx);
        super.setY(super.getY()+ dy);
        
    }
    
    
}
