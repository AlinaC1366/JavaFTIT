package course;

public class StringExercise {
    public static void main(String[] args) {
    System.out.println("Hello world!");
    String s = "Abracadabra";
    String str = "abc";
    String strr = "ab" + "c";

    // length of a string
    System.out.println(s.length());

    // part of a string
    String substring = s.substring(1);
    System.out.println(substring);

    // first 5 char
    System.out.println(s.substring(0, 5));

    System.out.println(s.toUpperCase());
    System.out.println(s.toLowerCase());

    // clean extra spaces
    String extraSpaces = "Rain         ";
    System.out.println(extraSpaces.trim());
    System.out.println(extraSpaces);

    String fullName = "Ioan~Pop~Mihai";
    String[] split = fullName.split("~");
    for (String name : split) {
        System.out.println(name);
    }

    System.out.println(s.indexOf("c"));
    System.out.println(s.indexOf("r"));
    System.out.println(s.lastIndexOf("r"));

    System.out.println(s.contains("cad"));

    System.out.println(s.replace("ra", "**"));

    String toReplace = "Al3x@nd7U";
    //replacing uppercase char with 0
    System.out.println(toReplace.replaceAll("[A-Z]", "0"));
    // replacing numbers with *
    System.out.println(toReplace.replaceAll("[0-9]", "*"));


    String format = String.format("%s has received %d apples and he/she shared %d with %s", "Ana", 14, 5, "Marcel");
    System.out.println(format);

    String number = "10";
    if (number.replaceAll("[0-9]", "").length() == 0) {
        int i = Integer.parseInt(number);
        System.out.println(i);
    }

    int i = 105;
    String numberFromInt = String.valueOf(i);
    System.out.println(numberFromInt);

    String isNull = null;
    if (isNull != null && isNull.length() > 0) {
        System.out.println("String exists and is not empty");
    }
    if(isNull == null || isNull.equals("")){
        System.out.println("String is null or empty");
    }
}
}
