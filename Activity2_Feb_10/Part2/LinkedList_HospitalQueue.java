import java.util.LinkedList;

public class LinkedList_HospitalQueue {

    public static void main(String[] args) {

        LinkedList<String> patients = new LinkedList<>();

        // Add 5 patients
        patients.add("Patient A");
        patients.add("Patient B");
        patients.add("Patient C");
        patients.add("Patient D");
        patients.add("Patient E");

        // Emergency patient at first position
        patients.addFirst("Emergency Patient");

        // Remove 2 patients after treatment
        patients.removeFirst();
        patients.removeFirst();

        // Display current queue
        System.out.println("Current Hospital Queue: " + patients);
    }
}
