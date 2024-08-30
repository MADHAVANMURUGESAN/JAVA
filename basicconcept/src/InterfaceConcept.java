import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
interface SetUp {
    void display();
}
*/

class Employee {
    int roll_No;
    String name_Emply;

    Employee(int roll_No, String name_Emply) {
        this.roll_No = roll_No;
        this.name_Emply = name_Emply;
    }

    public String toString() {
        return "RollNo: " + this.roll_No + " " + "Name: " + this.name_Emply;
    }
}

class SortByRollNo implements Comparator<Employee> {

    @Override
    public int compare(Employee employee_1, Employee employee_2) {
        return employee_1.roll_No - employee_2.roll_No;
    }
}

class SortByEmployeeName implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.name_Emply.compareTo(o2.name_Emply);
    }
}

public class InterfaceConcept {
    public static void main(String[] args) {
        ArrayList<Employee> arrayList = new ArrayList<>();
        arrayList.add(new Employee(333, "zigbee"));
        arrayList.add(new Employee(111, "madhavan"));
        arrayList.add(new Employee(222, "arun"));
        System.out.println("arrayList: " + arrayList);
        System.out.println("unsorting order...");
        for (int i = 0; i < arrayList.size(); i++)
            System.out.println(arrayList.get(i));

        Collections.sort(arrayList, new SortByRollNo());
        System.out.println("Sorting by rollNo order...");
        for (int i = 0; i < arrayList.size(); i++)
            System.out.println(arrayList.get(i));

        Collections.sort(arrayList, new SortByEmployeeName());
        System.out.println("Sorting by Name order...");
      /*  for (int i=0;i<arrayList.size();i++)
            System.out.println(arrayList.get(i));  */
        for (Employee employee : arrayList) {
            System.out.println(employee.toString());
        }
    }
}
