package course;

import java.util.Scanner;

public class SimplifiedForIndex {
    public static void main(String[] args) {
    String[] list = {"One", "Two", "Three"};
    int i = 0;
    for(String s: list){
        System.out.println(s + " is at index " + i++);
    }

    int[] daysOfWeek = {1,2,3,4,5,6,7};
    System.out.println(daysOfWeek[3]);
    Scanner s = new Scanner(System.in);
    System.out.println("Enter some text:");
    String line = s.nextLine();
    System.out.println(line + " has been read");
}
}
