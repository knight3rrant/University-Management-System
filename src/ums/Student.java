/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ums;

import java.util.Iterator;

/**
 *
 * @author knight
 */
public class Student extends Employee{
    
     
    String[] enrolledIn = new String[20] ;
    private int count=0;
   Student(String id,String first,String last,int a, String d){
        super(id,first,last,a,d);
    }
    public void enrolledCourse(Course c){
        try{
        enrolledIn[count] = c.courseCode;
        count++;
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
       c.totalEnrolledStudent++;
       
    }
   
      public void showInfo(){
          System.out.println("\n=====================================\n"
                  +"Name: "+firstName+" "+lastName+"\n"+
                  "Student ID: "+ID+
                  "\nAge: "+age+
                   "\nDepartment: "+department+
                  "\nCourse: "
                  );
           for (int i = 0; i < enrolledIn.length; i++) {
        
               if(enrolledIn[i]!=null)
               System.out.print(enrolledIn[i]+", ");
               
                
          }
          
      }
}
