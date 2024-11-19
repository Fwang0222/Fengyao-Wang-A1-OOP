class Appointment {
    //Default constructor
    String patientName;
    String patientPhone;
    String preferredTimeSlot;
    HealthProfessional doctor;

    //Another constructor with arguments that initializes all instance variables
    public Appointment(String patientName, String patientPhone, String preferredTimeSlot, HealthProfessional doctor) {
        this.patientName = patientName;
        this.patientPhone = patientPhone;
        this.preferredTimeSlot = preferredTimeSlot;
        this.doctor = doctor;
    }

    //A print method that outputs appointment details
    public void printAppointmentDetails() {
        System.out.println("\nThe patient's appointment details as follows");
        System.out.println("Patient Name: " + patientName);
        System.out.println("Patient Phone: " + patientPhone);
        System.out.println("Preferred Time Slot: " + preferredTimeSlot);
        System.out.println("Doctor:" + doctor.name);
    }

    //A getPatientPhone method that returns patient phone number
    public String getPatientPhone(){
        return patientPhone;
    }
}
