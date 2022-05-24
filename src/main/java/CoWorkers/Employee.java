package CoWorkers;

import lombok.Getter;
@Getter

public class Employee implements Comparable<Employee> {
    private String name;
    private int salary;
    private int age;
    private int experience;

    public Employee(String name, int salary, int age, int experience) {
        this.name = name;
        this.salary = salary;
        this.age = age;
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Работник: "
                +
                "name - '" + name + '\''
                +
                ", salary - " + salary
                +
                ", age - " + age
                +
                ", experience - " + experience;
    }

    @Override
    public int compareTo(Employee e) {
        return this.name.compareTo(e.getName());
    }
}