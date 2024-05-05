    import java.util.Scanner;

    public class PopulacaoCidade {
        public static void main(String[] args) {
            //Define os Scanners e as variaveis que vão receber o input
            Scanner entradaCidade = new Scanner(System.in);
            Scanner entradaPopulacao = new Scanner(System.in);

            String NomeCidade;

            System.out.print("Insira o nome da cidade: ");
            NomeCidade = entradaCidade.next();

            float Populacao;

            System.out.print("Insira a População: ");
            Populacao = entradaPopulacao.nextInt();

            //Loop while que analisa nome da cidade e população, diz seu tamanho e quando a população for igual a 0 finaliza o programa
            while (!(Populacao == 0)) {
            if (Populacao <= 10000) {
                System.out.println(String.format("A cidade é uma cidade pequena", NomeCidade));
            }
            else if (Populacao > 10000 && Populacao < 100000) {
                System.out.println(String.format("A cidade é uma cidade média", NomeCidade));

            }
            else if (Populacao >= 100000) {
                System.out.println(String.format("A cidade é uma cidade grande", NomeCidade ));

            }
            else {
                System.out.println("Argumento invalido!");
            }

            System.out.print("Insira o nome da cidade: ");
            NomeCidade = entradaCidade.next();

            System.out.print("Insira a População: ");
            Populacao = entradaPopulacao.nextInt();
            }
        }
    }
