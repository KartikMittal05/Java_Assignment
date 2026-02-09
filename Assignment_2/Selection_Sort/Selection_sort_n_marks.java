import java.util.Arrays;

class Student {
    String name;
    int[] marks;

    Student(String name, int[] marks) {
        this.name = name;
        this.marks = marks;
    }
}

public class Selection_sort_n_marks {

    public static void main(String[] args) {

        Student[] students = {
            new Student("Aman", new int[]{80, 75, 68}),
            new Student("Kartik", new int[]{80, 75, 90}),
            new Student("Neha", new int[]{80, 60, 88}),
        };

        System.out.println("Before sorting:");
        print(students);

        selectionSort(students);

        System.out.println("\nAfter sorting:");
        print(students);
    }

    static void selectionSort(Student[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (compareMarks(arr[j].marks, arr[minIndex].marks) < 0) {
                    minIndex = j;
                }
            }
            Student temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }


    static int compareMarks(int[] a, int[] b) {
        int min = Math.min(a.length, b.length);

        for (int i = 0; i < min; i++) {
            if (a[i] != b[i]) {
                return a[i] - b[i];
            }
        }
        return a.length - b.length;
    }

    static void print(Student[] students) {
        for (Student s : students) {
            System.out.println(s.name + " " + Arrays.toString(s.marks));
        }
    }
}
