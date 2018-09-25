package BancoComBridge;

/**
 *
 * @author jarde
 */
public class GerenciadorDeImpostoDeRenda implements ContaBridge {
    private double total;
    
    void adiciona(Tributavel t) {
        System.out.println("Adicionando tributavel: " + t);
        this.total += t.calculaTributos();
    }

    @Override
    public void tributos() {
        System.out.println(total);
    }

    @Override
    public void impostoDeRenda() {
        SeguroDeVida seguro = new SeguroDeVida();
        System.out.printf("%.2f %n", (seguro.calculaTributos() + total * 0.10)); 
    }
}
