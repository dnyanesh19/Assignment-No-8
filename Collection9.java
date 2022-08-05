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
import java.util.Iterator;

public class Collection9 {
  public static void main(String[] args) {
         
     HashSet<String> h_set = new HashSet<String>();

          h_set.add("Violet");
          h_set.add("Lavender");
          h_set.add("Black");
          h_set.add("White");
          h_set.add("Yellow");
          h_set.add("Yellow");

  // set Iterator 
    Iterator<String> p = h_set.iterator();
  // Iterate the hash set
   while (p.hasNext()) {
   System.out.println(p.next());
   }
   }
}
