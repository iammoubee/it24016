class Professor extends AcademicStaff {

    private String researchArea;
    private int publications;

    public Professor(int memberId,
                     String name,
                     double salary,
                     String department,
                     String researchArea,
                     int publications) {

        super(memberId, name, salary, department);

        this.researchArea = researchArea;
        this.publications = publications;
    }

    public void showResearchProfile() {

        System.out.println("\n--- Research Profile ---");
        System.out.println("Professor: " + name);
        System.out.println("Research Area: " + researchArea);
        System.out.println("Publications: " + publications);
    }

    @Override
    public void performDuty() {
        System.out.println(name +
                " teaches courses and conducts research in " +
                researchArea + ".");
    }
}
