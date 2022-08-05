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


 import java.util.TreeSet;

public class Collection15 {
  public static void main(String[] args) {
  TreeSet<String> tree_set1 = new TreeSet<String>();
  tree_set1.add("Violet");
  tree_set1.add("Green");
  tree_set1.add("Lavender");
  System.out.println("Tree set1: "+tree_set1);
  TreeSet<String> tree_set2 = new TreeSet<String>();
  tree_set2.add("Yellow");
  tree_set2.add("White");
  tree_set2.add("Black");
  System.out.println("Tree set2: "+tree_set2);
  
   tree_set1.addAll(tree_set2);
   System.out.println("Tree set1: "+tree_set1);
 }
}
