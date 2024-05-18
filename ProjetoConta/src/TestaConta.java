public class TestaConta {

  public static void main(String[] args) {
    Cliente cliente01 = new Cliente();
    cliente01.setCodigo(1);
    cliente01.setNome("Alexandre");

    Conta conta01 = new Conta();
    conta01.setNumeroCont("12345678");
    conta01.setTitular(cliente01);
  }
}
