/**Создать 3 различных сотрудника и сделать компараторы на сравнение по зарплате,
 возрасту и сроку службы:
 a.Используя метод forEach и лямбда функции, вывести получившихся сотрудников в консоль
 b.Вывести всех сотрудников у которых зарплата выше 100 000 тыс
 c.Вывести сотрудника у которого максимальная зарплата
 d.Сгруппировать по имени сотрудников
 e.Вывести сумму зарплат, всех сотрудников
 f.Вывести среднюю зарплату сотрудников
 */
package CoWorkers;

import java.util.*;

public class Test {
        public static void main(String[] args) {
            List<Employee> employees = new ArrayList<>();
            Employee one = new Employee("Паша", 100000, 36, 11);
            Employee two = new Employee("Даша", 50000, 29, 7);
            Employee three = new Employee("Никита", 150000, 43, 21);

            employees.add(one);
            employees.add(two);
            employees.add(three);

            employees.forEach((s) -> System.out.println(s));

            System.out.println("\n" + "Сортировка сотрудников по имени:");
            Collections.sort(employees);
            employees.forEach((s) -> System.out.println(s));

            System.out.println("\n" + "Сортировка сотрудников по возрасту:");
            Collections.sort(employees, new AgeComparator());
            employees.forEach((s) -> System.out.println(s));

            System.out.println("\n" + "Сортировка сотрудников по опыту:");
            Collections.sort(employees, new ExpComparator());
            employees.forEach((s) -> System.out.println(s));

            System.out.println("\n" + "Сотрудник, с зарплатой свыше 100 000 тугриков:");
            List<Employee> zp = employees
                    .stream()
                    .filter((p) -> p.getSalary() > 100000)
                    .toList();
            zp.forEach(System.out::println);

            System.out.println("\n" + "Средняя заработная плата:");
            double averageSalary = employees.stream()
                    .mapToInt(Employee::getSalary)
                    .average()
                    .getAsDouble();
            System.out.println(averageSalary);

            System.out.println("\n" + "Общая сумма зарплат всех сотрудников:");
            int sumSal = employees.stream()
                    .mapToInt(Employee::getSalary)
                    .sum();
            System.out.println(sumSal);

            System.out.println("\n" + "Сотрудники с максимальной зарплатой:");
            List<Employee> maxSal = employees
                    .stream()
                    .max(Comparator.comparingInt(Employee::getSalary))
                    .stream().toList();
            System.out.println(maxSal);
        }
}