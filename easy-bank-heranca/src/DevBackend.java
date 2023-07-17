public class DevBackend extends Funcionario {

    public double getBonificacao(){
        return super.getSalario() + 100.0;
    }
}
