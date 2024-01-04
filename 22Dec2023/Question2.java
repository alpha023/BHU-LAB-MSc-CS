public class Question2 {
    public static void main(String[] args) {
        ConstructorChain c = new ConstructorChain();

    }
}

class ConstructorChain {
    ConstructorChain() {
        this(1, 9);
        System.out.println("constructor with zero arg called...");

    }

    ConstructorChain(int x) {
        System.out.println("constructor with one-integer arg called... x = " + x);

    }

    ConstructorChain(int x, int y) {
        this(x);
        System.out.println("constructor with two-integer called..." + x + " , " + y + " ");
    }
}