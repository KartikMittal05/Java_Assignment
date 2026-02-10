import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayList_Advanced {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        // Store 10 numbers
        for (int i = 1; i <= 10; i++) {
            numbers.add(i * 3);
        }

        // Remove all even numbers
        Iterator<Integer> it = numbers.iterator();
        while (it.hasNext()) {
            if (it.next() % 2 == 0) {
                it.remove();
            }
        }

        // Find max and min
        int max = Collections.max(numbers);
        int min = Collections.min(numbers);

        // Sort in descending order
        numbers.sort(Collections.reverseOrder());

        // Display result
        System.out.println("Final List: " + numbers);
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
    }
}
