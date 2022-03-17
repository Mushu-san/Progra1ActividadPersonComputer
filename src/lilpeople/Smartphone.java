package lilpeople;


public class Smartphone extends Computer{
    private String telephoneOperator;

    public Smartphone(String phoneOperator, String so, String ram, String cpu) {
        super(so, ram, cpu);
        this.telephoneOperator = phoneOperator;
    }
 
    public void startSystem(){
    super.startSystem();
    System.out.println("Operador telefonico : " + this.telephoneOperator);
    } 
}
