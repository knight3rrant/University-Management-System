/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ums;

/**
 *
 * @author knight
 */
public class Staff extends Employee{
     protected String employeeId;
    protected double salary;
     double yearlysalary;
    double bonus;
    double withBonus;
   Staff(String id,String first,String last,int a, String d){
        super(id,first,last,a,d);
    }
    public void setSalary(double s){
        salary = s;
    }
   
    
    public void showInfo() {

       yearlysalary = salary*12.0;
        bonus  = yearlysalary*0.05;
        withBonus = yearlysalary + bonus;

        System.out.print("\n=====================================\n"
                + "Name: " + firstName + " " + lastName + "\n"
                + "Staff ID: " + ID
                + "\nAge: " + age
                + "\nDepartment: " + department
               
        );
        
            System.out.println("\nYearly Salary: " + withBonus + "\nBonus " + bonus);
        }
}
