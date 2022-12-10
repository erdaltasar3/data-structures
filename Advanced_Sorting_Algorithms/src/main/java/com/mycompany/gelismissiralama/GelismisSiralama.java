/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.gelismissiralama;

/**
 *
 * @author Erdal
 */
public class GelismisSiralama {

    public static void main(String[] args) {
        
        ShellSort s = new ShellSort();
        MergeSort m = new MergeSort();
        QuickSort q = new QuickSort();
        RadixSort r = new RadixSort();
        CountingSort c = new CountingSort();
        
        
        
        int a[] = {12, 34, 54, 2, 3,43,26,67};
        //***********************************************************************
        /*
        
        System.out.println("before shell sorting : ");
        printArray(a);
        s.shellSort(a);
        System.out.println("after shell sorting : ");
        printArray(a);
        
        */
        //***********************************************************************
        
        /*
        
        System.out.println("before merge sorting : ");
        printArray(a);
        m.sort(a, 0, a.length-1);
        System.out.println("after merge sorting : ");
        printArray(a);
        */
        
        //***********************************************************************
        
        /*
        
        int n = a.length;
        System.out.println("before quick sorting : ");
        printArray(a);
        q.quick(a, 0, n-1);
        System.out.println("after quick sorting : ");
        printArray(a);

        */
        
        //***********************************************************************
        
        /*
        
        
        System.out.println("before radix sorting : ");
        printArray(a);
        r.radixSort(a);
        System.out.println("after radix sorting : ");
        printArray(a);

        */
        
        //***********************************************************************
        
        System.out.println("before count sorting : ");
        printArray(a);
        c.countSort(a);
        System.out.println("after count sorting : ");
        printArray(a);
    }
    
    
    static void printArray(int arr[]){
        
        int n = arr.length;
        
        for (int i = 0; i < n; i++){
            
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
    }
    
    //*******************************************************************************************************************************
    
    static void ShellSort(int arr[]){
        
        int n = arr.length;
        
        for (int gap = n/2; gap > 0; gap/=2){
            
            for (int i = gap; i < n; i+=1){
                
                int temp = arr[i];
                int j;
                for (j = i; j >= gap && arr[j-gap] > temp; j-=gap){
                    
                    arr[j] = arr[j-gap];
                }
                
                arr[j] = temp;
            }
        }
    }
    
    //*****************************************************************************************************************************************
    
    static void mergeSort(int arr[], int l, int m, int r){
        
        int n1 = m-l+1;
        int n2 = r-m;
        
        int L[] = new int[n1];
        int R[] = new int[n2];
        
        for (int i = 0; i < n1; ++i){
            
            L[i] = arr[l+i]; 
        }
        
        for (int j = 0; j < n2; ++j){
            
            R[j] = arr[m + 1 + j];
        }
        
        int i=0, j=0;
        
        int k = l;
        
        while (l < n1 && j < n2){
            
            if (L[i] <= R[j]){
                
                arr[k] = L[i];
                i++;
            }else{
                
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        
        while (l < n1){
            
            arr[k] = L[i];
            i++;
            k++;
        }
        
        while (j < n2){
            
            arr[k] = R[j];
            j++;
            k++;
        }
    }
    
    static void sort(int arr[], int l, int r){
        
        if (l < r){
            
            int m = (l+r) / 2;
            
            sort(arr, l, m);
            sort(arr, m+1, r);
            
            mergeSort(arr, l, m, r);
        }
    }
    
    //*********************************************************************************************************************
}
