public class TestaConta {

  public static void main(String[] args) {

    //Criação clientes
    Cliente cliente01 = new Cliente();
    cliente01.setCodigo(1);
    cliente01.setNome("Alexandre");

    //Criação dependentes
    Dependente dep01 = new Dependente();
    dep01.setCodigo(1);
    dep01.setNome("Alexandre");
    Dependente dep02 = new Dependente();
    dep02.setCodigo(2);
    dep02.setNome("Gustavo");

    Dependente[] dependentes = new Dependente[2];
    dependentes[0] = dep01;
    dependentes[1] = dep02;

    //Criação conta
    Conta conta01 = new Conta();
    conta01.setNumeroCont("12345678");
    conta01.setTitular(cliente01);

  }
}
