class Student {
    String name;
    int m1, m2, m3;

    Student(String name, int m1, int m2, int m3) {
        this.name = name;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }
}

public class Insertion_sort_3marks {

    public static void main(String[] args) {

        Student[] students = {
            new Student("Aman", 80, 75, 68),
            new Student("Kartik", 80, 75, 90),
            new Student("Neha", 80, 60, 88)
        };

        System.out.println("Before sorting:");
        print(students);

        insertionSort(students);

        System.out.println("\nAfter sorting:");
        print(students);
    }

    static void insertionSort(Student[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            Student key = arr[i + 1];
            int j = i;
            while (j >= 0 && compareMarks(arr[j], key) > 0) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
            }
       

    static int compareMarks(Student a, Student b) {

        if (a.m1 != b.m1)
            return a.m1 - b.m1;

        if (a.m2 != b.m2)
            return a.m2 - b.m2;

        return a.m3 - b.m3;
    }

    static void print(Student[] students) {
        for (Student s : students) {
            System.out.println(
                s.name + " " + s.m1 + ", " + s.m2 + ", " + s.m3
            );
        }
    }
}
