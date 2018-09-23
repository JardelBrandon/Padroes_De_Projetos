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
public class PadraoJapao {
    PinoReto pinoFase;
    PinoReto pinoNeutro;

    
    public boolean forneceEnergia(PinoReto pinoFase, PinoReto pinoNeutro) {
        boolean energia;
        this.pinoFase = pinoFase;
        this.pinoNeutro = pinoNeutro;
        energia = this.pinoFase != null && this.pinoNeutro != null;
        return energia;
    }
}
