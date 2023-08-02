public class SistemaInterno {

    public int senha = 1313;

    public void autentica(Autenticavel autenticavel){
        boolean autenticou = autenticavel.autentica(this.senha);
        if(autenticou){
            System.out.println("Pode acessar o sistema!");
        }else {
            System.out.println("Não está autorizado a acessar o sistema!");
        }
    }
}
