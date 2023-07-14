public class Conta{
    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int total;
    //static significa que é da classe Conta, não o objeto.
    public Conta(int agencia, int numero){
        Conta.total++;
        this.agencia = agencia;
        this.numero = numero;
        //rotina de inicialização, construtor
    }

    public void deposita(double valor){
        this.saldo += valor;
    }

    public boolean saca(double valor){
        if(this.saldo >= valor){
            this.saldo -= valor;
            return true;
        }else{
            return false;
        }
    }

    public boolean transfere(double valor,Conta remetente, Conta destino){
        if(this.saldo >= valor){
            remetente.saca(valor);
            destino.deposita(valor);
            return true;
        }
        return false;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public int getNumero(){
        return this.numero;
    }

    public void setNumero(int novoNumero) {
        this.numero = novoNumero;

        //uma das vantagens de utilizar o encapsulamento, é que podemos fazer várias validações dentro do método,
        //sem se preocupar com o que está de fora.
    }

    public int getAgencia() {
        return this.agencia;
    }

    public void setAgencia(int agencia) {
        if(agencia <= 0){
            System.out.println("Não pode valor menor ou igual a 0");
            return;
        }
        this.agencia = agencia;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public static int getTotal(){
        return Conta.total;
        //dentro de um contexto static não existe this
    }
}