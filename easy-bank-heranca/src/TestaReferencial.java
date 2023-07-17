public class TestaReferencial {

    public static void main(String[] args) {

        Gerente g1 = new Gerente();
        g1.setNome("Marcos");
        g1.setSalario(2000.0);

        Funcionario f = new Funcionario();
        f.setNome("Andressa");
        f.setSalario(1500.0);

        DevBackend dev = new DevBackend();
        dev.setNome("Carol");
        dev.setSalario(5000.0);

        ControleBonificacao controle = new ControleBonificacao();
        controle.registra(g1);
        controle.registra(f);
        controle.registra(dev);

        System.out.println(controle.getSoma());
    }
}
