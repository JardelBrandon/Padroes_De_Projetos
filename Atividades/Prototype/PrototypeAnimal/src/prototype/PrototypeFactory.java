/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototype;

/**
 *
 * @author robotica
 */
public class PrototypeFactory {

    Animal prototypeAnimal;

    public PrototypeFactory(Animal prototypeAnimal) {
        this.prototypeAnimal = prototypeAnimal;
    }

    public Animal criarClone() {
        return (Animal) prototypeAnimal.clone();
    }
}
