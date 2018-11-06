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
public class Cliente {
    Alvo alvo = new Adaptador(); 
    public void operacao(String pinoFase, String pinoNeutro) {
        System.out.println("Energia: " + alvo.operacao(pinoFase, pinoNeutro));
    }
}
