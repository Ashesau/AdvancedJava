/**
 *  Дана коллекция класс Students (с полями name — имя, age — возраст, sex — пол),
вида List.of( new Students(«Вася», 16, Sex.MAN), new Students(«Петя», 23, Sex.MAN),
new Students(«Елена», 42, Sex.WOMEN), new Students(«Иван Иванович», 69, Sex.MAN)).
a. Выбрать кому придет повестка (от 18 до 27 лет)
b. Найти кол-во потенциальных работяг (т.е. от 18 лет и учитывая, что женщины
выходят в 55 лет, а мужчина в 60) */

package StreamTasks;

import lombok.*;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
//import java.util.stream.Collectors;

public class PeopleStudents {
    private static void testFilter() {

        Collection<Students> students = Arrays.asList (
                new Students("Вася", 16, Sex.MAN),
                new Students("Петя", 23, Sex.MAN),
                new Students("Елена", 42, Sex.WOMEN),
                new Students("Иван Иванович", 69, Sex.MAN)
        );

        List<Students> militaryService = students.stream().filter((p)-> p.getAge() >= 18 && p.getAge() < 27
                && p.getSex() == Sex.MAN).toList();
        System.out.println("Повестка придет: " + militaryService);

        List<Students> peopleHowCanWork = students.stream().filter((p) -> p.getAge() >= 18).filter(
                (p) -> (p.getSex() == Sex.WOMEN && p.getAge() < 55) ||
                (p.getSex() == Sex.MAN && p.getAge() < 60)).toList();
        System.out.println("Количество потенциальных работяг: " + peopleHowCanWork);
    }

    private enum Sex {
        MAN,
        WOMEN
    }

    @Value
    private static class Students {

        private final String name;
        private final Integer age;
        private final Sex sex;

//        public Students (String name, Integer age, Sex sex) {
//
//            this.name = name;
//            this.age = age;
//            this.sex = sex;
//        }
//
//        public String getName() {
//            return name;
//        }
//
//        public Integer getAge() {
//            return age;
//        }
//
//        public Sex getSex() {
//            return sex;
//        }
//
//        @Override
//        public String toString() {
//            return
//                    "Имя:'" + name + '\'' +
//                    ", Возраст: " + age +
//                    ", Пол: " + sex;
//        }
    }

    public static void main(String[] args) throws Exception {
        testFilter();
    }
}