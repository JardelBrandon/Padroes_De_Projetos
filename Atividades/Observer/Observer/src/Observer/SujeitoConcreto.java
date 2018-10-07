/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer;

/**
 *
 * @author jarde
 */
public class SujeitoConcreto extends Sujeito {
    private static String dadosDoSujeito;
    
    public void setDados(String dados) {
        SujeitoConcreto.dadosDoSujeito = dados;
        super.notificar();
    }
    
    public String getDados() {
        return SujeitoConcreto.dadosDoSujeito;
    }
}
