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
public class Adaptador extends PadraoEstadosUnidos implements Alvo{

    @Override
    public boolean operacao(PinoRedondo pinoFase, PinoRedondo pinoNeutro) {
        PinoReto pinoInexistente = new PinoReto();
        return forneceEnergia(pinoFase, pinoNeutro, pinoInexistente);
    }

}
