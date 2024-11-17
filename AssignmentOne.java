class HealthProfessional {
    int id;
    String name;
    String basicInf;

    public HealthProfessional(int id, String name, String basicInf) {
        this.id = id;
        this.name = name;
        this.basicInf = basicInf;
    }

    public void printBasicInf() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Basic Information: " + basicInf);
    }

    public String getName() {
        return name;
    }
}

public class AssignmentOne {
    public static void main(String[] args) {
        HealthProfessional doctor = new HealthProfessional(12345, "Linda", "Excellent medical skills");
        doctor.printBasicInf();
    }
}
class GeneralPractitioner extends HealthProfessional {
    String specialty;

    public GeneralPractitioner(int id, String name, String basicInf, String specialty) {
        super(id, name, basicInf);
        this.specialty = specialty;
    }

    @Override
    public void printBasicInf() {
        super.printBasicInf();
        System.out.println("Specialty: " + specialty);
    }
}

class Specialist extends HealthProfessional {
    String expertiseArea;

    public Specialist(int id, String name, String basicInf, String expertiseArea) {
        super(id, name, basicInf);
        this.expertiseArea = expertiseArea;
    }

    @Override
    public void printBasicInf() {
        super.printBasicInf();
        System.out.println("Expertise Area: " + expertiseArea);
    }
}
class Appointment {
    String patientName;
    String patientPhone;
    String preferredTimeSlot;
    HealthProfessional doctor;

    public Appointment(String patientName, String patientPhone, String preferredTimeSlot, HealthProfessional doctor) {
        this.patientName = patientName;
        this.patientPhone = patientPhone;
        this.preferredTimeSlot = preferredTimeSlot;
        this.doctor = doctor;
    }

    public void printAppointmentDetails() {
        System.out.println("Patient Name: " + patientName);
        System.out.println("Patient Phone: " + patientPhone);
        System.out.println("Preferred Time Slot: " + preferredTimeSlot);
        System.out.println("Doctor Details:");
        doctor.printBasicInf();
    }
}