/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gelismissiralama;

/**
 *
 * @author Erdal
 */
public class RadixSort {
    
    int getMax(int arr[]){
        
        int n = arr.length;
        
        int max = arr[0];
        
        for (int i = 1; i < n; i++){
            
            if (arr[i] > max){
                
                max = arr[i];
            }
        }
        
        return max; // diziden maksimum eleman (en büyük)
    }
    
    void countingSort(int arr[], int place){  // saymayı uygulayan işlev
        
        int n = arr.length;
        
        int[] output = new int[n+1];
        int[] count = new int[10];
        
       // Eleman sayısını hesapla
        for (int i = 0; i < n; i++){
            
            count[(arr[i] / place)%10]++;
        }
        
        // Kümülatif frekansı hesapla 
        for (int i = 1; i < 10; i++){
            
            count[i] += count[i-1];
        }
        
        // Öğeleri sıralanmış düzende yerleştirin  
        for (int i = n-1; i >= 0; i--){
            
            output[count[(arr[i] / place) %10] -1] = arr[i];
            count[(arr[i] / place)%10]--;
        }
        
        
        for (int i = 0; i < n; i++){
            
            arr[i] = output[i];
        }
    }
    
    // sayı tabanı sıralamasını uygulayan işlev
    void radixSort(int arr[]){
        
        int n = arr.length;
        
        // diziden maksimum elemanı al
        int max = getMax(arr);
        
        // Basamak değerine göre öğeleri sıralamak için sayma sıralaması uygula
        for (int place = 1; max / place > 0; place*= 10){
            
            countingSort(arr, place);
        }
    }
}
