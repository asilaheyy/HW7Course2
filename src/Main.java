import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Set<Product> set = new HashSet<>();
        Product banana = new Product("Банан", 1.0f);
        //Product banana2= new Product("Банан", 1.0f, 0.3f);
        Product bread = new Product("Хлеб", 2.22f);
        Product milk = new Product("Молоко", 1.09f);
        Product apples = new Product("Яблоки", 1.44f);
        Product coffee = new Product("Кофе", 3.33f);

        set.add(banana);
        set.add(bread);
        set.add(milk);
        set.add(apples);
        set.add(coffee);
        set.add(coffee);




        System.out.println(Arrays.toString(set.toArray()));


        randomFillling();


    }

    private static void randomFillling() {
        Set<Integer> numbers = new HashSet<>(20);
        Random random = new Random();
        while (numbers.size() < 20) {
            numbers.add(random.nextInt(1000));
        }
        System.out.println(numbers);
        numbers.removeIf(next -> next % 2 != 0);
        System.out.println(numbers);
    }
}

