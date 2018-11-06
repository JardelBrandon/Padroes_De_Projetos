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
public class Vampiro extends Inimigo {

    public Vampiro() {
        tipo = "Vampiro";
    }

    @Override
    public void ataque() {
        System.out.println("Vampiro atacando.. Quero sangue!");
    }

}
