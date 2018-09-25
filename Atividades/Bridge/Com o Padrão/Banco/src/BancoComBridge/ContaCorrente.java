package BancoComBridge;


public class ContaCorrente extends ContaImplementada implements Tributavel{

    public ContaCorrente(ContaBridge conta) {
        super(conta);
    }
    @Override
    public double atualiza(double taxa){
        this.saldo = this.saldo * taxa * 2;
        return this.saldo;
    }
    
    @Override
    public void deposita(double valor){
        this.saldo += valor - 0.10;
    }

    @Override
    public double calculaTributos() {
        return this.getSaldo() * 0.01;
    }
}
