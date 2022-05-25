/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package javaapplication1;
import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class JavaApplication1 {
    
       
    /**
     * @param args the c ommand line arguments
     */
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("Write a word:");
        String str = key.next();
        
        char arr[] = new char[str.length()];
        for(int i = str.length()-1;i>= 0; i--){
            arr[i] = str.charAt(i);
        }
        for(int i =arr.length -1;i>= 0 ; i--){
            System.out.print(arr[i]);
           
        }
         System.out.print("\n");
        
    }
    
}
