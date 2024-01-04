public class Question3 {
    public static void main(String[] args) {

        Shape r1 = new Shape(8, 9);
        Shape r2 = r1.ScaleDim(2);
        System.out.println(r1);
        System.out.println(r2);

    }
}

class Shape {
    int l, b;

    Shape(int l, int b) {

        this.l = l;
        this.b = b;

    }

    public Shape ScaleDim(int factor) {
        return new Shape(factor * l, factor * b);
    }

    public String toString() {
        String str = "Length = " + this.l + "\n" + "Breadth = " + this.b + "\n";
        return str;
    }
}