/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author student
 */
public class JavaApplication3 {
    private static Object input;

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList();
        Scanner sc = new Scanner(System.in);
        System.out.println("Please give me an integer:");
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            System.out.println(i);
           
        }
        System.out.println("Give me another number:");
        num += sc.nextInt();
        
        if (num > 0) {
            Double sqrtNum = MathFunctions.SquareRootAndAddThree(num);
            if (sqrtNum <= 1000) {
                numbers.add(sqrtNum);
            } else {
                double sum = 0;
                
                for (Double dbl : numbers) {
                    sum += dbl;
                }
                
                       
                
                
         
                
            }
        }
        
        
}
        
}  

    
