/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject15;


import java.util.ArrayList;
import java.util.Comparator;

/**
 *
 * @author shahd
 */
public class BinarySearchh {
     Student root;   


    public void insert(int id, String name, double gpa) {
        root = insertRec(root, id, name, gpa);
    }

    private Student insertRec(Student root, int id, String name, double gpa) {

        if (root == null) {
            return new Student(id, name, gpa);
        }

        if (id < root.studentid) {
            root.leftnode = insertRec(root.leftnode, id, name, gpa);
        }

        else if (id > root.studentid) {
            root.rightnode = insertRec(root.rightnode, id, name, gpa);
        }

        else {
            System.out.println("Duplicate ID not allowed!");
        }

        return root; 
}
    public Student search(int id) {
        return searchRec(root, id);
    }

    private Student searchRec(Student root, int id) {

        if (root == null || root.studentid == id) {
            return root;
        }

        if (id < root.studentid) {
            return searchRec(root.leftnode, id);
        }

        return searchRec(root.rightnode, id);
    }
    public void display() {
        inorder(root);
    }

    private void inorder(Student root) {

        if (root != null) {

            inorder(root.leftnode);

            System.out.println(
                    "ID: " + root.studentid+
                    " Name: " + root.studentname +
                    " GPA: " + root.gpa
            );

            inorder(root.rightnode);
        }
    }
     public int size() {
        return sizeRec(root);
    }

    private int sizeRec(Student root) {

        if (root == null) {
            return 0;
        }

        return 1 + sizeRec(root.leftnode) + sizeRec(root.rightnode);
    }
    public void remove(int id) {
        root = removeRec(root, id);
    }

    private Student removeRec(Student root, int id) {

        if (root == null) {
            return null;
        }

        if (id < root.studentid) {
            root.leftnode = removeRec(root.leftnode, id);
        }

        else if (id > root.studentid) {
            root.rightnode = removeRec(root.rightnode, id);
        }

        else {

            if (root.leftnode == null) {
                return root.rightnode;
            }

            else if (root.rightnode == null) {
                return root.leftnode;
            }

            root.studentid = minValue(root.rightnode);

            root.rightnode = removeRec(root.rightnode, root.studentid);
        }

        return root;
    }
     private int minValue(Student root) {

        int min = root.studentid;

        while (root.leftnode != null) {
            min = root.leftnode.studentid;
            root = root.leftnode;
        }

        return min;
    }
     private void collectStudents(Student root, ArrayList<Student> list) {

    if (root != null) {

        collectStudents(root.leftnode, list);

        list.add(root);

        collectStudents(root.rightnode, list);
    }
}
public void bottom5() {
    bottom5(root);
}

int count = 0;

public void bottom5( Student node) {
    if (node == null || count == 5) {
        return;
    }

    bottom5(node.rightnode);

    if (count < 5) {
        System.out.println(node.studentname);
        count++;
    }

    bottom5(node.leftnode);
}

     public void bottom10() {

        ArrayList<Student> list = new ArrayList<>();

        collectStudents(root, list);

        list.sort(Comparator.comparingDouble(s -> s.gpa));

        int limit = Math.min(10, list.size());

        for (int i = 0; i < limit; i++) {

            Student s = list.get(i);

            System.out.println(
                    s.studentid + " " +
                    s.studentname + " " +
                    s.gpa
            );
        }
    }
     public void GPAfunction() {
    System.out.println("Students with GPA < 2.0:");
    GPAfunction(root);
}

private void GPAfunction(Student root) {
    if (root != null) {
        GPAfunction(root.leftnode);
        if (root.gpa < 2.0) {
            root.display();
        }
        GPAfunction(root.rightnode);
    }
}
}
