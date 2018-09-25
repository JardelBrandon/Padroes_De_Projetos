package BancoComBridge;

/**
 *
 * @author jarde
 */
public abstract class ContaImplementada {
    protected ContaBridge conta;
    protected double saldo;

    public ContaImplementada(ContaBridge conta) {
        this.conta = conta;
    }
    
    
    public void deposita(double valor){
        this.saldo += valor;
    }
    
    public void saca(double valor){
        this.saldo -= valor;
    }
    
    public double getSaldo(){
        return this.saldo;
    }
    
    public abstract double atualiza(double taxa);
}
