package homework11.Ex2;

import java.util.HashMap;
import java.util.Map;

public class Person {
    private final String name;
    private final String occupation;
    private final String haircolour;

    public Person(String name, String occupation, String haircolour) {
        this.name = name;
        this.occupation = occupation;
        this.haircolour = haircolour;
    }

    public String getName() {
        return name;
    }

}
