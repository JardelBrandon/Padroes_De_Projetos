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
public class Caderno implements Publicacao {
    private List<Publicacao> artigos = new ArrayList<>();
    private List<Publicacao> revistas = new ArrayList<>();
    
    public void printTitulo() {
        for (Publicacao artigo : artigos) {
            artigo.printTitulo();
        }
        for (Publicacao caderno : revistas) {
            caderno.printTitulo();
        }
    }
    public void printData() {
        for (Publicacao artigo : artigos) {
            artigo.printData();
        }
        for (Publicacao caderno : revistas) {
            caderno.printData();
        }
    }
    
    public void printTexto() {
        for (Publicacao artigo : artigos) {
            artigo.printTexto();
        }
        for (Publicacao caderno : revistas) {
            caderno.printTexto();
        }
    }
}
