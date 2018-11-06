package com_prototype;

public class JogoLabirinto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RepoInimigos.loadRepo();
        Inimigo fantasma_clone = (Inimigo) RepoInimigos.getInimigo("1"); //id = 1 = fantasma
        fantasma_clone.ataque(); // fantasma ja pode atacar pois o objeto veio completo!
        System.out.println("Inimigo : " + fantasma_clone.getTipo() + " nivel " + fantasma_clone.getNivel());	
        
        Inimigo besta_clone = (Inimigo) RepoInimigos.getInimigo("2"); //id = 2 = besta
        besta_clone.ataque(); // besta ja pode atacar pois o objeto veio completo!
        System.out.println("Inimigo : " + besta_clone.getTipo() + " nivel " + besta_clone.getNivel());
    }

}
