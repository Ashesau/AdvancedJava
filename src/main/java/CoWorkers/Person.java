//package CoWorkers;
//
//import java.util.Random;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Comparator;
//
//public class Person {
//    private String name;
//    private int age;
//    private int salary;
//    private int date;
//
//    public static void main(String[] args) {
//        Comparator byName = new Comparator() {
//            @Override
//            public int compare(Developer o1, Developer o2) {
//                return o1.getName().compareTo(o2.getName());
//            }   //Comparator byName =
//                //(Developer o1, Developer o2)->o1.getName().compareTo(o2.getName());
//        };
//    }
//
//        List listDevs = getDevelopers();
//
//        System.out.println("Before Sort");
//        for (Developer developer : listDevs) {
//            System.out.println(developer);
//            Collections.sort(listDevs, new Comparator() {
//                @Override
//                public int compare(Developer o1, Developer o2) {
//                    return o1.getSalary().compareTo(o2.getSalary());
//                }
//            });
//        }
////}