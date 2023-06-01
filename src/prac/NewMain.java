/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prac;

import java.util.Scanner;
import static prac.Prac.sum;

/**
 *
 * @author lenovo
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    //charPattern("a");
    Scanner in=new Scanner(System.in);
        System.out.println("Enter");
        String ins=in.next();
        System.out.println(" "+charPattern(ins) );
        
         System.out.println("Enter");
         int h=in.nextInt();
         System.out.println("-"+bricksToUnload(h));
         
         System.out.println("Enter");
         int n=in.nextInt();
           drawDiamond(n);
           
    }
    
     public static void drawDiamond(int x){
        int n=0;
        
          if(x>0){
        
               if(x==7){
                   System.out.println("      *");
              
         }else  if(x==6){
                   System.out.println("    * * *");
           
         } else  if(x==5){
             
                   System.out.println("  * * * * *");
         } else  if(x==4){
              
                   System.out.println("* * * * * * *");
           
         } else  if(x==3){
                   System.out.println("  * * * * * ");
         } else  if(x==2){
                   System.out.println("    * * *  ");
         } else  if(x==1){
                   System.out.println("      *");
         }

           drawDiamond(x-1);
           }
           
           
         
         
         
         //=============================================
         
             
            
             
             
                
  /**  for(int i=0;i<=x-3;i++){
          for(int s=1;s<=x-i;s++){
              System.out.print(" ");
          }
              for(int j=1;j<=i*2-1;j++){
                  System.out.print("*");
                  
                  
              }
              System.out.println(" ");
          }  
        
         for(int i=x/2;i>=1;i--){
          for(int s=1;s<=x-i;s++){
              System.out.print(" ");
          }
              for(int j=0;j<i*2-1;j++){
                  System.out.print("*");
                  
              }
              System.out.println(" ");
          } */
    
         /**   for(int i=1;i<x-2;i++){
          for(int s=3;s>=i;s--){
              System.out.print(" ");
          }
              for(int j=1;j<=i;j++){
                  System.out.print("* ");
                  
                  
              }
              System.out.println();
          }  
        
         for(int i=1;i<x-4;i++){
          for(int s=1;s<=i;s++){
              System.out.print(" ");
          }
              for(int j=1;j<x-i;j++){
                  System.out.print("* ");
                  
              }
              System.out.println();
          }  */
        
       
      
        
        
        
      
            
           
     }
     public static String charPattern(String n){
        if(n!=null){
            if(n.charAt(0)=='A'||n.charAt(0)=='a'){
                return n.toUpperCase();
                
            }else if(n.charAt(0)=='B'||n.charAt(0)=='b'){
                return charPattern('A'+n.toUpperCase()+'A');
            } else if(n.charAt(0)=='c'||n.charAt(0)=='C'){
                return charPattern("ABA"+n.toUpperCase()+"ABA");
            } else if(n.charAt(0)=='d'||n.charAt(0)=='D'){
                return charPattern("ABACABA"+n.toUpperCase()+"ABACABA");
                
        }else
         return null;
        }
        return n;
         
}
     
     public static int bricksToUnload(int num){
       
    if(num==1||num==2){
        return num;}
    else 
        return num+bricksToUnload(num-2);
           
       
        
    }
}
