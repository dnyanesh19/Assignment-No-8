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

public class Collection18 {
  public static void main(String[] args) {
    PriorityQueue<String> pq = new PriorityQueue<String>();  
  pq.add("Violet");
  pq.add("Lavender");
  pq.add("Yellow");
  pq.add("White");
  pq.add("Black");
  System.out.println("Elements of the Priority Queue: ");
  
  for (String element : pq) {
    System.out.println(element);
    }
 }
}
