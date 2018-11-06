/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototype;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author robotica
 */
public abstract class Animal implements Cloneable {
    String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void comer() {
        System.out.println(nome + " está comendo...");
    }
    
    public void andar() {
        System.out.println(nome + " está andando...");
    }

    @Override
    protected Object clone() {
        Object object = null;
        try {
            object = super.clone(); 
        } catch (CloneNotSupportedException ex) {
            System.err.println("O animal não foi clonado!");
            Logger.getLogger(Animal.class.getName()).log(Level.SEVERE, null, ex);
        }
        return object;
    }
    
}
