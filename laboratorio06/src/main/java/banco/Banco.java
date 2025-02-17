/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banco;

/**
 *
 * @author IDAT
 */
public class Banco {
    
    Cliente cliente1, cliente2, cliente3;

    public Banco(Cliente cliente1, Cliente cliente2, Cliente cliente3) {
        this.cliente1 = cliente1;
        this.cliente2 = cliente2;
        this.cliente3 = cliente3;
    }

    public Cliente getCliente1() {
        return cliente1;
    }

    public void setCliente1(Cliente cliente1) {
        this.cliente1 = cliente1;
    }

    public Cliente getCliente2() {
        return cliente2;
    }

    public void setCliente2(Cliente cliente2) {
        this.cliente2 = cliente2;
    }

    public Cliente getCliente3() {
        return cliente3;
    }

    public void setCliente3(Cliente cliente3) {
        this.cliente3 = cliente3;
    }

    @Override
    public String toString() {
        return "Banco{" + "cliente1=" + cliente1 + ", cliente2=" + cliente2 + ", cliente3=" + cliente3 + '}';
    }
    
    public void imprimirClientes(){
        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(cliente3);
    }
    
    public void imprimirSaldoClientes(){
        double montoTotal = cliente1.getSaldo()+cliente2.getSaldo()+cliente3.getSaldo();
        System.out.println("Saldo Total = "+montoTotal);
    }
    
    
}
