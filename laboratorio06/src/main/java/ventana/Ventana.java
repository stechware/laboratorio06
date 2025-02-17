/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ventana;

/**
 *
 * @author IDAT
 */
public class Ventana {
    
    private int x,y,ancho, alto;

    public Ventana(int x, int y, int ancho, int alto) {
        this.x = x;
        this.y = y;
        this.ancho = ancho;
        this.alto = alto;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    @Override
    public String toString() {
        return "Ventana{" + "x=" + x + ", y=" + y + ", ancho=" + ancho + ", alto=" + alto + '}';
    }
    
    public void mostrar(){
        
        System.out.println("Posición    : x=" + x + ", y=" + y);
        System.out.println("Dimensiones : w=" + ancho + ", h=" + alto);
    }
    
    public void cambiarDimensiones(int dw, int dh) {
        ancho += dw;        
        alto += dh;
    }
    
   
}
