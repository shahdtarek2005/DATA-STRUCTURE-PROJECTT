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
        BinarySearchh bst = new BinarySearchh();

        bst.insert(105, "shahd", 3.8);
        bst.insert(102, "sleem", 2.2);
        bst.insert(110, "wael", 1.9);
        bst.insert(101, "jomana", 3.5);
        bst.insert(109, "zaki", 1.5);
        bst.insert(104, "lotfy", 2.9);
        bst.insert(108, "adham", 3.2);
        bst.insert(103, "Hana", 1.8);
        bst.insert(107, "Islam", 3.0);
        bst.insert(106, "khaled", 2.5);
        bst.insert(112, "fatma", 1.2);
        bst.insert(111, "mahmoud", 3.9);

       
        bst.display();
        System.out.println("Size: " + bst.size());
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------");
        
        bst.bottom10();
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------");
        bst.bottom5();
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------");
        bst.separateGPAUnder2();
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------");

        
        System.out.println("Removing ID 104: " + bst.remove(104));
        bst.display();
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("New size: " + bst.size());

       
        System.out.println("Search for ID 110: " + bst.search(110));
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Search for ID 999: " + bst.search(999));
    }
}

