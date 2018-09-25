/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BancoComBridge;

/**
 *
 * @author jarde
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ContaBridge gerenciadorDeContas = new GerenciadorDeImpostoDeRenda();
        ContaImplementada conta = new ContaCorrente(gerenciadorDeContas);
        conta.deposita(5000);
        conta.atualiza(50);
        conta.saca(1000);
        gerenciadorDeContas.impostoDeRenda();
        System.out.printf("%.2f %n", conta.getSaldo());
        conta = new ContaPoupanca(gerenciadorDeContas);
        conta.deposita(15);
        System.out.printf("%.2f %n", conta.getSaldo());
    }
    
}
