/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banco;

/**
 *
 * @author IDAT
 */
public class PruebaBanco {
    
    public static void main(String[] args) {
        
        Cliente cliente1 = new Cliente("Juan","Solar","123456","123465",0);
        Cliente cliente2 = new Cliente("Ana","Chavez","123456","123465",0);
        Cliente cliente3 = new Cliente("Pedro","Soria","123456","123465",0);
        
        Banco banco = new Banco(cliente1, cliente2, cliente3);
        
        cliente1.deposito(100);
        cliente2.deposito(500);
        cliente3.deposito(2000);
        
        banco.imprimirClientes();
        
        cliente1.retiro(50);
        cliente2.retiro(100);
        cliente3.retiro(2000);
        
        banco.imprimirClientes();
        
        banco.imprimirSaldoClientes();
        
    }
    
}
