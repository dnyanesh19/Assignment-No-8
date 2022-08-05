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


public class Collection5 {
     public static void main(String args[]){
         
        LinkedList<String> arrl = new LinkedList<String>();
        arrl.add("First");
        arrl.add("Second");
        arrl.add("Third");
        arrl.add("Random");
        System.out.println(arrl);
        System.out.println("Adding element at last position...");
        arrl.addLast("I am last");
        System.out.println(arrl);
        System.out.println("Adding element at last position...");
        arrl.offerLast("I am last - 1");
        System.out.println(arrl);
        System.out.println("Adding element at last position...");
        arrl.offer("I am last - 2");
        System.out.println(arrl);
    }
}
