public class EmployeesPositions {
    public static void employeesPositions() {
        String[] positions = {"Chief Executive Officer",
                "Chief Technical Officer",
                "Managing Director","Production Manager",
                "Business Manager","Marketing Manager",
                "Sales Manager","Logistic Manager",
                "Production Supervisors","Team Leaders",
                "Senior Engineers","Mid-Lever Engineers",
                "Junior Engineers","Production Workers"};
        //Print out all Employees Positions
        System.out.println("All Employees Positions Are:");
        System.out.println("============================");
        for (int j = 0; j < positions.length; j++) {
            System.out.println(positions[j]); }
        //Print out Employee Total Numbers
        System.out.println(" ");
        System.out.println("Employees Total Number is :" + positions.length);
        System.out.println("=============================");
    }
}

