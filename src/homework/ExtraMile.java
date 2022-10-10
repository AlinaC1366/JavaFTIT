package homework;

import java.util.Arrays;

public class ExtraMile {
    public static void main(String[] args) {


        System.out.println("Exercise 1 ");
       int countTo100;

        System.out.println("Count to 100 w For");
        for(countTo100 = 0; countTo100 <= 99;countTo100++) {
            System.out.print( countTo100+",");
        }

        System.out.print(100);


        System.out.println("Count to 100 w While");
        int countTo100W = 1, n = 100;

        while(countTo100W <= n) {
            System.out.println(countTo100W);
            countTo100W++;
        }

        System.out.println("Count to 100 w DoWhile");

        int i = 0;
        int n2 =100;

        do{
            i= n2;
            i++;
        } while(i<n2);

        System.out.println(i);

        System.out.println("Exercise 2");
        String printFunction[] = {"Cats", "Dogs", "Rabbits"};
        System.out.println(Arrays.toString(printFunction));

        System.out.println("Exercise 3");
        String printS2Element[] ={"Cat", "Dog", "Butterfly", "Zebra"};
      //  char index = printS2Element.toCharArray(0);
      //  char index = printS2Element.to
      //  System.out.println(index);
        
    }

  /*       

        for(){
*/
    
  }


}







