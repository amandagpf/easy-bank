public class TesteSistema {

    public static void main(String[] args) {
        Gerente gerente = new Gerente();
        gerente.setSenha(1313);

        Administrador adm = new Administrador();
        adm.setSenha(8989);

        SistemaInterno sistemaInterno = new SistemaInterno();
        sistemaInterno.autentica(gerente);
        sistemaInterno.autentica(adm);
    }
}
