/**
 *  Дана коллекция класс Students (с полями name — имя, age — возраст, sex — пол),
вида List.of( new Students(«Вася», 16, Sex.MAN), new Students(«Петя», 23, Sex.MAN),
new Students(«Елена», 42, Sex.WOMEN), new Students(«Иван Иванович», 69, Sex.MAN)).
a. Выбрать кому придет повестка (от 18 до 27 лет)
b. Найти кол-во потенциальных работяг (т.е. от 18 лет и учитывая, что женщины
выходят в 55 лет, а мужчина в 60) */
package StreamTasks;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor

    public class People {
        private String name;
        private Integer age;
        private Sex sex;

    @Override
    public String toString() {
        return
                "" +
                "name - '" + name + '\'' +
                ", age - " + age +
                ", sex - " + sex;
    }
}