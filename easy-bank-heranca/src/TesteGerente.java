public class TesteGerente {
    public static void main(String[] args) {

        Autenticavel referencia = new Cliente();

        Gerente bruno = new Gerente();
        bruno.setNome("Bruno Silveira");
        bruno.setCpf("222-777-888-56");
        bruno.setSalario(3000.0);

        System.out.println(bruno.getNome());
        System.out.println(bruno.getSalario());

        boolean autenticou = bruno.autentica(2223);
        System.out.println(autenticou);
        System.out.println(bruno.getBonificacao());
    }
}
