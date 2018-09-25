package BancoComBridge;

/**
 *
 * @author jarde
 */
public class ContaPoupanca extends ContaImplementada {

    public ContaPoupanca(ContaBridge conta) {
        super(conta);
    }
    ///* Descomentar para ver o erro que é causado
    @Override
    public double atualiza(double taxa){
        this.saldo = this.saldo * taxa * 3;
        return this.saldo;
    }
    //*/
}
