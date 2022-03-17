package lilpeople;

public class Laptop extends Computer{

    private String batteryLife;

    public Laptop(String so, String ram, String cpu, String batteryLife) {
        super(so, ram, cpu);
        this.batteryLife = batteryLife;
    }

    public void setBatteryLife(String batteryLife) {
        this.batteryLife = batteryLife;
    }
    
    public void startSystem(){
    super.startSystem();
    System.out.println("Nivel de bateria: " + this.batteryLife);
    }


}
