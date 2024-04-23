/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author PREDATOR
 */
public class GenericImplementation {
    
    public static void main() {
    GenericClass<String, boolean> generic = new GenericClass<>("Wow");
    GenericClass<String, boolean> generic2 = new GenericClass<>("Hello World", True);
    
    System.out.println(generic.getDataFirst());
    System.out.println(generic2.getDataFirst());
    System.out.println(generic2.getDataSecond());
    }
}
