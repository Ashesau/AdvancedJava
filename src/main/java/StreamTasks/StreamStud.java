package StreamTasks;

import java.util.List;

public class StreamStud {

    static List<People> students = List.of(
            new People("Вася", 16, Sex.MAN),
            new People("Петя", 23, Sex.MAN),
            new People("Елена", 42, Sex.WOMEN),
            new People("Иван Иванович", 69, Sex.MAN)
    );

    public static void main(String[] args) {
        militaryService();
        peopleHowCanWork();
        CollectionString.alphabetically();
        CollectionString.elementAdd1();
        CollectionString.integerRemove();
        CollectionString.sortDouble();
    }

    public static void militaryService() {
        List<People> militaryService = students.stream().filter((p) -> p.getAge() >= 18
                && p.getAge() < 27 && p.getSex() == Sex.MAN).toList();
        System.out.println("Повестка придет: " + militaryService);
    }

    public static void peopleHowCanWork() {
        List<People> peopleHowCanWork = students.stream().filter((p) -> p.getAge() >= 18).filter(
                (p) -> (p.getSex() == Sex.WOMEN && p.getAge() < 55) ||
                        (p.getSex() == Sex.MAN && p.getAge() < 60)).toList();
        System.out.println("Количество потенциальных работяг: " + peopleHowCanWork);
    }
}