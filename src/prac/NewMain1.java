/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prac;


import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class NewMain1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic her
       Scanner in=new Scanner(System.in);
        System.out.println("Enter");
         int n=in.nextInt();
           drawDiamond(n);
           
    }
    
     public static void drawDiamond(int x){
      if(x>0){
        
          for(int i=0;i<=x-3;i++){
          for(int s=0;s<=x-i;s++){
              System.out.print("  ");
          }
              for(int j=1;j<=i*2-1;j++){
                  System.out.print(" *");
                  
                  
              }
              System.out.println(" ");
          }  
        
         for(int i=x/2;i>=1;i--){
          for(int s=0;s<=x-i;s++){
              System.out.print("  ");
          }
              for(int j=0;j<i*2-1;j++){
                  System.out.print(" *");
                  
              }
              System.out.println(" ");
          }
         drawDiamond(x-1);
      }  
             
    }
    
}
