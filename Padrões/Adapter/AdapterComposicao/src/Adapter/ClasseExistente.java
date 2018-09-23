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
public class ClasseExistente {
    String pinoFase;
    String pinoNeutro;
    String pinoTerra;
    boolean energia = false;
    
    public boolean metodoUtil(String pinoFase, String pinoNeutro, String pinoTerra) {
        this.pinoFase = pinoFase;
        this.pinoNeutro = pinoNeutro;
        this.pinoTerra = pinoTerra;
        this.energia = true;
        return energia;
    }
}
