package lilpeople;


public class Person {
private String name;
private String address;

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

   @Override
   public String toString(){//sobrecarga
      StringBuilder s = new StringBuilder();     
       s.append("El nombre de la persona es: " + this.name + "\n");
       s.append("La direccion de la persona es: " + this.address + "\n");
      /* el system.out.println debería ir aqui pero si se toma en cuenta que el diagrama no 
      toma toda la funcionalidad del sistema, en este caso el main, procedi de esta manera.
      tipo el sout que tiene mi compadre luisfer :v */
      return s.toString();
   }
}
