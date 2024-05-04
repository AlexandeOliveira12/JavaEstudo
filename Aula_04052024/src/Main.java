import javax.print.DocFlavor;

public class Main {
    public static void main(String[] args) {


        int a;
        int b;
        int c;

        a = 0;
        b = 0;
        c = a + b;

        if (a == b) {
            System.out.println("a é igual a b");
            System.out.println(c);
        }
        else {
            System.out.println ("a é diferente de b");
            System.out.println(c);
        }


        String nome1 = "Alexandre";
        String nome2 = "Alexandre";

        if (nome1.equals(nome2)) {
            System.out.println("nome1 igual a nome2");
        }
        else {
            System.out.println("nome1 é diferente de nome2");
        }
    }
}
