/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConectaTomada;

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
        PinoRedondo pinoFase = new PinoRedondo();
        PinoRedondo pinoNeutro = new PinoRedondo();
        TomadaAlemanha cliente = new TomadaAlemanha();
        cliente.operacao(pinoFase, pinoNeutro);
    }
    
}
