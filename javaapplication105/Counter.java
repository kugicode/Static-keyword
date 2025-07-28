/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication105;

/**
 *
 * @author anzoh
 */
public class Counter {
    //Static variables belong to the class
    public static int count = 0;
    
    //private variable for encap
    //non-static variable
    private int instanceId;
    
    //Para constructor
    public Counter(){
    count++;
    this.instanceId = count;
    System.out.println("Counter object created: " + instanceId);
    }
    
    //static methods can only access static variables!
    public static void displayTotalCount(){
    System.out.println("Count: " + count);
    }
    
    //This methods can access both static and non-static variable!  
 // --- Non-static (Instance) Method ---
    // This method belongs to an object and can access both static and non-static members.
    public void displayInstanceAndTotal() {
       System.out.println("Instance " + instanceId + " says: Total objects created so far is: " + count);
    }
    
    
    
}
