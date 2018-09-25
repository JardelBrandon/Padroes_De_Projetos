/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NotepadComFacade;

/**
 *
 * @author jarde
 */
public class FacadeNotepad {
    private Notepad notepad;
    
    public FacadeNotepad() {
        System.out.println("Instanciando Sistema!");
        notepad = new Notepad();
        notepad.setVisible(true);
    }
    
    public void salvamentoAutomatico() {
        Thread salvarAutomaticamente = new Thread(notepad, "Salvar");
        salvarAutomaticamente.start();
        System.out.println("Salvamento automático");
    }
    
    public void interfaceGrafica() {
        notepad.janelaNotepad();
        System.out.println("Inicializando Sistema Gráfico");
    }
}
