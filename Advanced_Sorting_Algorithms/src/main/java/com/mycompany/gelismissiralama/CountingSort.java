/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gelismissiralama;

/**
 *
 * @author Erdal
 */
public class CountingSort {
    
    int getMax(int arr[]){
        
        int max = arr[0];
        int n = arr.length;
        
        for (int i = 0; i < n; i++){
            
            if (arr[i] > max){
                
                max = arr[i];
            }
        }
        return max; // diziden maksimum eleman
    }
    
    void countSort(int arr[]){ // sayma sıralaması gerçekleştirme işlevi
        
        int n = arr.length;
        
        int[] output = new int[n+1];
        int max = getMax(arr);
        
        int[] count = new int[max+1];  // [maks+1] boyutunda sayım dizisi oluştur
        
        for (int i = 0; i <= max; ++i){
            
            count[i] = 0; // Count dizisini tamamen sıfırlarla başlat
        }
        
        for (int i = 0; i < n; i++){
            
            count[arr[i]]++; // Her elemanın sayısını sakla
        }
        
        for (int i = 1; i <= max; i++){
            
            count[i] += count[i-1]; //kümülatif frekansı bul
        }
        
        
        /* Bu döngü, orijinal dizinin her elemanının indeksini bulacaktır.
 
        sayı dizisi ve elemanları çıkış dizisine yerleştirin*/
        
        for (int i = n-1; i >= 0; i--){
            
            output[count[arr[i]]-1] = arr[i];
            count[arr[i]]--; // aynı sayılar için sayımı azalt
        }
        
        for(int i = 0; i<n; i++) {  
            arr[i] = output[i]; //sıralanmış öğeleri ana dizide sakla  
        } 
    }
    
}
