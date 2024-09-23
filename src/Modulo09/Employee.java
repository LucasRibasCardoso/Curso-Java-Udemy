package Modulo09;

public class Employee implements Comparable<Employee> {
    private String name;
    private Double salary;

    public Employee(String name, Double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }


    @Override
    public int compareTo(Employee otherEmployee) {
        return name.compareTo(otherEmployee.getName());
    }

    @Override
    public String toString() {
        return name + ", " + String.format("%.2f", salary);
    }
}
