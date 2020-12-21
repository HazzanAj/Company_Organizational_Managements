/******************************************************************
 * Author: AJAO HAZZAN                                             *
 * Project Title: Employees' Payment System                        *
 * Date : 28th of OCt 2020.                                        *
 *=================================================================*
 * DESCRIPTIONS:                                                   *
 * This project was developed based on customer's                  *
 * specifications. It contains list of Employee names,positions,   *
 * Tiers, profession, Job Descriptions,Employment History, Year    *
 * of Experience, Starting Salary, Employees Performance Index,    *
 * and Next Salary Increments and Expectations.                    *
 * ================================================================*
 *GOALS:                                                           *
 * To Have documentations of all employees records                 *
 * To Decide their salary increment based on their: Tiers,         *
 * Year of Experiences and Performance Index,                      *
 * To enable employees to know their next payment increment        *
 * without visiting the human resource department                  *
 ******************************************************************/

import java.util.Scanner;

public class EmployeesPaymentSystemMain {
    public static void main(String[] args) {
        Scanner ConsoleInput = new Scanner(System.in);
        System.out.println("To Access Company's Organizational " +
                          "Structure Enter Your Membership Code !");
        int password1 = ConsoleInput.nextInt();
        // This is default password, just for testing, your password must be hidden.
        int password2 = 1234;
        if (password1 == password2) {
            EmployeesPaymentSystem.paymentCriteria();
            EmployeesNames.employeesName();
            EmployeesPositions.employeesPositions();
            EmployeesTiers.employeesTiers();
            EmployeesNamesAndProfessions.employeesNamesAndProfession();
        } else {
            System.out.println("Wrong Password, Try Again Please!");}
        System.out.println("Enter Your Tier Level Please!");
        int tier = ConsoleInput.nextInt();
        int checkTier = 1;
        if ( tier == checkTier) {
            System.out.println("Your Next Salary Expectation Should Be :");
            EmployeesPaymentSystem.tier1And2();
        } else {
            System.out.println("Enter years of experience");
            int yearsOfExperience = ConsoleInput.nextInt();
            int checkYearsOfExperience = 3;
            if (yearsOfExperience == checkYearsOfExperience);{
                System.out.println("Your Next Salary Expectation Should Be:");
                EmployeesPaymentSystem.tier3And5();
            }
        }
    }
}

