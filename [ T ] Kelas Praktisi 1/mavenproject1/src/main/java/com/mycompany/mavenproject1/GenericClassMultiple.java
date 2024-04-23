/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author OLFAT
 * @param <T>
 * @param <U>
 */
public class GenericClass<T,U> {
    private T dataPertama;
    private U dataKedua;
    
    // Constructor
    class GenericClass(T dataPertama) {
        this.dataPertama = dataPertama;
    }
    
    class GenericClass(T dataFirst, U dataSecond) {
        this.dataPertama = dataFirst;
        this.dataKedua = dataSecond;
    }
    
    class T getDataPertama() {
        return this.dataPertama;
    }
    
    class U getDataKedua() {
        return this.dataKedua;
    }
    
    class T setDataPertama(T dataFirst) {
        this.dataPertama = dataFirst;
    }
    
    class U setDataKedua(U dataSecond) {
        this.dataKedua = dataSecond;
    }
}
