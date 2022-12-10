/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.huffmancode;

import java.util.HashMap;

/**
 *
 * @author Erdal
 */
public class HuffmanCode {

    public static void main(String[] args) {
        
        Huff("abcd");
        
    }
    
    
    
    public int A_sayisi_Bul(String metin){
        
        int A_sayisi = 0;
        for (int i = 0; i < metin.length(); i++){
            
            if (metin.charAt(i) == 'a'){
                
                A_sayisi++;
            }
        }
        
        return A_sayisi;
    }
    
    public int B_sayisi_Bul(String metin){
        
        int B_sayisi = 0;
        for (int i = 0; i < metin.length(); i++){
            
            if (metin.charAt(i) == 'a'){
                
                B_sayisi++;
            }
        }
        
        return B_sayisi;
    }
        
    public int C_sayisi_Bul(String metin){
        
        int C_sayisi = 0;
        for (int i = 0; i < metin.length(); i++){
            
            if (metin.charAt(i) == 'a'){
                
                C_sayisi++;
            }
        }
        
        return C_sayisi;
    }
            
    public int D_sayisi_Bul(String metin){
        
        int D_sayisi = 0;
        for (int i = 0; i < metin.length(); i++){
            
            if (metin.charAt(i) == 'a'){
                
                D_sayisi++;
            }
        } 
        
        return D_sayisi;
    }
    
    public static void Huff(String metin){
        
        HuffmanCode h = new HuffmanCode();
        
        
        
        HashMap<String,String> value = new HashMap<String,String>();
        
        String[] harfler = new String[4];
        int[] sayilar = new int[4];
        
        harfler[0] = "a";
        sayilar[0] = h.A_sayisi_Bul(metin);
        harfler[1] = "b";
        sayilar[1] = h.B_sayisi_Bul(metin);
        harfler[2] = "c";
        sayilar[2] = h.C_sayisi_Bul(metin);
        harfler[3] = "d";
        sayilar[3] = h.D_sayisi_Bul(metin);
        
        
        
        int uzunluk = sayilar.length;
          for(int i=0;i<uzunluk;i++){
            for(int j=0;j<uzunluk-1;j++){
                if(sayilar[j]<sayilar[j+1]){
                    int degis=sayilar[j];
                    sayilar[j]=sayilar[j+1];
                    sayilar[j+1]=degis;
                    String degisken=harfler[j];
                    harfler[j]=harfler[j+1];
                    harfler[j+1]=degisken;
                }
                
            }
        }
          
        value.put(harfler[0], "00");
        value.put(harfler[1], "01");
        value.put(harfler[2], "10");
        value.put(harfler[3], "11");
        
        for(int i=0;i<metin.length();i++){
          System.out.print(metin.subSequence(i, i+1)+"  ");
          
        }
        
        System.out.println("");
        for(int i=0;i<metin.length();i++){
          System.out.print(value.get(metin.subSequence(i,i+1))+" ");  
        }  
    }
}


// ERDAL TAŞAR - 02210201079