class HealthProfessional {
    //Default constructor
    int id;
    String name;
    String gender;
    int yearsOfExperience;
    String workingTime;
    String areasOfInterest;
    String qualification;

    //Another constructor with arguments that initializes all instance variables
    public HealthProfessional(int id, String name, String gender, int yearsOfExperience, String workingTime,  String areasOfInterest, String qualification) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.yearsOfExperience = yearsOfExperience;
        this.workingTime = workingTime;
        this.areasOfInterest = areasOfInterest;
        this.qualification = qualification;
    }

    //A print method that outputs basic information about the doctor
    public void printBasicInformation() {
        System.out.println("\nThe doctor's basic information as follows");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Years of Experience: " + yearsOfExperience);
        System.out.println("Working Time: " + workingTime);
        System.out.println("Areas of Interest: " + areasOfInterest);
        System.out.println("Qualification: " + qualification);
    }
}
