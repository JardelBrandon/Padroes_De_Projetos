package com_prototype;

public class Vampiro extends Inimigo {

    public Vampiro() {
        tipo = "Vampiro";
    }

    @Override
    public void ataque() {
        System.out.println("Vampiro atacando.. Quero sangue!");
    }

}
