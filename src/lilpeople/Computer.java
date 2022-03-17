package lilpeople;

public class Computer {

    private String so;
    private String ram;
    private String cpu;

    public Computer(String so, String ram, String cpu) {
        this.so = so;
        this.ram = ram;
        this.cpu = cpu;
    }

    public void setSo(String so) {
        this.so = so;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public void startSystem(){
        System.out.println("El sistema se esta iniciando bip bip bip");
        System.out.println("Sistema Operativo: " + this.so);
        System.out.println("Ram: " + this.ram);
        System.out.println("Procesador: " + this.cpu);
    }
}
