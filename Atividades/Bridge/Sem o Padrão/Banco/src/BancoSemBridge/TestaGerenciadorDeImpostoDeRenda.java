package BancoSemBridge;

/**
 *
 * @author jarde
 */
public class TestaGerenciadorDeImpostoDeRenda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GerenciadorDeImpostoDeRenda gerenciador = 
                new GerenciadorDeImpostoDeRenda();
        SeguroDeVida sv = new SeguroDeVida();
        gerenciador.adiciona(sv);
        
        ContaCorrente cc = new ContaCorrente();
        cc.deposita(1000);
        gerenciador.adiciona(cc);
        
        System.out.println(gerenciador.getTotal());
    }
    
}
