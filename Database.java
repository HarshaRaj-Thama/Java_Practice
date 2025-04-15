import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Database {
    public static void main(String[] args) {
        List<Employee> list = Arrays.asList(
                new Employee("Ananya", 1000L,"Java"),
                new Employee("Abhi", 2000L,"Python"),
                new Employee("Rana", 1000L, "Java"),
                new Employee("Kevin", 3000L, ".Net"),
                new Employee("Raj", 5000L, ".Net"),
                new Employee("Ashay", 4000L, "Python"),
                new Employee("Vin", 2000L, "Java"),
                new Employee("Carl", 1000L, "Python")
        );

        Map<String,Double> deptavgsalary = list.stream().filter(n->n.name.startsWith("A")|| n.name.startsWith("R"))
                .collect(Collectors.groupingBy(n ->n.dept, Collectors.averagingLong(e ->e.salary)));

              deptavgsalary.forEach((dept, avg) ->
                        System.out.println(dept+ " -> " + avg));
    }
}

class Employee {
    String name,dept;
    Long salary;

    public Employee(String name, Long salary, String dept) {
        this.name = name;
        this.salary = salary;
        this.dept = dept;
    }
}
