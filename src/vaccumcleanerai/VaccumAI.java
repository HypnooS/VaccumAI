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
    public int cont;

    @Override
    public String toString() {
        return "column=" + column + ", line=" + line;
    }
    
    

    public VaccumAI(int lineStart, int columnStart,int lineLimt, int columnLimit, Environment environment){
        this.column = lineStart;
        this.line = columnStart;
        this.columnLimit = columnLimit;
        this.lineLimit = lineLimt;
        this.environment = environment;
        this.memory = new ArrayList<>();
    }
    public void activeAI(){
        //System.out.println("Coo "+ line + " " + column);
        this.space = environment.space[line][column];
        
        verify(space);
        int n = memory.size(); 
        for (int i=0; i<n; i++) { 
            System.out.printf("Posição %d- %s\n", i, memory.get(i));
        }
    }
    
    public void pular_repetido(int column,int line){   
           
       
        for(int x=0;x<memory.size();x++){
            //System.out.println("X value:" + x);
            //System.out.println(memory.get(x));

            if(memory.get(x).equals("column=" + column + ", line=" + line) ){
                System.out.println("ja passei por aqui");
                memory.remove(memory.size()-1);
                }

            }
        
        }
    
    
    public void walk(){
        memory.add(toString());
        cont++;
        if(cont>((columnLimit+1)*(lineLimit+1)))
        {
            pular_repetido(column,line);
        }
        if(column == columnLimit){
            this.column = 0;
            if(line == lineLimit){
                this.line = 0;
                System.out.println("step To Begin");
            }
            else
            {
                line++;
            }
        }else{
            if(column < columnLimit)
            {
                System.out.println("stepLeft");
                stepLeft();
            }
        
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
            System.out.println("Walking... be carful!");
            walk();
        }
        //if(Environment.space[line][column+1])
        
    }
    public void clean(Space space){
        System.out.println("Working on Dirt!");
        space.setDirt(false);
    }
    
}
