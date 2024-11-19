//Import the ArrayList class, which is later used to store appointment
import java.util.ArrayList;

public class AssignmentOne {
    public static void main(String[] args) {
        //Part 3 - Using classes and objects

        //Three general practitioners and two specialist subjects were created
        GeneralPractitioner doctor1 = new GeneralPractitioner(1, "Jade", "Female", 12, "8:00 - 12:00", "General Practitioner");
        GeneralPractitioner doctor2 = new GeneralPractitioner(2, "Hanson", "Male", 18, "10:00 - 14:00", "General Practitioner");
        GeneralPractitioner doctor3 = new GeneralPractitioner(3, "Harden", "Male", 7, "14:00 - 18:00", "General Practitioner");
        Specialist doctor4 = new Specialist(4, "Lively", "Male", 22,"7:00 - 11:00", "Specialist");
        Specialist doctor5 = new Specialist(5, "Aria", "Female", 8, "15:00 - 19:00", "Specialist");

        //Print basic information of all objects
        doctor1.printBasicInformation();
        doctor2.printBasicInformation();
        doctor3.printBasicInformation();
        doctor4.printBasicInformation();
        doctor5.printBasicInformation();
        System.out.println("------------------------------");

        //Part 5 - Collection of appointment

        //Create an ArrayList that can store appointments named appointmentList
        ArrayList<Appointment> appointmentList = new ArrayList<>();

        //Create appointments with two general practitioners and two specialists
        createAppointment(appointmentList, "Jim", "34291", "8:00", doctor1);
        createAppointment(appointmentList, "Gemma", "34292", "10:00", doctor2);
        createAppointment(appointmentList, "Lucy", "34293", "10:00", doctor4);
        createAppointment(appointmentList, "Opal", "34294", "14:30", doctor5);

        //Print existing appointment
        printExistingAppointment(appointmentList);
        System.out.println("------------------------------");

        //Cancel any appointment
        cancelBooking(appointmentList, "34291");

        //Print existing appointment again
        printExistingAppointment(appointmentList);
        System.out.println("------------------------------");
    }

    //Method for creating new appointment information
    public static void createAppointment(ArrayList<Appointment> appointmentList, String patientName, String patientPhone, String preferredTimeSlot, HealthProfessional doctor) {
        if (doctor != null && patientName != null && patientPhone != null && preferredTimeSlot != null) {
            Appointment newAppointment = new Appointment(patientName, patientPhone, preferredTimeSlot, doctor);
            appointmentList.add(newAppointment);
            System.out.println("Appointment successful.");
        } else {
            System.out.println("Appointment failed, incomplete information!");
        }
    }

    //Method for print existing appointment information
    public static void printExistingAppointment(ArrayList<Appointment> appointmentList) {
        if (appointmentList.isEmpty()) {
            System.out.println("No existing appointment information.");
        } else {
            for (Appointment appointment : appointmentList) {
                appointment.printAppointmentDetails();
            }
        }
    }

    //Method for canceling existing appointment information
    public static void cancelBooking(ArrayList<Appointment> appointmentList, String patientPhone) {
        boolean removed = appointmentList.removeIf(appointment -> appointment.getPatientPhone().equals(patientPhone));

        if (removed) {
            System.out.println(patientPhone + " the appointment has been canceled.");
        } else {
            System.out.println(patientPhone + " is not found.");
        }
    }
}
