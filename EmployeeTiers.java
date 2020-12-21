public class EmployeesTiers {
    public static void employeesTiers() {
        String[] tiers = {"tier1","tier2","tier3"};
        String[] tier1 = {"Production Workers"," Team Leaders",
                "Production Supervisors","Junior Engineers"};
        String[] tier2 = {"Production Manager","Business Manager",
                "Senior Engineer","Mid Level Engineer",
                "Marketing Manager", "Sales Manager","Logistic Manager"};
        String[] tier3 = {"Chief Executive Officer","Chief Technical Officer",
                "Managing Director"};
        //Print out all Employees' Tiers
        System.out.println(" ");
        System.out.println("All Employees' Tiers Are:");
        System.out.println("=========================");
        for (int k = 0; k < tiers.length; k++) {
            System.out.println(tiers[k]);}
        //Print out Employees' Total Numbers of Tiers
        System.out.println(" ");
        System.out.println("Employees' Total Number of Tiers is:" + tiers.length);
        System.out.println("====================================");
        // Print out Tier 1 Employees's Categories
        System.out.println(" ");
        System.out.println("Tier1 Employee's Categories Are:");
        System.out.println("================================");
        for (int l = 0; l < tier1.length; l++) {
            System.out.println(tier1[l]);}
        // Print out Tier 2 Employees's Categories
        System.out.println(" ");
        System.out.println("Tiers 2 Employees' Categories Are:");
        System.out.println("================================= ");
        for (int l = 0; l <tier2.length; l++) {
            System.out.println(tier2[l]);}
        System.out.println(" ");
        //Print out Tier 3 Employees's Categories
        System.out.println("Tiers 3 Employees' Categories Are :");
        System.out.println("===================================");
        for (int l = 0; l < tier3.length; l++) {
            System.out.println(tier3[l]);}
        System.out.println(" ");
        System.out.println("Employees' Names And Positions ");
        System.out.println("=========================");
    }
}

