public class DevBackend extends Funcionario {

    public double getBonificacao(){
        return super.getBonificacao() + super.getSalario() + 100.0;
    }
}
