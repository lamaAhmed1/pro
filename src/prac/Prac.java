
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prac;

//import static jdk.nashorn.tools.ShellFunctions.input;

import java.util.Scanner;


/**
 *
 * @author lenovo
 */
public class Prac {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner input = new Scanner(System.in);
        System.out.println("Enter");
        int x = input.nextInt();
        sum(x);
        //+++++++++++++++++++++++++++++++++++++++++
        
                int[][] st =new int[5][5];
               // int n=st.length-1;
               // System.out.println(" "+"  "+n);
                printX(st,0,st.length-1,7);
                 
    }
    
    public static void sum(int i){
      
        if(i>0){
             
          sum(i-1);
            for(int j=0;j<i-1;j++){
               System.out.print("  "); 
               
            }
             System.out.println("|_");
           
          
        }
        
    }
 public static void printX(int[][] st, int i, int j, int num) {
       if (i < st.length) {
           st[i][i] = num;
           st[i][j] = num;
             for (int k = 0; k < st.length; k++) {
                 System.out.print(st[i][k]);        
}
                  System.out.println("");
                 printX(st, ++i, --j,num);
      }
   }
}

