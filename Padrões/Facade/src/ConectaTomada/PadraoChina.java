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
public class PadraoChina {
    PinoRetoDiagonal pinoFase;
    PinoRetoDiagonal pinoNeutro;
    PinoReto pinoTerra;
    
    public boolean forneceEnergia(PinoRetoDiagonal pinoFase, PinoRetoDiagonal pinoNeutro, PinoReto pinoTerra) {
        boolean energia;
        this.pinoFase = pinoFase;
        this.pinoNeutro = pinoNeutro;
        this.pinoTerra = pinoTerra;
        energia = this.pinoTerra != null && this.pinoFase != null && this.pinoNeutro != null;
        return energia;
    }
}
