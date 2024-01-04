public class Question5 {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle();
        Vehicle v2 = new Vehicle(123);
        Vehicle v3 = new Vehicle(456, "TourS");

        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);

    }
}

class Vehicle {
    int engNo;
    String model;

    Vehicle() {
        this(-1);

    }

    Vehicle(int engNo) {
        this(engNo, "Null");

    }

    Vehicle(int engNo, String model) {
        this.engNo = engNo;
        this.model = model;

    }

    public String toString() {
        return "Engine No. : " + this.engNo + "\nModel : " + this.model;
    }
}