package homework.exercise1;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class Basket {
    private List<String> fruits;

    public Basket(List<String> fruits) {
        this.fruits = fruits;
    }

    public static void main(String[] args) {
        new Basket(Arrays.asList("Mar", "Banane"));
        System.out.println();
    }

    public boolean find(String fruit) {
        if (fruit == null) {
            return false;
        }
        return fruits.contains(fruit);
    }

    public void add(String fruit){
        if (fruit != null) {
            fruits.add(fruit);
        }
    }

    public Collection<String> distinct(){
        return new HashSet<>(fruits);
    }



}
