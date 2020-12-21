import java.util.HashMap;
import java.util.Map;

public class EmployeesNamesAndProfessions {
    public static void employeesNamesAndProfession() {
        Map<String, String> nameToProfession = new HashMap<String, String>();
        // Adding Employees profession
        nameToProfession.put("Smith Jone",     ": Chief Executive Officer");
        nameToProfession.put("David Black",    ":Chief Technical Officer");
        nameToProfession.put("Mark Jones",     ":Managing Director");
        nameToProfession.put("Clement White",  ":Production Manager");
        nameToProfession.put("White Smith",    ":Business Manager");
        nameToProfession.put("Black Green",    ":Marketing Manager");
        nameToProfession.put("Tomas John",     ":Sales Manager");
        nameToProfession.put("Peter David",    ":Logistic Manager");
        nameToProfession.put("Green White",    ":Production Supervisors");
        nameToProfession.put("Florence Pius",  ":Team Leaders");
        nameToProfession.put("David clark",    ":Team Leaders");
        nameToProfession.put("Pius Flora",     ":Team Leaders");
        nameToProfession.put("Jame Tomas",     ":Production Workers");
        nameToProfession.put("Henry Ana",      ":Production Workers");
        nameToProfession.put("James Titus",    ":Production Workers");
        nameToProfession.put("Ron Que",        ":Senior Engineers");
        nameToProfession.put("Marble Andrew",  ":Senior Engineers");
        nameToProfession.put("Willie Jack",    ":Mid-Lever Engineers");
        nameToProfession.put("Jack Henry",     ":Junior Engineers");
        nameToProfession.put("Walk Top",       ":Production Workers");
        nameToProfession.put("Pius pier",      ":Production Workers");
        nameToProfession.put("Mark George",    ":Production Workers");
        nameToProfession.forEach((key, value) -> System.out.println
                                                 (key + "  " + value));
    }
}

