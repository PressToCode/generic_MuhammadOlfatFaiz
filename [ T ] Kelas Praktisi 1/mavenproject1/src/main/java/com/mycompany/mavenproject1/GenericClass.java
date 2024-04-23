/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author PREDATOR
 */
public class GenericClass {
    private T dataPertama;
    
    public GenericClass(T dataPertama) {
        this.dataPertama = dataPertama;
    }
    
    public T getDataPertama() {
        return this.dataPertama;
    }
    
    public void setDataPertama(T dataPertama) {
        this.dataPertama = dataPertama;
    }
}
