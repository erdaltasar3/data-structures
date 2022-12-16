import java.util.Scanner;

public class Min_heap {

    public static void main(String[] args) {
        
        Scanner input= new Scanner(System.in);
        
        String str = input.nextLine(); 
        String[] dizi = str.split("[,]"); 
        int[] sayilar=new int[dizi.length];
        
        for(int i=0;i<sayilar.length;i++){
            sayilar[i]= Integer.parseInt(dizi[i]);
                    
        }
        
        
        int min_heap=1;
       for(int i=0;i<dizi.length;i++){
          int a=(i-1)/3;
           if(sayilar[i]<sayilar[a]){
               min_heap=0;
               
           }
          
           }
    
    if(min_heap==0){
        System.out.println("min heap değil");
    }
    else{
        System.out.println("min heap");
    }
    }
    
    
}