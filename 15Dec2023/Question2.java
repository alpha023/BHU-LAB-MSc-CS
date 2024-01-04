public class Question2 {
    public static void main(String[] args) {

        int num = 145;
        System.out.println("Is Peterson Number " + num + "->" + (isPetersonNumber(num)));

    }

    public static boolean isPetersonNumber(int n) {
        int temp = n, d;
        int p = 0;
        while (temp > 0) {
            d = temp % 10;
            p += factorial(d);

            temp /= 10;

        }
        return p == n ? true : false;

    }

    public static int factorial(int n) {
        if (n == 1)
            return 1;
        return n * factorial(n - 1);
    }
}