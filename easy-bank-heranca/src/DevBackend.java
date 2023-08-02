public class DevBackend extends Funcionario {

    @Override
    public double getBonificacao(){
        return super.getSalario() + 100.0;
    }
}
