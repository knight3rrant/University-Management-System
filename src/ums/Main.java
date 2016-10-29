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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Student rabbani = new Student("122-34-1204", "Golam","Rabbani",21,"Software Engineering");
        Student ferdaus = new Student("122-34-1200", "Ferdaus","Rahman",21,"Software Engineering");
        Course java = new Course("Intro to Java", "SWE221", 4);
         Course OOP = new Course("Intro to OOP", "SWE222", 4);
         
        Teacher anower = new Teacher("122-00-3333", "Anower","Hossain",26,"Software Engineering");
        Staff robin = new Staff("122-00-333", "Robin","Hossain",23,"Software Engineering");
        
        anower.setSalary(100);
        robin.setSalary(20000);
        ferdaus.enrolledCourse(java);
        ferdaus.enrolledCourse(OOP);
        rabbani.enrolledCourse(java);
        anower.assignedCourse(java);
        anower.assignedCourse(OOP);
        anower.showInfo();
        robin.showInfo();
        rabbani.showInfo();
        ferdaus.showInfo();
        //java.viewCourseInfo();
        //ferdaus.viewStudentInfo();
        //anower.getYearlySalaryinfo();
    }
    
}

/*




*/