public class TesteConta {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente(1345, 567654);
        contaCorrente.deposita(100.0);

        ContaPoupanca contaPoupanca = new ContaPoupanca(1312, 456327);
        contaPoupanca.deposita(200.0);

        contaCorrente.transfere(20.0,contaCorrente ,contaPoupanca);

        System.out.println("O saldo da conta corrente é " + contaCorrente.getSaldo());
        System.out.println("O saldo da conta poupanca é " + contaPoupanca.getSaldo());
    }
}
