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
    
    public static void main(String[] args) {
    GenericClass<String> generic = new GenericClass<>("Hello World");
    
    System.out.println(generic.getDataPertama());
    
    generic.setDataPertama("Hello semua!");
    System.out.println(generic.getDataPertama());
    }
}
