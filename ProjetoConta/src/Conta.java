public class Conta {
  private String numeroCont;
  private Cliente titular;
  private Dependente[] dependente;

  public Dependente[] getDependente() {
    return dependente;
  }

  public void setDependente(Dependente[] dependente) {
    this.dependente = dependente;
  }

  public String getNumeroCont() {
    return numeroCont;
  }

  public void setNumeroCont(String numeroCont) {
    this.numeroCont = numeroCont;
  }

  public Cliente getTitular() {
    return titular;
  }

  public void setTitular(Cliente titular) {
    this.titular = titular;
  }
}
