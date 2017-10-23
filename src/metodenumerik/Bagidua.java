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
public class Bagidua {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //menentukan selang 
        float a = -10;
        float b = 0;
        float c = (a+b)/2;
        
        float fa = 9999;
        float fb = 9999;
        float fc = 9999;
        
        float error = 0;
        System.out.println("a | b | c | fa | fb | fc");
        
        
        while(Math.abs(fc)>error){
            
            c = (a+b)/2;
          
            fa = fungsi(a);
            fb = fungsi(b);
            fc = fungsi(c);
           
            System.out.println(a+" | "+b+" | "+c+" | "+fa+" | "+fb+" | "+fc);
            
            if((fa*fc)<0){
                b = c;
            }else{
                a = c;
            }
            
            
        }
        System.out.println(" Akar persamaan yang didapat: "+c);
        System.out.println(" Nilai kembali optimal: "+fc);
        System.out.println(" Nilai error: "+Math.abs(fc));
    }
    
    public static float fungsi(float x){
        //fungsi ini bisa diganti dengan fungsi apa pun
        float y = (x*x)+(8*x)+12;
        return y;
    }
}
