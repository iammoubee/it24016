class AcademicStaff extends Employee {

    protected String department;

    public AcademicStaff(int memberId, String name,
                         double salary, String department) {

        super(memberId, name, salary);
        this.department = department;
    }

    public void conductClass() {
        System.out.println(name + " conducts classes.");
    }

    @Override
    public void performDuty() {
        System.out.println(name +
                " teaches students in the " +
                department + " department.");
    }
}
