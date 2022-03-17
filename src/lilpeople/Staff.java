package lilpeople;

public class Staff extends Person {

    private String school;
    private double pay;

    public Staff(String school, double pay, String name, String address) {
        super(name, address);
        this.school = school;
        this.pay = pay;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append(super.toString()).
                append("La escuela es: " + this.school + "\n").
                append("El pago es: " + this.pay + "\n");
        return s.toString();
    }

}
