public class TesteFuncionario {
    public static void main(String[] args){

        Funcionario amanda = new DevBackend();
        amanda.setNome("Amanda Fernandes");
        amanda.setCpf("222-333-555-87");
        amanda.setSalario(4350.90);

        System.out.println(amanda.getNome());
        System.out.println(amanda.getSalario());
        System.out.println(amanda.getBonificacao());
    }
}
