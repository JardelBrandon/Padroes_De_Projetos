/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RelogiosComComposite;

/**
 *
 * @author jarde
 */
public class RelogioTerminal implements Relogio {
    private String labelHora;
    private String labelMinuto;

    public void setHora(int hora)
    {	labelHora = toDuasCasaDecimais(hora);   
    }

    public void setMinuto(int minuto)
    {	labelMinuto = toDuasCasaDecimais(minuto);   
    }

    private String toDuasCasaDecimais(int valor)
    {	return ((valor < 10) ? "0" : "") + valor;
    }

    public void horaMudou(int novaHora) 
    {	setHora(novaHora);
        System.out.print(toString());
    }

    public void minutoMudou(int novoMinuto) 
    {	setMinuto(novoMinuto);	
        System.out.print(toString());
    }

    @Override
    public String toString() {
        return "Relógio Terminal -> Horas: " + labelHora + ":" + labelMinuto + "\r";
    }

    public String getLabelHora() {
        return labelHora;
    }

    public void setLabelHora(String labelHora) {
        this.labelHora = labelHora;
    }

    public String getLabelMinuto() {
        return labelMinuto;
    }

    public void setLabelMinuto(String labelMinuto) {
        this.labelMinuto = labelMinuto;
    }
    
    
}
