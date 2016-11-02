
package aStarAlg;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;



public class DrawPath_uniformCost extends JPanel{
	/**
	 * 
	 */
	public Map map;
	private boolean showprocess;
	public long runningTime;
	public List<Cell> path = new ArrayList<Cell>();
	private static final long serialVersionUID = 1L;
	public DrawPath_uniformCost (Map m,boolean sp)
	{
		super();
		map = m;
		showprocess = sp;
		setPreferredSize(new Dimension(160*5,120*5));
	}
	public void paint(Graphics g)
	{
		long startTime=System.currentTimeMillis(); 
		uniformCostSearch search = new uniformCostSearch(map, map.Start,map.Goal);
		
	
		
		path = search.findPath();
		
		long endTime=System.currentTimeMillis();
		runningTime = endTime-startTime;
		System.out.println("runningTime is "+ runningTime);
		for (int i = 0;i<160;i++)
    	{
    		for (int j = 0;j<120;j++)
    		{
    			if (map.cell[i][j].type == '1')
    			{
    				g.setColor(Color.lightGray);
    				g.drawRect(5*i, 5*j, 5, 5);
    			}
    			else if (map.cell[i][j].type == '2')
    			{
    				g.setColor(Color.gray);
    				g.fillRect(5*i, 5*j, 5,5);
    			}
    			else if (map.cell[i][j].type == 'a')
    			{
    				g.setColor(new Color(72,170,237));
    				g.fillRect(5*i, 5*j, 5,5);
    				
    			}
    			else if (map.cell[i][j].type == 'b')
    			{
    				g.setColor(new Color(53,80,159));
    				g.fillRect(5*i, 5*j, 5,5);
    			}
    			else if (map.cell[i][j].type == '0')
    			{
    				g.setColor(Color.black);
    				g.fillRect(5*i, 5*j, 5,5);
    			}
    		}
    	}
		if (showprocess)
		{
			for (int i =1; i< search.openList.position;i++){
				g.setColor(Color.orange);
				g.fillRect(5*search.openList.bheap[i].getx(), 5*search.openList.bheap[i].gety(), 5,5);
			}
			for (int i = 0; i< search.closedList.size();i++){
				g.setColor(Color.green);
				g.fillRect(5*search.closedList.get(i).getx(), 5*search.closedList.get(i).gety(), 5,5);
			}

			for (int i = 0; i< path.size();i++){
				g.setColor(Color.red);
				g.fillRect(5*path.get(i).coordinateX, 5*path.get(i).coordinateY, 5,5);
			}
		}else{
			for (int i = 0; i< path.size();i++){
				g.setColor(Color.red);
				g.fillRect(5*path.get(i).coordinateX, 5*path.get(i).coordinateY, 5,5);
			}
		}

	}
}
