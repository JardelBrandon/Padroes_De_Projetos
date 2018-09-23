/*
2) (Opcional) Às vezes, é interessante criarmos uma interface que herda de outras interfaces: essas, são
chamadas subinterfaces. Essas, nada mais são do que um agrupamento de obrigações para a classe que a
implementar.
interface ContaTributavel extends Conta, Tributavel {
}
Dessa maneira, quem for implementar essa nova interface precisa implementar todos os métodos herdados
das suas superinterfaces (e talvez ainda novos métodos declarados dentro dela):
class ContaCorrente implements ContaTributavel {
    // métodos
}
Conta c = new ContaCorrente();
Tributavel t = new ContaCorrente();
Repare que o código pode parecer estranho, pois a interface não declara método algum, só herda os
métodos abstratos declarados nas outras interfaces.
Aomesmo tempo queuma interface pode herdar demais deuma outra interface, classes só podem possuir
uma classe mãe (herança simples).
 */
package ContasBancoSemBridge;


public class ContaCorrente implements ContaTributavel{

    private double saldo;
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

    @Override
    public void saca(double valor) {
        this.saldo -= valor;
    }

    @Override
    public double getSaldo() {
       return this.saldo;
    }
}
