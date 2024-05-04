//importa a lib do input
import java.util.Scanner;

//Define uma classe Principal (o mesmo nome do arquivo criado)
public class ParOuImpar {
    public static void main(String[] args) {

        //chama a lib
        Scanner entrada = new Scanner(System.in);

        //define a variavel do input
        int a;

        //chama o input
        System.out.print("Entre com um valor: ");
        a = entrada.nextInt();

        //loop para verificar se numero é par ou impar e se for == a 0 encerra o loop
        while (!(a == 0)) {
                if (a%2 == 0) {
                    System.out.println("É par");
                }
                else {
                    System.out.println("É impar");
                }

                System.out.print("Entre com outro valor:");
                a = entrada.nextInt();
        }
    }
}
