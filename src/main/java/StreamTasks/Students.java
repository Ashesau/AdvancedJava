package StreamTasks;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Students {

    private static void testFilterAndCount() {
        System.out.println();
        System.out.println("Фильтр");
        Collection<String> collection = Arrays.asList("a1", "a2", "a3", "a1");
        Collection<People> peoples = Arrays.asList(
                new People("Вася", 16, Sex.MAN),
                new People("Петя", 23, Sex.MAN),
                new People("Елена", 42, Sex.WOMEN),
                new People("Иван Иванович", 69, Sex.MAN));

        long count = collection.stream().filter("a1"::equals).count();
        System.out.println("Итог = " + count);

        List<String> select = collection.stream().filter((s) -> s.contains("1")).collect(Collectors.toList());
        System.out.println("Выбрать элементы = " + select);

        List<People> militaryService = peoples.stream().filter((p)-> p.getAge() >= 18 && p.getAge() < 27
                && p.getSex() == Sex.MAN).collect(Collectors.toList());
        System.out.println("Военнообязанные = " + militaryService);

        double manAverageAge = peoples.stream().filter((p) -> p.getSex() == Sex.MAN).
                mapToInt(People::getAge).average().getAsDouble();
        System.out.println("Средний возраст мужчин = " + manAverageAge);

        long peopleHowCanWork = peoples.stream().filter((p) -> p.getAge() >= 18).filter(
                (p) -> (p.getSex() == Sex.WOMEN && p.getAge() < 55) || (p.getSex() == Sex.MAN && p.getAge() < 60)).count();
        System.out.println("Количество работоспособных = " + peopleHowCanWork);

    }

    private static void testFindFirstSkipCount() {
        Collection<String> collection = Arrays.asList("a1", "a2", "a3", "a1");

        System.out.println("Test findFirst and skip start");

        String first = collection.stream().findFirst().orElse("1");
        System.out.println("Вернуть первый элемент = " + first);

        String last = collection.stream().skip(collection.size() - 1).findAny().orElse("1");
        System.out.println("Вернуть последний элемент = " + last );

        String find = collection.stream().filter("a3"::equals).findFirst().get();
        System.out.println("Найден элемент = " + find);

        String third = collection.stream().skip(2).findFirst().get();
        System.out.println("Вернуть третий элемент = " + third);

        System.out.println();
        System.out.println("Начать тест");

        List<String> select = collection.stream().filter((s) -> s.contains("1")).collect(Collectors.toList());
        System.out.println("Выбор элементов = " + select);
    }

    private static void testLimit() {
        System.out.println();
        System.out.println("Test limit start");
        Collection<String> collection = Arrays.asList("a1", "a2", "a3", "a1");

        List<String> limit = collection.stream().limit(2).collect(Collectors.toList());
        System.out.println("limit = " + limit);


        List<String> fromTo = collection.stream().skip(1).limit(2).collect(Collectors.toList());
        System.out.println("fromTo = " + fromTo);

        String last = collection.stream().skip(collection.size() - 1).findAny().orElse("1");
        System.out.println("last = " + last );
    }

    private enum Sex {
        MAN,
        WOMEN
    }

    private static class People {

        private final String name;
        private final Integer age;
        private final Sex sex;

        public People (String name, Integer age, Sex sex) {

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
            return "{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", sex=" + sex +
                    '}';
        }
    }

    public static void main(String[] args)  throws Exception {
        testFilterAndCount();
    }
}
