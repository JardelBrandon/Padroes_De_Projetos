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
public class CompositeColecoes implements Publicacao {
    private List<Publicacao> publicacoes = new ArrayList<>();
    
    public void printTitulo() {
        for (Publicacao publicacao : publicacoes) {
            publicacao.printTitulo();
        }
    }
    public void printData() {
        for (Publicacao publicacao : publicacoes) {
            publicacao.printData();
        }
    }
    
    public void printTexto() {
        for (Publicacao publicacao : publicacoes) {
            publicacao.printTexto();
        }
    }
    
    //Adiciona o grafico  a composiÃ§Ã£o.
    public void add(Publicacao publicacao) {
        publicacoes.add(publicacao);
    }
    //Remove a forma geometrica da composiÃ§Ã£o.
    public void remove(Publicacao publicacao) {
        publicacoes.remove(publicacao);
    }
}
