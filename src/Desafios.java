public class Desafios {
    public static void main(String[] args) {
        int a = 3;
        int b = 2;
        int c = 8;
        int d = 7;
        int x = 0; // valor inicial

        if (a > 3 && b > 5) {
            x = 10;
        }
        else if (a >= 2 || c <= 1) {
            x = (a + d) /2;
        }
        else if (a == 2 || b < 7) {
            x = (a + d) /2;
        }

        System.out.println("O valor de x é: " + x);
    }
}
