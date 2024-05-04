public class Principal {
    public static void main(String[] args) {

        int a = 10;
        int res = a % 2;

        if (res == 0) {
            System.out.println(res);
            System.out.println("True, numero par");
        }
        else {
            System.out.println(res);
            System.out.println("False, numero impar");
        }
    }
}
