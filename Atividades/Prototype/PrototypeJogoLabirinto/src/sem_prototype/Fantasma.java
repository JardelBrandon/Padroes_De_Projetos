/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sem_prototype;

/**
 *
 * @author robotica
 */
public class Fantasma extends Inimigo {

    public Fantasma() {
        tipo = "Fantasma";
    }

    @Override
    public void ataque() {
        System.out.println("Fantasma atacando.. BOOO!");
    }

}
