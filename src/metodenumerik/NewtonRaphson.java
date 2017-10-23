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
public class NewtonRaphson {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float x =100;
        float x_sebelum = 9999;
        float selisih = x_sebelum-x;
        float error =  (float) 0;
        System.out.println("x | selisih");
        System.out.println("--------------");
    
        System.out.println(x +" | "+selisih);
    
        while(Math.abs(selisih)>error){
            
            x_sebelum = x;
            x = x_sebelum - (fungsi(x)/turunanFungsi(x));
            selisih = x_sebelum-x;
            System.out.println(x +" | "+selisih);
        }
            System.out.println("Akar persamaan :"+x);
        System.out.println("Error :"+Math.abs(selisih));
      
    }
    
     public static float fungsi(float x){
        //fungsi ini bisa diganti dengan fungsi apa pun
        float y = (x*x)-(7*x)-7;
        return y;
    }
      public static float turunanFungsi(float x){
        //fungsi ini bisa diganti dengan fungsi apa pun
        float y = (2*x)-7;
        return y;
    }
    
}
