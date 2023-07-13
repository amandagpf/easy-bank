public class CriaConta {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 200;
        System.out.println(primeiraConta.saldo);

        primeiraConta.saldo += 100;
        System.out.println(primeiraConta.saldo);

        Conta segundaConta = primeiraConta;
        System.out.println(segundaConta.saldo);

        //primeiraConta e segundaConta são "setas", referências ao mesmo objeto.
        //Não são objetos, são referências apontando a um objeto.

        segundaConta.saldo += 100;
        System.out.println("saldo da segunda conta é " + segundaConta.saldo);
        System.out.println("saldo da primeira é " + primeiraConta.saldo);

        Conta terceiraConta = new Conta();
        terceiraConta.saldo = 400;
        System.out.println("o saldo da terceira é " + terceiraConta.saldo);

        if(primeiraConta == segundaConta){
            System.out.println("a primeira conta e a segunda conta são a mesma");
        } else{
            System.out.println("a primeira e a segunda conta são contas diferentes");
        }

        if((primeiraConta == terceiraConta)||(segundaConta == terceiraConta)){
            System.out.println("a primeira conta ou a segunda conta são a mesma que a terceira conta");
        } else{
            System.out.println("são contas diferentes");
        }
    }
}
