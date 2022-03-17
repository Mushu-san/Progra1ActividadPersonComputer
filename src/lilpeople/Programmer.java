package lilpeople;


public class Programmer extends Employee{
    String language;

    public void printData(){
    super.printData();
    System.out.println(this.language);
    } 
}
