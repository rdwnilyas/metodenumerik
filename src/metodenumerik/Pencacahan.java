/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodenumerik;

/**
 *
 * @author kuplux_ilyas
 */
public class Pencacahan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        //inisialisasi batas awal dan akhir
        float a= -1;
        float b= 1;
        
        //inisialisasi nilai pencacah
        float pencacah = (float) 0.0000001;
        
        //inisialisasi nilai kembali dan akar persamaan
        float nilaikembali = 99999;
        float akarpersamaan = 99999;
        
        System.out.println("X | Y");
        while(a<=b){
            
            float y;
            y = fungsi(a);
            
            if(nilaikembali>Math.abs(y)){
                nilaikembali = Math.abs(y);
                akarpersamaan = a;
            }
            
           // System.out.println(a+" | "+y);
            
            a += pencacah;
        }
        System.out.println("akar persamaan : "+akarpersamaan);
        System.out.println("nilai kembali (error) : "+nilaikembali);
        
    }
    
    public static float fungsi(float x){
        //fungsi ini bisa diganti dengan fungsi apa pun
        float y = (x*x)-(7*x)-7;
        return y;
    }
    
}
