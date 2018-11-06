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
public class Adaptador extends Alvo {
    ClasseExistente classeExistente = new ClasseExistente();
    @Override
    public boolean operacao(String pinoFase, String pinoNeutro) {
        String pinoInexistente = null;
        return classeExistente.metodoUtil(pinoFase, pinoNeutro, pinoInexistente);
    }
    
}
