/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototype;

import java.util.HashMap;


/**
 *
 * @author robotica
 */
public class Main {
    private static HashMap<Integer, Animal> ovelhasClones;
    private static HashMap<Integer, Animal> gatosClones;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ovelhasClones = new HashMap<>();
        gatosClones = new HashMap<>();
        
        Ovelha ovelha = new Ovelha("Doly");
        PrototypeFactory prototypeOvelha = new PrototypeFactory(ovelha);
        Animal animal = prototypeOvelha.criarClone();
        System.out.println("Tipo do animal: " + animal.getClass().getSimpleName() 
                             + "\nNome do animal: " + animal.getNome());
        animal.andar();
        animal.comer();
        
        Animal clone = prototypeOvelha.criarClone();
        clone.setNome("LaLa");
        clone.andar();
        animal.andar();
        
        Gato gato = new Gato("Nano");
        PrototypeFactory prototypeGato = new PrototypeFactory(gato);
        clone = prototypeGato.criarClone();
        System.out.println("Tipo do animal: " + animal.getClass().getSimpleName() 
                             + "\nNome do animal: " + animal.getNome());
        System.out.println("Tipo do animal: " + clone.getClass().getSimpleName() 
                             + "\nNome do animal: " + clone.getNome());
        clone.andar();
        clone.comer();
        
        for (int i = 0; i < 50; i++) {
            ovelhasClones.put(i, prototypeOvelha.criarClone());
            gatosClones.put(i, prototypeGato.criarClone());
        }
        ovelhasClones.get(40).setNome("LiLi");
        ovelhasClones.get(40).andar();
    }
    
}
