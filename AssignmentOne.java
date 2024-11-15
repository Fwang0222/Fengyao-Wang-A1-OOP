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
