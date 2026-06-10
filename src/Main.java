import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<UniversityMember> members =
                new ArrayList<>();


        Professor professor1 =
                new Professor(
                        101,
                        "Dr. Rahman",
                        90000,
                        "ICT"
                        "Artificial Intelligence",
                        35
                );

        AdministrativeOfficer officer1 =
                new AdministrativeOfficer(
                        201,
                        "Mr. Karim",
                        45000,
                        "Admission Office"
                );


        members.add(professor1);
        members.add(officer1);



        System.out.println("===== Dynamic Binding Demo =====\n");

        for (UniversityMember member : members) {

            member.displayBasicInfo();

            member.performDuty();

            System.out.println("------------------------");
        }



        System.out.println("\n===== Downcasting Demo =====");

        for (UniversityMember member : members) {

            if (member instanceof Professor) {

                Professor p = (Professor) member;

                p.showResearchProfile();
            }
        }
    }
}
