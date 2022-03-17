package lilpeople;


public class Student extends Person{
    private String Program;
    private Integer year;
    private double fee;

    public Student(String Program, Integer year, double fee, String name, String address) {
        super(name, address);
        this.Program = Program;
        this.year = year;
        this.fee = fee;
    }

    public String getProgram() {
        return Program;
    }

    public void setProgram(String Program) {
        this.Program = Program;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

   @Override
    public String toString(){
     StringBuilder s = new StringBuilder();
       s.append(super.toString()).
               append("El programa es: " + this.Program + "\n").
               append("El anio es: " + this.year + "\n").
               append("El fee es: " + this.fee + "\n");
     return s.toString();
    }
}
