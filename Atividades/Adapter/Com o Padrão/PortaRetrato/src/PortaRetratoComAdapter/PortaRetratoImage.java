package PortaRetratoComAdapter;

import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PortaRetratoImage implements Runnable 
    {
	private File diretorio;
	private FrameImagem frameImagem;
	private long tempo;
        
        @Override
        public void run() {
            while (true) {
                File[] imagens = this.getArquivosImagens();
                
                for (File imagem: imagens) {
                    this.frameImagem.setImagem(imagem);
                    aguardarTempo();
                }
            }
        }
        
        private void aguardarTempo() {
            try {
                Thread.sleep(tempo);
            } catch (InterruptedException ex) {
                Logger.getLogger(PortaRetratoImage.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

	public PortaRetratoImage(String imagensDir, long tempo) 
	{	this.diretorio = new File(imagensDir);
		this.tempo = tempo;
		this.frameImagem = new FrameImagem("Digital Portrait");
	}
	
	private File[] getArquivosImagens() 
	{	return diretorio.listFiles(new ImageFileFilter());
	}
}

/*
{
    private File diretorio;
    private FrameImagem frameImagem;
    private long tempo;

    @Override
    public void run() {
        while (true) {
            File[] imagens = this.getArquivosImagens();

            for (File imagem: imagens) {
                this.frameImagem.setImagem(imagem);
                aguardarTempo();
            }
        }
    }

    public PortaRetratoImage() 
    {	    this.frameImagem = new FrameImagem("Digital Portrait");
    }

    private void aguardarTempo() {
        try {
            Thread.sleep(tempo);
        } catch (InterruptedException ex) {
            Logger.getLogger(PortaRetratoImage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void setTempo(long tempo) {
        this.tempo = tempo;
    }
    

    public void setDiretorio(File diretorio) {
        this.diretorio = diretorio;
    }

    private File[] getArquivosImagens() 
    {	return diretorio.listFiles(new ImageFileFilter());
    }
}
*/