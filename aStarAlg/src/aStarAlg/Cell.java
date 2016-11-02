
package aStarAlg;

import java.util.ArrayList;
import java.util.List;

public class Cell {
    public int coordinateX, coordinateY;
    public char type;
    public double fCost;
    public int index;
    public Cell parent;
    public double gCost;
    public double hCost;
    public boolean expanded = false;
    public List<Cell> children = new ArrayList<Cell>();

    public  Cell(int x, int y){
        coordinateX = x;
        coordinateY = y;
        type = '1';
        index = 0;
    }
    public void setcoordinate(int x, int y){
        coordinateX = x;
        coordinateY = y;
    }

    public void setcelltype(char t) {
        type = t;
    }


    
    public int getx() {
    	return coordinateX;
    }
    
    public int gety(){
    	return coordinateY;
    }
    

}
