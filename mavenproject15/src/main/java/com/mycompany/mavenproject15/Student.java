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
    double gpa;

    public Student(int studentId, String studentName, double gpa) {
        this.studentid = studentId;
        this.studentname = studentName;
        this.gpa = gpa;
    }

    public void display() {
        System.out.println("ID: " + studentid + ", Name: " + studentname + ", GPA: " + gpa);
    }
 @Override
    public String toString() { return "ID: " + studentid + ", Name: " + studentname + ", GPA: " + gpa; }
 
 
}
