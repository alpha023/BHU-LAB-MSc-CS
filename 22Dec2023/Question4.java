public class Question4 {
    public static void main(String[] args) {
        Student.setCollege("BHU");
        Student s1 = new Student("Harry");
        Student s2 = new Student("Joseph");
        Student s3 = new Student("Michael");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        Student.setCollege("DU");

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

    }
}

class Student {
    static int regSt;
    static String college;
    String name;
    int id;

    Student(String name) {
        this.name = name;
        this.setId();

    }

    public void setId() {

        regSt++;
        this.id = regSt;

    }

    public static void setCollege(String name) {
        Student.college = name;

    }

    public String toString() {
        return "Name : " + this.name + "\nID : " + this.id + "\nCollege : " + Student.college;
    }

}
