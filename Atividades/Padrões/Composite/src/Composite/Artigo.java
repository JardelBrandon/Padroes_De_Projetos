/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Composite;

/**
 *
 * @author ifpb
 */
public class Artigo implements Publicacao{
    String titulo;
    String data;
    String texto;

    @Override
    public void printTexto() {
        System.out.println(texto);
    }

    @Override
    public void printData() {
        System.out.println(data);
    }

    @Override
    public void printTitulo() {
        System.out.println(titulo);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
    
}
