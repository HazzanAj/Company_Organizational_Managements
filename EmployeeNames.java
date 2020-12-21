public class EmployeesNames{
    public static void employeesName() {
        String[] employees = {"Smith Jone","David Black",
                "Mark Jones","Clement White",
                "White Smith","Black Green",
                "Tomas John","Peter David",
                "Green White","Florence Pius",
                "David clark","Pius Flora",
                "Jame Tomas","Henry Ana",
                "James Titus","Ron Que",
                "Marble Andrew","Willie Jack",
                "Jack Henry","Walk Top",
                "Pius pier","Mark George"};
        //Print out all Employees Name
        System.out.println("Their names are :");
        System.out.println("================= ");
        for (int i = 0; i < employees.length; i++){
            System.out.println(employees[i]); }
        System.out.println(" ");
        //Print out Employee Total Numbers
        System.out.println("Employees Total Number is :"
                + employees.length);
        System.out.println("==========================");
        System.out.println(" ");
    }
}

