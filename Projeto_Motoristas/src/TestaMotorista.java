public class TestaMotorista {

  public static void main(String[] args) {
    Motorista motorista01 = new Motorista();
    motorista01.setNome("Marcelo");
    motorista01.setCnh("0501040203");

    Motorista motorista02 = new Motorista();
    motorista02.setNome("Gustavo");
    motorista02.setCnh("12345789");

    Motorista motorista03 = new Motorista();
    motorista03.setNome("Luiza");
    motorista03.setCnh("0102030405");

    Carro carro01 = new Carro();
    carro01.setCor("Prata");
    carro01.setModelo("Gt-r");
    carro01.setMarca("Nissan");

    Carro carro02 = new Carro();
    carro02.setCor("Verde");
    carro02.setModelo("Hilux");
    carro02.setMarca("Toyota");

    Carro carro03 = new Carro();
    carro03.setCor("Azul");
    carro03.setModelo("Astra");
    carro03.setMarca("Chevrolet");

    System.out.println(carro01);
  }
}
