package course;

import java.util.Scanner;

public class MyFirstIntellij {
    public static void main(String[] args) {
    System.out.println("My first intellijjjjjjj");
    int sum = addNumbers(1, 3);
    System.out.println("sum is " + sum);
}

    private static void readAndPrint() {
        Scanner scanner = new Scanner(System.in);
        String anyName = scanner.nextLine();
        anyMethodName(anyName);
        anyMethodName("test");
    }

    private static void anyMethodName(String stringToBePrinted) {
        System.out.println(stringToBePrinted);
    }

    public static int addNumbers(int a, int b) {
        return a + b;
    }
}

