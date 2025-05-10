import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class comparableInterface {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(1, "A", 21));
        list.add(new Student(2, "B", 23));
        list.add(new Student(3, "A", 22));
        System.out.println("list1: ");
        list.forEach(System.out::println);
        Collections.sort(list);
        System.out.println("list2: ");
        list.forEach(System.out::println);
    }
}

class Student implements Comparable<Student> {
    int id;
    String name;
    int age;

    Student(int id, String name, int age) {
        this.age = age;
        this.id = id;
        this.name = name;
    }

    /*  @Override
      public int compareTo(Student o) {
          return Integer.compare(this.age, o.age);
      }*/

    @Override
    public int compareTo(Student o) {
        return Integer.compare(o.age, this.age);
    }

    @Override
    public String toString() {
        return "Student{id=" + id + ", name='" + name + "', age=" + age + "}";
    }
}
