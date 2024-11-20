class Specialist extends HealthProfessional {
    //In addition to the instance variable in the parent class, a new instance variable is created, which is used to distinguish the type of doctor
    String doctorType;

    //Inherits the instance variable of the parent class and initializes the new instance variable
    public Specialist(int id, String name, String gender, int yearsOfExperience, String workingTime, String areasOfInterest, String qualification, String doctorType) {
        super(id, name, gender, yearsOfExperience, workingTime, areasOfInterest, qualification);
        this.doctorType = doctorType;
    }

    //Inherits the print method of the parent class, and adds an output statement to output the type of doctor
    @Override
    public void printBasicInformation() {
        super.printBasicInformation();
        System.out.println("Doctor Type: " + doctorType);
    }
}
