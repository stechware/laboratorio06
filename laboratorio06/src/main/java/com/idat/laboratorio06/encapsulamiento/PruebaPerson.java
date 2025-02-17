/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.idat.laboratorio06.encapsulamiento;

/**
 *
 * @author IDAT
 */
public class PruebaPerson {
    
    public static void main(String[] args) {
        
        Person persona = new Person("Juan Carlos");
        //persona.name ="Nombre Modificado";
        System.out.println(persona);
        persona.setName("Nombre Modificado");
        System.out.println(persona);
    }
    
}
