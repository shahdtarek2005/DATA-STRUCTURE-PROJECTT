/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject15;

import com.mycompany.mavenproject15.Student;

/**
 *
 * @author shahd
 */
public class nodee 
{
    Student data;
    nodee left;
    nodee right;

    public nodee(Student data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    public nodee(Student data, nodee left, nodee right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }

    public void display() {
        System.out.print("ID: " + data.studentid + " Name: " + data.studentname + " GPA: " + data.gpa);
    }
    
    
}
