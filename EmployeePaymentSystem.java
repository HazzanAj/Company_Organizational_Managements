/******************************************************************
 * Author: Ajao Hazzan                                             *
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
import java.util.*;
public class EmployeesPaymentSystem {
    public static String employees;
    public static String positions;
    public static int tiers;
    public static String professions;
    public static String jobDescriptions;
    public static int  employmentHistory;
    public static double yearsOfExperience;
    public static double startingSalary;
    public static double employeesPerformanceIndex;
    public static double nextSalaryIncrementExpectations;
    public static final double workerStartingSalary = 2500;
    public static final double tier1Bonus = 100;
    public static void paymentCriteria() {
        System.out.println("All Employees Payment Criteria "+
                "Had Been Implemented Successfully");
        System.out.println(" ");}
    public static void tier1And2 () {
           employeesPerformanceIndex = workerStartingSalary + tier1Bonus;
           double tier1Payment = employeesPerformanceIndex * 1.1 ;
            System.out.println(tier1Payment);}
    public static void tier3And5 () {
        employeesPerformanceIndex = workerStartingSalary + tier1Bonus;
        double tier1Payment = employeesPerformanceIndex * 1.5 ;
        System.out.println(tier1Payment);
    }
}
