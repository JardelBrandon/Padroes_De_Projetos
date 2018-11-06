/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Composite;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ifpb
 */
public class Revista implements Publicacao {
    private List<Publicacao> artigos = new ArrayList<Publicacao>();

    public void printTitulo() {
        for (Publicacao artigo : artigos) {
            artigo.printTitulo();
        }
    }
    public void printData() {
        for (Publicacao artigo : artigos) {
            artigo.printData();
        }
    }
    
    public void printTexto() {
        for (Publicacao artigo : artigos) {
            artigo.printTexto();
        }
    }
}
