/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg02_java_assignment;

/**
 *
 * @author SHARDUL
 */


import java.util.ArrayList;


public class Collection2 {
  public static void main(String[] args) {
    // Creating an array list
    ArrayList<String> languages = new ArrayList<>();
    languages.add("C");
    languages.add("JavaScript");
    languages.add("C++");
    System.out.println("ArrayList: " + languages);

    // Using for loop
    System.out.println("Iterating over ArrayList using for loop: ");

    for(int i = 0; i < languages.size(); i++) {
      System.out.print(languages.get(i));
      System.out.print(", ");
    }
  }
}
    

