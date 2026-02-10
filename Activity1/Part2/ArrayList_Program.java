import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_Program {

    public static void main(String[] args) {

        ArrayList<Integer> marks = new ArrayList<>();

        // Add 5 student marks
        marks.add(78);
        marks.add(85);
        marks.add(69);
        marks.add(92);
        marks.add(74);

        // Insert a mark at index 2
        marks.add(2, 80);

        // Remove the lowest mark
        int lowest = Collections.min(marks);
        marks.remove(Integer.valueOf(lowest));

        // Display final list
        System.out.println("Final Marks List: " + marks);
    }
}
