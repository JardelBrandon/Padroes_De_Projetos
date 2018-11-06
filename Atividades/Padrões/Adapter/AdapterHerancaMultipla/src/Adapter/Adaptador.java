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
public class Adaptador extends ClasseExistente implements Alvo{

    public Adaptador() {
    }
    
    @Override
    public String operacao(String pinoFase, String pinoNeutro) {
        String pinoInexistente = "Terra";
        return metodoUtil(pinoFase, pinoNeutro, pinoInexistente);
    }
    
}
