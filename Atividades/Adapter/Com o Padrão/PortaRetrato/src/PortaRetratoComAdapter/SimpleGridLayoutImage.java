package PortaRetratoComAdapter;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.io.File;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import marvin.gui.MarvinImagePanel;
import marvin.image.MarvinImage;
import marvin.io.MarvinImageIO;
import marvin.plugin.MarvinImagePlugin;
import marvin.util.MarvinPluginLoader;

public class SimpleGridLayoutImage extends JFrame implements Runnable{
    JScrollPane jsp;
    JPanel painel;
    private File diretorio;
    MarvinImagePlugin prewitt           = MarvinPluginLoader.loadImagePlugin("org.marvinproject.image.edge.prewitt");
    MarvinImagePlugin errorDiffusion    = MarvinPluginLoader.loadImagePlugin("org.marvinproject.image.halftone.errorDiffusion");
    MarvinImagePlugin emboss            = MarvinPluginLoader.loadImagePlugin("org.marvinproject.image.color.emboss");

    @Override
    public void run() {
        
        // Layout
        painel = new JPanel();
        painel.setBorder(BorderFactory.createTitledBorder("GridLayout"));
        painel.setLayout(new GridLayout(0,2));
        
        
        File[] imagens = this.getArquivosImagens();
        MarvinImage[] marvinImagens = new MarvinImage[(int) diretorio.length()];
        
        
        for (int i = 0; i < imagens.length; i++) {
            marvinImagens[i] = MarvinImageIO.loadImage(imagens[i].getAbsolutePath());
            addPanel(marvinImagens[i]);
        }
        // Load images
        //MarvinImage img1 = MarvinImageIO.loadImage("./res/car.jpg");

        // Set panels
        //addPanel(img1);
        jsp = new JScrollPane();
        //defini um tamanho preferido pro scrollpane
        jsp.setPreferredSize(new Dimension(350, 150));
        //defini o painel de checkboxes como viewport do scrollpane
        jsp.setViewportView(painel);
        add(jsp);
        setSize(560,700);
        setVisible(true); 
    }

    public void addPanel(MarvinImage image){
        MarvinImagePanel imagePanel = new MarvinImagePanel();
        imagePanel.setImage(image);
        painel.add(imagePanel);
    }
    
    public void setDiretorio(File diretorio) {
        this.diretorio = diretorio;
    }

    private File[] getArquivosImagens() 
    {	return diretorio.listFiles(new ImageFileFilter());
    }
}