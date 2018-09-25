package RelogiosComComposite;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Alarme extends Thread implements Relogio
{
	private static final int INTERVALO = 100;
	private int hora;
	private int minuto;
	private boolean primeiraVez = true;
        private List<Relogio> filhosRelogios = new ArrayList<>();
        
        @Override
        public void run() {
            while (true) {
                if (this.primeiraVez) {
                    this.ajustaRelogios();
                    this.primeiraVez = false;
                }
                else if (this.hora != getHoraAtual() || this.minuto != getMinutoAtual()) {
                    ajustaRelogios();
                }
                esperarIntervalo();
            }
        }
        
        private void esperarIntervalo() {
            try {
                Thread.sleep(INTERVALO);
            } catch (InterruptedException ex) {
                Logger.getLogger(Alarme.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        private void ajustaRelogios() {
            this.hora = this.getHoraAtual();
            this.minuto = this.getMinutoAtual();
            this.horaMudou(hora);
            this.minutoMudou(minuto);
        }
        
	
	private int getHoraAtual()
	{	//pega o momento atual
		GregorianCalendar momento = new GregorianCalendar();
		//pega a hora atual
		return momento.get(GregorianCalendar.HOUR_OF_DAY);
	}
	
	private int getMinutoAtual()
	{	//pega o momento atual
		GregorianCalendar momento = new GregorianCalendar();
		//pega o minuto atual
		return momento.get(GregorianCalendar.MINUTE);
	}

        //Adiciona o grafico  a composiÃ§Ã£o.
        public void add(Relogio relogio) {
            filhosRelogios.add(relogio);
        }
        //Remove a forma geometrica da composiÃ§Ã£o.
        public void remove(Relogio relogio) {
            filhosRelogios.remove(relogio);
        }
        @Override
        public void horaMudou(int novaHora) {
            for (Relogio relogio: filhosRelogios) 
                    {	relogio.horaMudou(novaHora);	
                    }
        }

        @Override
        public void minutoMudou(int novoMinuto) {
            for (Relogio relogio: filhosRelogios) 
                    {	relogio.minutoMudou(novoMinuto);	
                    }
        }
}
