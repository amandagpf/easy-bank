public class TestaReferencial {

    public static void main(String[] args) {

        Gerente g1 = new Gerente();
        g1.setNome("Marcos");
        g1.setSalario(2000.0);

        DevBackend dev = new DevBackend();
        dev.setNome("Carol");
        dev.setSalario(5000.0);
        System.out.println(dev.getBonificacao());

        ControleBonificacao controle = new ControleBonificacao();
        controle.registra(g1);
        controle.registra(dev);

        System.out.println(controle.getSoma());
    }
}
