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
     nodee root;
    int size;

    public void insert(int id, String name, double gpa) {
        root = insertRec(root, id, name, gpa);
    }

    private nodee insertRec(nodee root, int id, String name, double gpa) {
        if (root == null) {
            size++;
            return new nodee(new Student(id, name, gpa));
        }
        if (id < root.data.studentid) {
            root.left = insertRec(root.left, id, name, gpa);
        } else if (id > root.data.studentid) {
            root.right = insertRec(root.right, id, name, gpa);
        } else {
            System.out.println("Duplicate ID not allowed: " + id);
        }
        return root;
    }

    public Student search(int id) {
        return searchRec(root, id);
    }

    private Student searchRec(nodee root, int id) {
        if (root == null || root.data.studentid == id) {
            return root == null ? null : root.data;
        }
        if (id < root.data.studentid) {
            return searchRec(root.left, id);
        } else {
            return searchRec(root.right, id);
        }
    }

    public int size() {
        return sizeRec(root);
    }

    private int sizeRec(nodee root) {
        if (root == null) return 0;
        return 1 + sizeRec(root.left) + sizeRec(root.right);
    }

    public boolean remove(int id) {
        if (search(id) == null) return false;
        root = removeRec(root, id);
        size--;
        return true;
    }

    private nodee removeRec(nodee root, int id) {
        if (root == null) return null;
        if (id < root.data.studentid) {
            root.left = removeRec(root.left, id);
        } else if (id > root.data.studentid) {
            root.right = removeRec(root.right, id);
        } else {
            if (root.left == null) return root.right;
            if (root.right == null) return root.left;
            nodee successor = findMin(root.right);
            root.data = successor.data;
            root.right = removeRec(root.right, successor.data.studentid);
        }
        return root;
    }

    private nodee findMin(nodee root) {
        while (root.left != null) root = root.left;
        return root;
    }

    public void display() {
        inorder(root);
    }

    private void inorder(nodee root) {
        if (root != null) {
            inorder(root.left);
            root.data.display();
            inorder(root.right);
        }
    }

    public void bottom10() {
        if (size == 0) {
            System.out.println("No students in the system.");
            return;
        }
        ArrayList<Student> list = new ArrayList<>();
        collectAll(root, list);
        list.sort((a, b) -> Double.compare(a.gpa, b.gpa));
        System.out.println(" Bottom 10 Students by GPA (Lowest to Highest) ");
        int start = Math.max(0, list.size() - 10);
        for (int i = start; i < list.size(); i++) {
            list.get(i).display();
        }
    }

    public void bottom5() {
        if (size == 0) {
            System.out.println("No students in the system.");
            return;
        }
        ArrayList<Student> list = new ArrayList<>();
        collectAll(root, list);
        list.sort((a, b) -> Integer.compare(b.studentid, a.studentid));
        System.out.println(" Bottom 5 Students by ID (Highest to Lowest)");
        int start = Math.max(0, list.size() - 5);
        for (int i = start; i < list.size(); i++) {
            list.get(i).display();
        }
    }

    private void collectAll(nodee root, ArrayList<Student> list) {
        if (root != null) {
            collectAll(root.left, list);
            list.add(root.data);
            collectAll(root.right, list);
        }
    }

    public void separateGPAUnder2() {
        System.out.println(" Students with GPA < 2.0");
        boolean found = printLowGPA(root);
        if (!found) System.out.println("No students with GPA below 2.0");
    }

    private boolean printLowGPA(nodee root) {
        if (root == null) return false;
        boolean left = printLowGPA(root.left);
        boolean current = false;
        if (root.data.gpa < 2.0) {
            root.data.display();
            current = true;
        }
        boolean right = printLowGPA(root.right);
        return left || current || right;
    }
}
