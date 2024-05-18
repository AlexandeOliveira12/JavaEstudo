import java.util.ArrayList;
import java.util.List;

public class Carro {
  private String Cor;
  private String Modelo;
  private String Marca;
  private List<Motorista> motoristas = new ArrayList<>();

  public String getCor() {
    return Cor;
  }

  public void setCor(String cor) {
    this.Cor = cor;
  }

  public String getModelo() {
    return Modelo;
  }

  public void setModelo(String modelo) {
    this.Modelo = modelo;
  }

  public String getMarca() {
    return Marca;
  }

  public void setMarca(String marca) {
    this.Marca = marca;
  }

  public List<Motorista> getMotorista() {
    return motoristas; // Retorna a lista de motoristas
  }

  public void setMotorista(Motorista motorista) {
    this.motoristas.add(motorista);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("Carro: " + Modelo + "\n");
    sb.append("Marca: " + Marca + "\n");
    sb.append("Motoristas:\n");

    for (Motorista motorista: motoristas) {
      sb.append("- " + motorista.getNome() + "\n");
    }

    return sb.toString();
  }
}
