public class TestaGetESet {

    public static void main(String[] args) {
        Conta conta = new Conta(1337,2425678);
        conta.setNumero(1337);
        System.out.println(conta.getNumero());

        Cliente amanda = new Cliente();
        amanda.setNome("Amanda Fernandes");
        conta.setTitular(amanda);

        System.out.println(conta.getTitular().getNome());

        conta.getTitular().setProfissao("Programadora");
        System.out.println(conta.getTitular().getProfissao());
    }
}
