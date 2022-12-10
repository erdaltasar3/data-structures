/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gelismissiralama;

/**
 *
 * @author Erdal
 */
public class ShellSort {
    
    void shellSort(int arr[]){
        
        int n = arr.length;
        
        for (int gap = n/2; gap > 0; gap/=2){
            
            for (int i = gap; i < n; i++){
                
                int temp = arr[i];
                int j;
                for (j = i; j >= gap && arr[j-gap] > temp; j-=gap){
                    
                    arr[j] = arr[j-gap];
                }
                arr[j] = temp;
            }
        }
    }
}

