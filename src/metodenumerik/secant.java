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
public class secant {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        float xn2 =2;
        float xn1 =1;
        float x = 9999;
        float selisih = x-xn1;
        float error =  (float) 0;
        System.out.println("x | selisih");
        System.out.println("--------------");
        
        System.out.println(xn2 +" | "+0);
        System.out.println(xn1 +" | "+selisih);
    
        while(Math.abs(selisih)>error){
            
            
            x = xn1 - ((fungsi(xn1)*(xn1-xn2)) / (fungsi(xn1)-fungsi(xn2)));
            
            selisih = x-xn1;
            System.out.println(x +" | "+selisih);
     
            xn2 = xn1;
            xn1 = x;
            
        }
        System.out.println("Akar persamaan :"+x);
        System.out.println("Error :"+Math.abs(selisih));
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
      
    }
    
    public static float fungsi(float x){
        //fungsi ini bisa diganti dengan fungsi apa pun
        float y = (x*x)-(7*x)-7;
        return y;
    }
}
