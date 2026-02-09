import java.util.*;
class Student {
    int rollNo;
    String name;

    Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }
}

public class Selection_sort_object {

	public static void main(String[] args) {
		
		List<Student>l=new ArrayList<>();
		l.add(new Student(3, "Aman"));
		l.add(new Student(1, "Kartik"));
		l.add(new Student(2, "Rohit"));
		for (Student s : l) {
            System.out.println(s.rollNo + " " + s.name);
        }
        for (int i = 0; i < l.size() - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < l.size(); j++) {
                if (l.get(j).rollNo < l.get(minIndex).rollNo) {
                    minIndex = j;
                }
            }
            Student temp = l.get(minIndex);
            l.set(minIndex, l.get(i));
            l.set(i, temp);
        }     
		for (Student s : l) {
            System.out.println(s.rollNo + " " + s.name);
        }
	}

}
