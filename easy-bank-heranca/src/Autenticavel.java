//contrato autenticalvel
//quem assina esse contrato precids implementar o método setSenha e autentica

public abstract interface Autenticavel{

    public abstract void setSenha(int senha);
    public abstract boolean autentica(int senha);
}
