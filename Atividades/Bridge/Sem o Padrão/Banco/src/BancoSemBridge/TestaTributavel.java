package BancoSemBridge;

/**
 *
 * @author jarde
 */
public class TestaTributavel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente();
        cc.deposita(100);
        System.out.println(cc.calculaTributos());
        
        //Teste do polimorfismo
        Tributavel t = cc;
        System.out.println(t.calculaTributos());
    }
    
}
