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
public class GenericClassMultiple {
    public class GenericClass<T,U> {
        private T dataPertama;
        private U dataKedua;
        
        // Constructor
        public GenericClass(T dataPertama) {
            this.dataPertama = dataPertama;
        }
        
        public GenericClass(T dataFirst, U dataSecond) {
            this.dataPertama = dataFirst;
            this.dataKedua = dataSecond;
        }
        
        public T getDataPertama() {
            return this.dataPertama;
        }
        
        public U getDataKedua() {
            return this.dataKedua;
        }
        
        public void setDataPertama(T dataFirst) {
            this.dataPertama = dataFirst;
        }
        
        public void setDataKedua(U dataSecond) {
            this.dataKedua = dataSecond;
        }
    }
}

