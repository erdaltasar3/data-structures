/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gelismissiralama;

/**
 *
 * @author Erdal
 */
public class QuickSort {
    
    
    int partition(int arr[], int start, int end){
        
        int pivot = arr[end];
        int i = start - 1;
        
        for (int j = start; j <= end-1; j++){
            
            // Geçerli öğe pivottan küçükse
            if (arr[j] < pivot){
                
                i++;
                int t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
            }
        }
        
        int t = arr[i+1];
        arr[i+1] = arr[end];
        arr[end] = t;
        return (i+1);
    }
    
    
    /* hızlı sıralamayı uygulamak için işlev */
    void quick(int arr[], int start, int end){
        
        if (start < end){
            
            int p = partition(arr, start, end); //p bölümleme indeksidir
            quick(arr, start, p-1);
            quick(arr, p+1, end);
        }
    }
}
