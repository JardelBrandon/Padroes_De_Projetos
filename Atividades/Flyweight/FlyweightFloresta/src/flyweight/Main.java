/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flyweight;

/**
 *
 * @author ifpb
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FlyweightFactory factory = new FlyweightFactory();

        factory.getFlyweight("CENARIO_1").desenharImagem(new Ponto(0, 0));

        factory.getFlyweight("JOGADOR").desenharImagem(new Ponto(10, 10));

        factory.getFlyweight("INIMIGO_1").desenharImagem(new Ponto(100, 10));
        
        factory.getFlyweight("INIMIGO_1").desenharImagem(new Ponto(120, 10));
        
        factory.getFlyweight("INIMIGO_1").desenharImagem(new Ponto(140, 10));

        factory.getFlyweight("INIMIGO_2").desenharImagem(new Ponto(60, 10));
        
        factory.getFlyweight("INIMIGO_2").desenharImagem(new Ponto(50, 10));

        factory.getFlyweight("INIMIGO_3").desenharImagem(new Ponto(170, 10));
    }

}
