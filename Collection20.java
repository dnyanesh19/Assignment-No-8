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


import java.util.*;


public class Collection20 {
  public static void main(String[] args) {

   
           PriorityQueue<String> pq1 = new PriorityQueue<String>();  
 
          pq1.add("Violet");
          pq1.add("Lavender");
          pq1.add("Black");
          pq1.add("White");
    System.out.println("Original Priority Queue: "+pq1);
   
   
   String str1;
   str1 = pq1.toString();
   System.out.println("String representation of the Priority Queue: "+str1);    
  }  
}
