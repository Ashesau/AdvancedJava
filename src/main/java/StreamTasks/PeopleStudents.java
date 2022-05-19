package StreamTasks;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class PeopleStudents {

    private static void testFilter() {

        Collection<Students> students = List.of (
                new Students("Вася", 16, Sex.MAN),
                new Students("Петя", 23, Sex.MAN),
                new Students("Елена", 42, Sex.WOMEN),
                new Students("Иван Иванович", 69, Sex.MAN)
        );

        // Выбрать кому придет повестка (от 18 до 27 лет)
        List<Students> militaryService = students.stream().filter((p)-> p.getAge() >= 18 && p.getAge() < 27
                && p.getSex() == Sex.MAN).collect(Collectors.toList());
        System.out.println("Военнообязанные - " + militaryService);

        /* Найти кол-во потенциальных работяг (т.е. от 18 лет и учитывая что женщины
        выходят в 55 лет, а мужчина в 60 */
        List<Students> peopleHowCanWork = students.stream().filter((p) -> p.getAge() >= 18).filter(
                (p) -> (p.getSex() == Sex.WOMEN && p.getAge() < 55) ||
                (p.getSex() == Sex.MAN && p.getAge() < 60)).collect(Collectors.toList());
        System.out.println("Количество работоспособных людей - " + peopleHowCanWork);
    }

    private enum Sex {
        MAN,
        WOMEN
    }

    private static class Students {

        private final String name;
        private final Integer age;
        private final Sex sex;

        public Students (String name, Integer age, Sex sex) {

            this.name = name;
            this.age = age;
            this.sex = sex;
        }

        public String getName() {
            return name;
        }

        public Integer getAge() {
            return age;
        }

        public Sex getSex() {
            return sex;
        }

        @Override
        public String toString() {
            return
                    "Имя:'" + name + '\'' +
                    ", Возраст: " + age +
                    ", Пол: " + sex;
        }
    }

    public static void main(String[] args)  throws Exception {
        testFilter();
    }
}

//убрать первый символ и вернуть массив чисел (int[])
//collection1.stream().mapToInt((s) -> Integer.parseInt(s.substring(1))).toArray() ([1, 2, 3, 1])

//Отсортировать коллекцию строк по алфавиту
//collection.stream().sorted().collect(Collectors.toList()) ([a1, a1, a2, a3, a4, a4])

//Отсортировать коллекцию строк по алфавиту и убрать дубликаты
//collection.stream().sorted().distinct().collect(Collectors.toList()) ([a4, a3, a2, a1])

//Добавить "_1" к каждому элементу
//collection1.stream().map((s) -> s + "_1").collect(Collectors.toList()) ([a1_1, a2_1, a3_1, a1_1])


//        Collection<String> collection = List.of("a1", "a4", "a3", "a2", "a1", "a4");
//        // Вернуть количество вхождений объекта
//        long count = collection.stream().filter("a1"::equals).count();
//        System.out.println("Результат: " + count);
//
//        // Выбрать все элементы по шаблону
//        List<String> select = collection.stream().filter((s) -> s.contains("1")).collect(Collectors.toList());
//        System.out.println("Выбрать элементы: " + select);