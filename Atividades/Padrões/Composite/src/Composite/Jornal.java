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
public class Jornal implements Publicacao {
    private List<Publicacao> artigos = new ArrayList<>();
    private List<Publicacao> cadernos = new ArrayList<>();
    
    public void printTitulo() {
        for (Publicacao artigo : artigos) {
            artigo.printTitulo();
        }
        for (Publicacao caderno : cadernos) {
            caderno.printTitulo();
        }
    }
    public void printData() {
        for (Publicacao artigo : artigos) {
            artigo.printData();
        }
        for (Publicacao caderno : cadernos) {
            caderno.printData();
        }
    }
    
    public void printTexto() {
        for (Publicacao artigo : artigos) {
            artigo.printTexto();
        }
        for (Publicacao caderno : cadernos) {
            caderno.printTexto();
        }
    }
}
