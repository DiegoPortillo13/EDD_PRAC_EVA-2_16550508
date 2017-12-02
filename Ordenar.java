
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Familia
 */
public class Ordenar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LinkedList<persona> ListPer = new LinkedList();
        ListPer.add(new persona("Haziel", "Hernandez", 19, 0, true));
        ListPer.add(new persona("Diego", "Portillo", 19, 0, true));
        ListPer.add(new persona("Alonso", "Hernando", 45, 190029, true));
        ListPer.add(new persona("Carlos", "Potrillo", 27, 10000, true));
        ListPer.add(new persona("Panfilo", "Floripundio", 35, 2000, true));
        for (persona obj : ListPer) {
            System.out.println("Nombre: " + obj.getName() + "\n"
                    + "Apellido: " + obj.getLName() + "\n"
                    + "Edad: " + obj.getAge() + "\n"
                    + "Salario: " + obj.getSalary() + "\n"
                    + "Sexo: " + obj.getSex() + "\n");
        }
        System.out.println("------------------------------------");
        Comparator OrdenPerE = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                persona p1, p2;
                p1 = (persona) o1;
                p2 = (persona) o2;
                int E1, E2;
                E1 = p1.getAge();
                E2 = p2.getAge();
                return E1 - E2;
            }
        };
        Collections.sort(ListPer, OrdenPerE);
        for (persona obj : ListPer) {
            System.out.println("Nombre: " + obj.getName() + "\n"
                    + "Apellido: " + obj.getLName() + "\n"
                    + "Edad: " + obj.getAge() + "\n"
                    + "Salario: " + obj.getSalary() + "\n"
                    + "Sexo: " + obj.getSex() + "\n");
        }
        System.out.println("------------------------------------");
        Comparator OrdenPerS = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                persona p1, p2;
                p1 = (persona) o1;
                p2 = (persona) o2;
                double S1, S2;
                S1 = p1.getSalary();
                S2 = p2.getSalary();
                return (int) (S1 - S2);
            }
        };
        Collections.sort(ListPer, OrdenPerS);
        for (persona obj : ListPer) {
            System.out.println("Nombre: " + obj.getName() + "\n"
                    + "Apellido: " + obj.getLName() + "\n"
                    + "Edad: " + obj.getAge() + "\n"
                    + "Salario: " + obj.getSalary() + "\n"
                    + "Sexo: " + obj.getSex() + "\n");
        }
        System.out.println("------------------------------------");
        Comparator OrdenPerAE = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                persona p1, p2;
                p1 = (persona) o1;
                p2 = (persona) o2;
                if (p1.getLName().charAt(0) == p2.getLName().charAt(0)) {
                    int E1, E2;
                    E1 = p1.getAge();
                    E2 = p2.getAge();
                    return E1 - E2;
                } else {
                    char c1, c2;
                    c1 = p1.getLName().charAt(0);
                    c2 = p2.getLName().charAt(0);
                    return c1 - c2;
                }
            }
        };
        Collections.sort(ListPer, OrdenPerAE);
        for (persona obj : ListPer) {
            System.out.println("Nombre: " + obj.getName() + "\n"
                    + "Apellido: " + obj.getLName() + "\n"
                    + "Edad: " + obj.getAge() + "\n"
                    + "Salario: " + obj.getSalary() + "\n"
                    + "Sexo: " + obj.getSex() + "\n");
        }
//        System.out.println("------------------------------------"+"\n Apellido completo");
//        Comparator OrdenPerA = new Comparator() {
//            @Override
//            public int compare(Object o1, Object o2) {
//                persona p1, p2;
//                p1 = (persona) o1;
////                p2 = (persona) o2;
//                char c1, c2;
            //c1 = p1.getLName().charAt();
               // c2 = p2.getLName().charAt();
                //return c1 - c2;

           // }
        };
//         Collections.sort(ListPer, OrdenPerA);
//        for (persona obj : ListPer) {
//            System.out.println("Nombre: " + obj.getName() + "\n"
//                    + "Apellido: " + obj.getLName() + "\n"
//                    + "Edad: " + obj.getAge() + "\n"
//                    + "Salario: " + obj.getSalary() + "\n"
//                    + "Sexo: " + obj.getSex() + "\n");
//        }
//    }

}

class persona {

    private String Name;
    private String LName;
    private int Age;
    private double Salary;
    private boolean Sex;

    public persona() {
        Name = " ";
        LName = " ";
        Age = 0;
        Salary = 0;
        Sex = false;
    }

    public persona(String Name2, String LName2, int Age2, double Salary2, boolean Sex2) {
        Name = Name2;
        LName = LName2;
        Age = Age2;
        Salary = Salary2;
        Sex = Sex2;

    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getLName() {
        return LName;
    }

    public void setLName(String LName) {
        this.LName = LName;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double Salary) {
        this.Salary = Salary;
    }

    public boolean getSex() {
        return Sex;
    }

    public void setSex(boolean Sex) {
        this.Sex = Sex;
    }
}
