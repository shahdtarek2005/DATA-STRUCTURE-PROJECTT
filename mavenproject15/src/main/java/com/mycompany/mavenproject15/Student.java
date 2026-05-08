/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject15;

/**
 *
 * @author shahd
 */
public class Student 
{
 int studentid;
 String studentname;
 double gpa ;
 Student leftnode;
 Student rightnode;
  public Student(int studentid, String studentname, double gpa)
  {
        this.studentid = studentid;
        this.studentname = studentname;
        this.gpa = gpa;
        leftnode =null;
        rightnode=null;
  }
  
  public void display()
  {
      System.out.println("id :"+studentid);
      System.out.println("GPA :"+studentname);
      System.out.println("id :"+gpa);
  }
 
 
}
