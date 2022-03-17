package lilpeople;

public class databasePro extends Employee {

    String databaseTool;

    public void printData() {
        super.printData();
        System.out.println(this.databaseTool);
    }
}
