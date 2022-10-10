package homework11;

import java.security.Key;
import java.util.*;

public class Exercise1 {
    public static void main(String[] args) {
        Map<String, Integer> studentToGrade = new HashMap<>();
        studentToGrade.values();
        studentToGrade.keySet();
        studentToGrade.put("Maria", 5);
        studentToGrade.put("Iosif", 9);
        studentToGrade.put("Petre", 10);
        studentToGrade.put("Andrei", 7);

        System.out.println(studentToGrade);

        System.out.println("Highest grade: " + Collections.max(studentToGrade.keySet()) + " with " + Collections.max(studentToGrade.values()));
    }

}