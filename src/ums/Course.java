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
public class Course {
    private String courseTitle;
    public String courseCode;
    protected int totalEnrolledStudent=0;
    protected int creditHour;
    
    Course(String title,String code,int credit) {
        courseTitle = title;
        courseCode = code;
        creditHour = credit;
    }
    public int getEnrolledStudent(){
        return totalEnrolledStudent;
    }
    public void viewCourseInfo(){
        System.out.println("====== Course Info======\n"
                + "Course Title: "+courseTitle
                + "\nCourse Code: "+ courseCode
                + "\nCredit Hour: "+ creditHour
                + "\nTotal Enrolled Student: "+ totalEnrolledStudent
        );
    }
}
