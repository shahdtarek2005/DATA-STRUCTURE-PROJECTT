/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject15;

/**
 *
 * @author shahd
 */
public class Mavenproject15 {

    public static void main(String[] args) {
        BinarySearchh tree = new BinarySearchh();
        
        tree.insert(10, "ali", 3.2);
        tree.insert(5, "sara", 2.8);
        tree.insert(15, "omar", 3.9);
        tree.insert(2, "mona", 2.5);
        tree.insert(7, "khaled", 3.0);

        
        System.out.println("all Students:");
        tree.display();

      
        System.out.println("Search for ID 5:");
        Student found = tree.search(5);

        if (found != null) {
            found.display();
        } else {
            System.out.println("Not found");
        }

        
        System.out.println("tree size: " + tree.size());

        
        System.out.println("lowest GPA students:");
        tree.bottom10();

        
        System.out.println("after removing ID 5:");
        tree.remove(5);
        tree.display();
    }
}
    

