/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com_prototype;

import java.util.Hashtable;

public class Repo_inimigos {

    private static Hashtable<String, Inimigo> inimigosRepo = new Hashtable<String, Inimigo>();

    public static Inimigo getInimigo(String inimigoId) {
        Inimigo prototypeInimigo = inimigosRepo.get(inimigoId);
        return (Inimigo) prototypeInimigo.clone();
    }

    public static void loadRepo() {
        Fantasma fantasma = new Fantasma();
        fantasma.setId("1");
        fantasma.setEnergia(10);
        fantasma.setForca(5);
        fantasma.setNivel(1);
        inimigosRepo.put(fantasma.getId(), fantasma);
        
        Vampiro vampiro = new Vampiro();
        vampiro.setId("2");
        vampiro.setEnergia(20);
        vampiro.setForca(10);
        vampiro.setNivel(10);
        inimigosRepo.put(vampiro.getId(), vampiro);
    }
}
