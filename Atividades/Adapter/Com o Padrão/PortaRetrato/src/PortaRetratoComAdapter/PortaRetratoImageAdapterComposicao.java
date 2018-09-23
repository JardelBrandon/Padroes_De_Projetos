    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PortaRetratoComAdapter;

import java.io.File;

/**
 *
 * @author jarde
 */
public class PortaRetratoImageAdapterComposicao extends ImagemTargetComposicao {
    private static final long TIME_OUT = 5000;
    private static PortaRetratoImage portaRetrato;

    @Override
    public void carregarImagens(String imagensRepositorio) {
        portaRetrato = new PortaRetratoImage(imagensRepositorio, TIME_OUT);
        System.out.println(imagensRepositorio);
    }

    @Override
    public void desenharImagens() {
        Thread threadPortaRetrato = new Thread(portaRetrato);
        threadPortaRetrato.start();
    }
    
}
