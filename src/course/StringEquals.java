package course;

public class StringEquals {public static void main(String[] args) {
    String first = "first";
    String second = new String("first");
    String third = "fir"+"st";

    System.out.println(first + " is " + (first == second ? "equal" : "not equal") + " with " + second );
    System.out.println(first + " is " + (first == third ? "equal" : "not equal") + " with " + third );
    System.out.println(third + " is " + (third == second ? "equal" : "not equal") + " with " + second );



    System.out.println(first + " is " + (first.equals(second) ? "equal" : "not equal") + " with " + second );
    System.out.println(first + " is " + (first.equals(third) ? "equal" : "not equal") + " with " + third );
    System.out.println(third + " is " + (third.equals(second) ? "equal" : "not equal") + " with " + second );

    integerEqual();
}

    public static void integerEqual(){
        Person a = new Person(10);
        Person b = new Person(10);

        System.out.println(a.equals(b));
    }
}

class Person{
    private int cnp;
    public Person(int cnp){
        this.cnp = cnp;
    }

    public boolean equals(Person p){
        return p.cnp == this.cnp;
    }
}

