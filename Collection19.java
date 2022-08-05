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


   import java.util.PriorityQueue;

public class Collection19 {
  public static void main(String[] args) {
   
      PriorityQueue<Integer> pq1 = new PriorityQueue<Integer>();  
      PriorityQueue<Integer> pq2 = new PriorityQueue<Integer>();     
  
   pq1.add(11);
   pq1.add(22);
   pq1.add(33);
   pq1.add(44);
   pq1.add(55);
   pq1.add(66);
   pq1.add(77);
   pq1.add(88);
   pq1.add(99);
   System.out.println("Original Priority Queue: "+pq1);
   System.out.println("Removes the first element: "+pq1.poll());
   System.out.println("Priority Queue after removing first element: "+pq1);
   }    
}
 