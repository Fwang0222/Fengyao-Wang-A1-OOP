class HealthProfessional {
    int id;
    String name;
    String gender;
    int yearsOfExperience;
    String workingTime;

    public HealthProfessional(int id, String name, String gender, int yearsOfExperience, String workingTime) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.yearsOfExperience = yearsOfExperience;
        this.workingTime = workingTime;
    }

    public void printBasicInformation() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Years of Experience: " + yearsOfExperience);
        System.out.println("Working Time: " + workingTime);
    }
}

class GeneralPractitioner extends HealthProfessional {
    String doctorType;

    public GeneralPractitioner(int id, String name, String gender, int yearsOfExperience, String workingTime, String doctorType) {
        super(id, name, gender, yearsOfExperience, workingTime);
        this.doctorType = doctorType;
    }

    @Override
    public void printBasicInformation() {
        super.printBasicInformation();
        System.out.println("Doctor Type: " + doctorType);
    }
}

class Specialist extends HealthProfessional {
    String doctorType;

    public Specialist(int id, String name, String gender, int yearsOfExperience, String workingTime, String doctorType) {
        super(id, name, gender, yearsOfExperience, workingTime);
        this.doctorType = doctorType;
    }

    @Override
    public void printBasicInformation() {
        super.printBasicInformation();
        System.out.println("Doctor Type: " + doctorType);
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
        System.out.println("Doctor:" + doctor.name);
    }

    public String getPatientPhone(){
        return patientPhone;
    }
}

public class AssignmentOne {
    public static void main(String[] args) {
        //Part 3 - Using classes and objects
        GeneralPractitioner doctor1 = new GeneralPractitioner(1, "Jade", "Female", 12, "8:00 - 12:00", "General Practitioner");
        GeneralPractitioner doctor2 = new GeneralPractitioner(2, "Hanson", "Male", 18, "10:00 - 14:00", "General Practitioner");
        GeneralPractitioner doctor3 = new GeneralPractitioner(3, "Harden", "Male", 7, "14:00 - 18:00", "General Practitioner");
        Specialist doctor4 = new Specialist(4, "Lively", "Male", 22,"7:00 - 11:00", "Specialist");
        Specialist doctor5 = new Specialist(5, "Aria", "Female", 8, "15:00 - 19:00", "Specialist");

        doctor1.printBasicInformation();
        doctor2.printBasicInformation();
        doctor3.printBasicInformation();
        doctor4.printBasicInformation();
        doctor5.printBasicInformation();
        System.out.println("------------------------------");

        Appointment patient1 = new Appointment("Jam", "34291", "8:00", doctor1);
        Appointment patient2 = new Appointment("Gemma", "34292", "10:00", doctor2);

        patient1.printAppointmentDetails();
        patient2.printAppointmentDetails();

        System.out.println("\n" + patient1.getPatientPhone());
    }
}
