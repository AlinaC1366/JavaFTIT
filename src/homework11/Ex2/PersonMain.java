package homework11.Ex2;

import java.util.*;

public class PersonMain {
    public static void main(String[] args) {
        Person p1 = new Person("John", 12, "Black");
        Person p2 = new Person("Marin", 13, "Brown");
        Person p3 = new Person("Martha", 12, "Brown");

        System.out.println(getAllNames(Arrays.asList(p1, p2)));
        System.out.println(mapByHaircolour(Arrays.asList((p1,p2,p3)));
    }

    // 2.1
    public static List<String> getAllNames(List<Person> personList) {

        List<String> result = new ArrayList<>();
        for (Person person : personList) {
            result.add(person.name());
        }
        return result;
    }

    //2.4

    public static Map<String, List<String>> mapByHaircolour(List<Person> personList) {
        Map<String, List<String>> result = new HashMap<>();
        for (Person person : personList) {
     //       result.putIfAbsent(person.hairColour(), new ArrayList<>());
            result.get(person.hairColour()).add(person.name());
        }

        return result;
    }
}


