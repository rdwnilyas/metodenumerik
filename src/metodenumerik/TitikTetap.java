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
public class TitikTetap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        float x = 2;
        float x_sebelum;
        float selisih=9999;
        float error = (float) 0.0000001;
        System.out.println("x | selisih");
        System.out.println("------------------");
        System.out.println(x +" "+selisih);
       
        while(Math.abs(selisih)>error){
           x_sebelum = x;
           x = fungsi(x);
           selisih = x_sebelum - x;
           System.out.println(x +" "+selisih);
             
        }
        System.out.println("Akar persamaan :"+x);
        System.out.println("Error :"+Math.abs(selisih));
        
    }
    
     public static float fungsi(float x){
        //fungsi ini bisa diganti dengan fungsi apa pun
       /*
         f(x) = (x*x)-(7*x)-7
         */
       //  float y = (float) Math.sqrt((7*x)+7);
         float y = (float)(((x*x)-7)/7);
        return y;
    }
    
}
