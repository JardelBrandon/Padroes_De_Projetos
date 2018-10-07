/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author jarde
 */
public class Sujeito {
    private static List<Observador> observadores = new ArrayList();
    
    public void cadastrar(Observador o) {
        observadores.add(o);
    }
    public void remover(Observador o) {
        observadores.remove(o);
    }
    
    public void notificar() {
        Iterator iterator = observadores.iterator();
        while(iterator.hasNext()) {
            Observador o = (Observador)iterator.next();
            o.atualizar();
        }
    }
}
