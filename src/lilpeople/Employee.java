package lilpeople;

public class Employee {

    String name;
    int age;
    double salary;

    public void printData() {
        System.out.println("Los datos son: ");
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.salary);
    }
}
