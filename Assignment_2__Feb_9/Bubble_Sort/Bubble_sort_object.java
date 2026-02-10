import java.util.*;
class Student {
    int rollNo;
    String name;

    Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }
}

public class Bubble_sort_object {

	public static void main(String[] args) {
		
		List<Student>l=new ArrayList<>();
		l.add(new Student(3, "Aman"));
		l.add(new Student(1, "Kartik"));
		l.add(new Student(2, "Rohit"));
		for (Student s : l) {
            System.out.println(s.rollNo + " " + s.name);
        }
		       
		for (int i = 0; i < l.size() - 1; i++) {
            for (int j = 0; j < l.size() - 1 - i; j++) {

                if (l.get(j).rollNo > l.get(j + 1).rollNo) {
                    Student temp = l.get(j);
                    l.set(j, l.get(j + 1));
                    l.set(j + 1, temp);
                }
            }
        }
		
		for (Student s : l) {
            System.out.println(s.rollNo + " " + s.name);
        }
	}

}
