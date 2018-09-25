package RelogiosComComposite;

import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main 
{
	public static void main(String[] args) throws ParseException 
	{	Relogio[] relogios = new Relogio[4];
		relogios[0] = new RelogioDigital();
		relogios[1] = new RelogioAnalogico();
                relogios[2] = new RelogioTerminal();
                
		Alarme alarme = new Alarme();
                Alarme alarmeDigital = new Alarme();
                Alarme alarmeAnalogico = new Alarme();
                
                alarmeDigital.add(relogios[0]);
                alarmeDigital.add(relogios[2]);
                alarmeAnalogico.add(relogios[1]);
                alarme.add(alarmeDigital);
                alarme.add(alarmeAnalogico);
                Thread threadAlarmeAnalogico = new Thread(alarme);
                threadAlarmeAnalogico.start();
                Thread threadAlarme = new Thread(alarme);
                threadAlarme.start();
                relogios[3] = new RelogioDigital();
                alarme.add(relogios[3]);
	}
}
