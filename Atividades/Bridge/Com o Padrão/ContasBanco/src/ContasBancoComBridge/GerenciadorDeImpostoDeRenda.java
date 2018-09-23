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

package ContasBancoComBridge;

/**
 *
 * @author jarde
 */
public class GerenciadorDeImpostoDeRenda {
    private double total;
    
    void adiciona(Tributavel t) {
        System.out.println("Adicionando tributavel: " + t);
        this.total += t.calculaTributos();
    }
    
    public double getTotal() {
        return this.total;
    }
}
