package prototype;

import java.awt.Rectangle;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FiestaPrototype fiestaPrototype = new FiestaPrototype();

        CarroPrototype fiestaNovo = fiestaPrototype.clonar();
        fiestaNovo.setValorCompra(27900.0);
        CarroPrototype fiestaUsado = fiestaPrototype.clonar();
        fiestaUsado.setValorCompra(21000.0);
        
        System.out.println(fiestaNovo.exibirInfo());
        System.out.println(fiestaUsado.exibirInfo());
        
        PalioPrototype palioPrototype = new PalioPrototype();
        
        CarroPrototype palioNovo = palioPrototype.clonar();
        palioNovo.setValorCompra(30000.00);
        System.out.println(palioNovo.exibirInfo());
        
    }

}
