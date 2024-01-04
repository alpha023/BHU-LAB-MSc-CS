public class Question1 {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.setEngineNo(123);
        c1.setModel("TourS");
    }
}

class Car {
    private int engNo;
    private String model;

    Car(String model, int engNo) {

        this.engNo = engNo;
        this.model = model;

    }

    Car() {

    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setEngineNo(int engNo) {
        this.engNo = engNo;
    }
}