/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test;

import java.util.Scanner;

public class Test {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        
        System.out.println("Enter number of lines : ");
        Scanner scan = new Scanner (System.in);
        int NumEntered = scan.nextInt();
        
        for (int i=1 ;i<=NumEntered;i++)
        {
            for(int j=0;j<i;j++){
            System.out.print("x");
            }
                    System.out.println();

        }
        for(int i= NumEntered -1 ;i>0;i--){
            
            for(int j=0;j<i;j++){
            System.out.print("x");
            }
                    System.out.println();
        }
       
    }
    
}
