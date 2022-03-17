package lilpeople;

import java.util.Scanner;

public class LilPeople {

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Ingrese una opcion del menu siguiente uwu");
        System.out.println("Ejercicio 1");
        System.out.println("Ejercicio 2");
        System.out.println("Ejercicio 3");
        int option = x.nextInt();
        switch (option) {
            case 1: {
                Person p = new Person("Miguel", "MC16+HS");
                System.out.println(p.toString());

                Student s = new Student("Luis", 47, 1.5, "Doble free", "Styler");
                System.out.println(s.toString());

                Staff f = new Staff("Guiando Ingenieros G.I.", 1.5, "Anonimo", "JF6M+68 Cdad. de Guatemala");
                System.out.println(f.toString());
            }
            break;

            case 2: {
                Employee e = new Employee();
                e.age = 12;
                e.name = "Empleado1";
                e.salary = 10000.00;

                e.printData();

                Programmer p = new Programmer();
                p.age = 17;
                p.name = "Empleado2";
                p.salary = 15000.00;
                p.language = "java";
                p.printData();

                databasePro d = new databasePro();
                d.age = 19;
                d.name = "Empleado3";
                d.salary = 15000.50;
                d.databaseTool = "MySQL";
                d.printData();
            }
            break;

            case 3: {
                Computer c = new Computer("Mac OS X Yosemite", "16gb", "Apple A8");
                c.startSystem();
                System.out.println("");
                Laptop l = new Laptop("Mac OS X Mountain lion", "16gb", "Apple A8", "99%");
                l.startSystem();
                System.out.println("");
                Smartphone s = new Smartphone("tigo", "Android 4.4", "4gb", "mediatek dimensity 1200");
                s.startSystem();
            }
            break;
        }
    }
}
