public class TestaValores {

    public static void main(String[] args) {
        Conta conta = new Conta(1234, 254367);
        System.out.println(conta.getAgencia());

        Conta conta2 = new Conta(1221, 345678);

        System.out.println(Conta.getTotal());
    }
}
