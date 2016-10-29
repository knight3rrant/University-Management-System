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
public class Employee {
    protected String firstName,lastName,department;
    protected int age;
    protected String ID;
     Employee(String id,String first,String last,int a, String d) {
        ID = id;
        firstName =first;
        lastName= last;
        age = a;
        department = d;
    }
    
}
