/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vaccumcleanerai;

import java.util.ArrayList;

/**
 *
 * @author zwar
 */
public class VaccumAI {
    public ArrayList<String> memory;
    Environment environment;
    Space space;
    public int column;
    public int line;
    public int columnLimit;
    public int lineLimit;

    public VaccumAI(int lineLimt, int columnLimit, Environment environment){
        this.column = 0;
        this.line = 0;
        this.columnLimit = columnLimit;
        this.lineLimit = lineLimt;
        this.environment = environment;
        this.memory = new ArrayList<>();
    }
    public void activeAI(){
        this.space = environment.space[line][column];
        verify(space);
    }
    
    public void walk(){
        if(column++ > columnLimit){
            column = 0;
            if(line++ > lineLimit){
                line = 0;
            }
            else
            {
                line++;
            }
        }
        if(column++ < columnLimit){
            stepLeft();
        }
        
    }
    public void stepLeft(){
        column++;
    }
    public void stepRight(){
        column--;
    }
    //this fuction will verify if have any rubbish and object in the Space
    public void verify(Space space){
        if(space.isDirt() && !space.isObjectInSpace()){
            clean(space);
        }
        
        if(space.isDirt() && space.isObjectInSpace()){
            System.out.println("Warning! Object in space!");
            clean(space);
        }
        if(!space.isDirt() && !space.isObjectInSpace()){
            System.out.println("Walking...");
            walk();
        }
        if(!space.isDirt() && space.isObjectInSpace()){
            System.out.println("Walking... becarful!");
            walk();
        }
    }
    public void clean(Space space){
        System.out.println("Working on Dirt!");
        space.setDirt(false);
    }
    
}
