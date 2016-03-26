/*
 * To change this license header, choose License Headers in Project Properties.
 * To change tmplate file, choose Tools | Templates
 * and open the template in the editor.
 */
package vaccumcleanerai;

/**
 *
 * @author zwar
 * @author Caio Serrano
 */
public class VaccumCleanerAI {
    Environment environment; 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Environment environment = new Environment(3, 3);     //<-- cuidado com esse metrica, ela é de 1 a n, e não de 0 a n.  
        VaccumAI vaccum = new VaccumAI(0,1,2,2,environment); //<-- Aqui já é de 0 a n.
        vaccum.activeAI();
    }
    public void printEnvironment(Environment environment, int line, int column){
        System.out.println("<------------------------>");
        for(int repeat=0; repeat != (line*column); repeat++)
        {
            for(int m=0; m < line; m++)
            {
                for(int n=0; n < column; n++)
                {
                    
                }
            }
        }
        
    }
    
        
}
