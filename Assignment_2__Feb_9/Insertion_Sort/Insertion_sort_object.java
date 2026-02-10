import java.util.*;
class Student {
    int rollNo;
    String name;

    Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }
}

public class Insertion_sort_object {

	public static void main(String[] args) {
		
		List<Student>l=new ArrayList<>();
		l.add(new Student(3, "Aman"));
		l.add(new Student(1, "Kartik"));
		l.add(new Student(2, "Rohit"));
		for (Student s : l) {
            System.out.println(s.rollNo + " " + s.name);
        }
        for (int i = 0; i < l.size() - 1; i++) {
            Student key = l.get(i + 1);
            int j = i;
            while (j >= 0 && l.get(j).rollNo > key.rollNo) {
                l.set(j + 1, l.get(j));
                j--;
            }
            l.set(j + 1, key);
        }     
		for (Student s : l) {
            System.out.println(s.rollNo + " " + s.name);
        }
	}

}
