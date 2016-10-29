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
public class Teacher extends Staff {

    private String[] assignedCourse = new String[20];

    Teacher(String id, String first, String last, int a, String d) {
        super(id, first, last, a, d);

    }
    private int totalCredithoursTaken = 0;

    private int count = 0;

    public void assignedCourse(Course c) {
        try {
            assignedCourse[count] = c.courseCode;
            totalCredithoursTaken += c.creditHour;
            count++;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }

    public void showInfo() {

        yearlysalary = salary * 12.0;
        bonus = yearlysalary * 0.1;
        withBonus = yearlysalary + bonus;

        System.out.print("\n=====================================\n"
                +"Name: " + firstName + " " + lastName + "\n"
                + "Teacher ID: " + ID
                + "\nAge: " + age
                + "\nDepartment: " + department
                + "\nTotal Credit hours: "+ totalCredithoursTaken
                + "\nCourse: "
        );
        for (int i = 0; i < assignedCourse.length; i++) {

            if (assignedCourse[i] != null) {
                System.out.print(assignedCourse[i] + ", ");
            }
        }
            System.out.println("\nYearly Salary: " + withBonus + "\nBonus " + bonus);
        }

    
}
