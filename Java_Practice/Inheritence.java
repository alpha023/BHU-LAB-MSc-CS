package Java_Practice;







public class Inheritence {
    public static void main(String[] args) {
        // System.out.println('hello');
        // Car c1=new Car("ALTO");
        //c1.carInfo();
        ElectricCar c1=new ElectricCar(5);
    }

}

class Vehicle{
    String color;
    int wheels;
    static{
      System.out.println("This Is A Static Block-1-inside Vehicle");
    }
    Vehicle(String color,int wheels){
        this.color=color;
        this.wheels=wheels;
    }
    Vehicle(){
        this.color="NoColor";
        this.wheels=-1;
    }
    static{
      System.out.println("This Is A Static Block-2-inside Vehicle");
    }
    {
      System.out.println("This is A Non-Static Bolock-1 inside Vehicle");
      }
    public void vehicleInfo(){
        System.out.println("Color : "+this.color);
        System.out.println("Wheels : "+this.wheels);
    }
    {
      System.out.println("This Is A Non-Static Block-2-inside Vehicle");
    }
}

class Car extends Vehicle{
  static{
      System.out.println("This Is A Static Block-1-inside Car");
    }
    String model;
    static{
      System.out.println("This Is A Static Block-2-inside Car");
    }
    Car(String model){
        super("red",4);
        this.model=model;
    }
    Car(){
        this.model="NULL";
    }
    static{
      System.out.println("This Is A Static Block-3-inside Car");
    }
    
    {
      System.out.println("This Is A Non-Static-1 Block-inside Car");
    }
    public void carInfo(){
        System.out.println("Model : "+this.model);
        super.vehicleInfo();
        // System.out.println("Wheels : "+this.wheels);

    }
    {
      System.out.println("This is A Non-Static Bolock-2 inside Car");
      }
    
    static{
      System.out.println("This Is A Static Block-inside Car");
    }
}

class ElectricCar extends Car{
    int life;
    static{
      System.out.println("This Is A Static Block-1-inside ElectricCar");
    }
    ElectricCar(int life){
        this.life=life;

    }static{
      System.out.println("This Is A Static Block-2-inside ElectricCar");
    }
    {
      System.out.println("This Is A Non-Static Block-inside Car");
    }
}