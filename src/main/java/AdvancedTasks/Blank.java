package AdvancedTasks;

public class Blank {

    public static void main(String[] args) {
        String s = "1   2      3 4    5 6 7";
        String[] a = s.split("[\\s]+");
        for ( String n : a )
            System.out.println("\"" + n + "\"");
    }
}


