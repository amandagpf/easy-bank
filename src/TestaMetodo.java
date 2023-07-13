public class TestaMetodo {
    public static void main(String[] args) {
        Conta contaDaAmanda = new Conta();
        contaDaAmanda.saldo = 1000;
        contaDaAmanda.deposita(2000);
        System.out.println(contaDaAmanda.saldo);

        boolean conseguiuRetirar = contaDaAmanda.saca(350);
        System.out.println(contaDaAmanda.saldo);
        System.out.println(conseguiuRetirar);

        Conta contaDoBruno = new Conta();
        contaDoBruno.deposita(2000);

        boolean sucessoTransferencia =
                contaDoBruno.transfere(1500, contaDoBruno, contaDaAmanda);
        if (sucessoTransferencia){
            System.out.println("transferencia realizada com sucesso!");
        }else{
            System.out.println("faltou grana");
        }
        System.out.println(contaDaAmanda.saldo);
        System.out.println(contaDoBruno.saldo);

    }
}
