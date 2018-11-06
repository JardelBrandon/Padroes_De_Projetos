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
public class JogoLabirinto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Inimigo fantasma = new Fantasma();
        //setup de cada inimigo individual
        fantasma.setId("1");
        fantasma.setEnergia(10);
        fantasma.setForca(5);
        fantasma.setNivel(1);
        fantasma.ataque(); //so aqui o inimigo ja pode atacar
        
        Inimigo vampiro = new Vampiro();
        //setup de cada inimigo individual
        vampiro.setId("2");
        vampiro.setEnergia(20);
        vampiro.setForca(10);
        vampiro.setNivel(1);
        vampiro.ataque(); //so aqui o inimigo ja pode atacar
        
        //se mais na frente eu quiser mais inimigos,
        //teremos mais repeticoes desse trecho
    }

}
