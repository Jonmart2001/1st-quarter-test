/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

/**
 *
 * @author student
 */
public class MathFunctions {

    public static void SquareRootAndAddThree(int i) {
    List<MathFunctions> result = new ArrayList();
        double rag = Math.sqrt(i);
        boolean done = false;
        double j = rag;
        while (!done) {
            j++;
                  if (j == rag +3)  {
                      done = true;
                  }
        }
        result.add(new result(j)); 
        if (j > 1000) {
            double sum = 0; 
            for (int i = 0; i < result.size(); i++);        
                }
        
          
                  
  
    }
}
