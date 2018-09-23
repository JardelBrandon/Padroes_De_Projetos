package PortaRetratoComAdapter;

import java.io.File;
import javax.swing.JFrame;

public class SimpleGridLayoutImageAdapterHeranca extends SimpleGridLayoutImage implements ImagemTargetHeranca {

    @Override
    public void carregarImagens(String imagensRepositorio) {
        SimpleGridLayoutImage simple = new SimpleGridLayoutImage();
        simple.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setDiretorio(new File(imagensRepositorio));
        System.out.println(imagensRepositorio);
    }

    @Override
    public void desenharImagens() {
        Thread simpleThread = new Thread(this);
        simpleThread.start();
        
    }   
}
