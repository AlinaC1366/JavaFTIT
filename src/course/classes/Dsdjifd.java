package course.classes;

public class Dsdjifd {
    public static void main(String[] args) {
        class A {
            public void hi() {
                System.out.println("Hi from A");
            }
            public void hello() {
                System.out.println("Hello from A");
            }
        }
        class B extends A {
            @Override
            public void hello() {
                System.out.println("Hello from B");
            }
        }

        A b = new B();
        b.hi();
        b.hello();

    }
}

