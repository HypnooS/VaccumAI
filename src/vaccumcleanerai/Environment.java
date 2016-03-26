/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vaccumcleanerai;

import java.util.Random;

/**
 *
 * @author zwar
 */
public class Environment {
    
    /**
     *
     */
    public Space[][] space;

    public Environment(int line, int column) {
        this.space = new Space[line][column];
        Random random = new Random();
        int randomNumber;
        for(int repeat=0; repeat != (line*column); repeat++)
        {
            for(int m=0; m < line; m++)
            {
                for(int n=0; n < column; n++)
                {
                    randomNumber = random.nextInt(3);
                    switch(randomNumber){
                        case 0: space[m][n] = new Space(false, false);
                                break;
                        case 1: space[m][n] = new Space(true, false);
                                break;
                        case 2: space[m][n] = new Space(true, true);
                                break;
                        case 3: space[m][n] = new Space(false, true);
                                break;    
                    }
                }
            }
        }
        
    }
    
    
}
