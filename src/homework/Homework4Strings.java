package homework;

import java.util.Arrays;
import java.util.Random;

public class Homework4Strings {

    public static void main(String[] args) {
        String[] names = {"Alina", "Alexandru", "Maria", "Marin", "Petre", "Teo"};
        printStartWithA(names);
        printContainString(names, "e");
        System.out.println(Arrays.toString(replaceRWithStar(names)));
        FirstThreeChars(names);
        printRandomLetter(names);
        System.out.println(abbrMiddleName("Elena Maria Victoria"));
        System.out.println(abbrMiddleName("Elena Victoria"));
    }


    public static void printStartWithA(String[] names) {
        for (String name : names) {
            if (name.startsWith("A")) {
                System.out.println(name);
            }
        }
    }

    public static void printContainString(String[] names, String stringToSearchFor) {
        for (String name : names) {
            if (name.contains(stringToSearchFor)) {
                System.out.println(name);
            }
        }
    }

    public static void printRandomLetter(String[] names) {
        Random random = new Random();
        String randomName = names[random.nextInt(names.length)];
        System.out.println(randomName.charAt(random.nextInt(randomName.length())));
    }



    public static void FirstThreeChars(String[] names) {
        for (String name : names) {
                System.out.println(name.substring(0, Math.min(3, name.length())));
            }
        }



    public static String abbrMiddleName(String name) {
        String[] nameParts = name.split(" +");
        if (nameParts.length == 3) {
            return String.format("%s %s. %s", nameParts[0], nameParts[1].charAt(0), nameParts[2]);
        } else {
            return name;
        }
    }

    public static String[] replaceRWithStar(String[] names) {
        String[] result = new String[names.length];
        for (int i = 0; i < names.length; i++) {
            {result[i] = names[i].replaceAll("[rR]", "*");}
        }
        return result;
    }
}