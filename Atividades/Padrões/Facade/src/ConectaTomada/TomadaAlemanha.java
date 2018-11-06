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
public class TomadaAlemanha {
    PinoRedondo pinoFase;
    PinoRedondo pinoNeutro;
    
    Alvo alvo = new Adaptador(); 
    public void operacao(PinoRedondo pinoFase, PinoRedondo pinoNeutro) {
        System.out.println(alvo.operacao(pinoFase, pinoNeutro));
    }
}
