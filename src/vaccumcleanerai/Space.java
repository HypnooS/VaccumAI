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
public class Space {
    public boolean dirt;
    public boolean objectInSpace;
    
    Space(boolean dirt, boolean objectInSpace){
        this.dirt = dirt;
        this.objectInSpace = objectInSpace;
    }

    /**
     * @return the dirt
     */
    public boolean isDirt() {
        return dirt;
    }

    /**
     * @param dirt the dirt to set
     */
    public void setDirt(boolean dirt) {
        this.dirt = dirt;
    }

    /**
     * @return the objectInSpace
     */
    public boolean isObjectInSpace() {
        return objectInSpace;
    }

    /**
     * @param objectInSpace the objectInSpace to set
     */
    public void setObjectInSpace(boolean objectInSpace) {
        this.objectInSpace = objectInSpace;
    }
}
