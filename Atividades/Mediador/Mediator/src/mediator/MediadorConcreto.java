/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediator;

/**
 *
 * @author jarde
 */
public class MediadorConcreto implements Mediador {
    private Colaborador1 colaborador1 = new Colaborador1();
    private Colaborador2 colaborador2 = new Colaborador2();

    public MediadorConcreto() {
        colaborador1.setMediador(this);
        colaborador2.setMediador(this);
    }

    @Override
    public void copiar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
