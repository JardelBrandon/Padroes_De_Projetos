/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adapter;

/**
 *
 * @author ifpb
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String pinoFase = "220V";
        String pinoNeutro = "0v";
        Cliente cliente = new Cliente();
        cliente.operacao(pinoFase, pinoNeutro);
    }
    
}
