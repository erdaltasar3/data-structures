/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gelismissiralama;

/**
 *
 * @author Erdal
 */
public class MergeSort {
    
    void merge(int arr[], int l, int m, int r){
        
        // Birleştirilecek iki alt dizinin boyutunu bul
        int n1 = m-l+1;
        int n2 = r-m;
        
        // Geçici diziler oluştur
        int L[] = new int[n1];
        int R[] = new int[n2];
        
        // Verileri geçici dizilere kopyala
        for (int i = 0; i < n1; ++i){
            
            L[i] = arr[l+i];
        }
        
        for (int j = 0; j < n2; ++j){
            
            R[j] = arr[m+1+j];
        }
        
        /* Geçici dizileri birleştirme aşaması */
        
        
        // Birinci ve ikinci alt dizilerin başlangıç dizinleri
        int i=0, j=0;
        
        // Birleştirilmiş alt dizi dizisinin ilk dizini
        int k = l;
        while (i < n1 && j < n2){
            
            if (L[i] <= R[j]){
                
                arr[k] = L[i];
                i++;
            }else{
                
                arr[k] = R[j];
                j++;
            }
            
            k++;
        }
        
       // L dizisinde kalan varsa  kalan verileri ekle
       while (i < n1){
           
           arr[k] = L[i];
           i++;
           k++;
       }
       
       // R dizisinde kalan varsa kalan verileri ekle
       while (j < n2){
           
           arr[k] = R[j];
           j++;
           k++;
       }
    }
    
    void sort (int arr[], int l, int r){
        
        if (l < r){
            
            // orta noktayı bul
            int m = (l+r) / 2;
            
            // Birinci ve ikinci yarıyı sırala
            sort(arr, l, m);
            sort(arr, m+1, r);
            
            // Sıralanan yarımları birleştir
            merge(arr, l, m, r);
        }
    }
}
