package com_prototype;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author robotica
 */
public abstract class Inimigo implements Cloneable {

    private String id;
    protected String tipo;
    private int forca;
    private int energia;
    private int nivel;

    abstract void ataque();

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public String getTipo() {
        return tipo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public Object clone() {
        Object clone = null;

        try {
            clone = super.clone();
        } catch (CloneNotSupportedException ex) {
            Logger.getLogger(Inimigo.class.getName()).log(Level.SEVERE, null, ex);
        }

        return clone;
    }

}
