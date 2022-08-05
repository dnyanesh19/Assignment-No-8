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


import java.util.LinkedList;
import java.util.Iterator;

public class Collection7 {
  public static void main(String[] args) {
    
     LinkedList<String> l_list = new LinkedList<String>();
   
          l_list.add("Violet");
          l_list.add("Lavender");
          l_list.add("Black");
          l_list.add("White");
          l_list.add("Yellow");

   Iterator p = l_list.listIterator(1);

   
   while (p.hasNext()) {
   System.out.println(p.next());
   }
   }
}
