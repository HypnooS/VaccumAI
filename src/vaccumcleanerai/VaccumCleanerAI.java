/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vaccumcleanerai;

/**
 *
 * @author zwar
 */
public class VaccumCleanerAI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Environment environment = new Environment(2, 2);
        environment.space[0][0] = new Space(true, false);
        environment.space[0][1] = new Space(true, false);
        environment.space[1][0] = new Space(false, false);
        environment.space[1][1] = new Space(false, true);
        
        VaccumAI vaccum = new VaccumAI(1, 1, environment);
        vaccum.activeAI();
        vaccum.activeAI();
        vaccum.activeAI();
        vaccum.activeAI();
        vaccum.activeAI();
        
    }
    
}
