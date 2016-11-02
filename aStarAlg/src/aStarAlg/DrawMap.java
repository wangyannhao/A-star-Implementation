
package aStarAlg;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;
import java.awt.Graphics;



public class DrawMap extends JPanel{
	/**
	 * 
	 */
	public Map map;
	private static final long serialVersionUID = 1L;
	public DrawMap (Map m)
	{
		super();
		map = m;
		setPreferredSize(new Dimension(160*5,120*5));
		
	}
	public void paint(Graphics g)
	{

		//Map map = new Map();
		//map.Read_map("test.txt");
		//map.generateMap();
		//aStarWeightedSearch search = new aStarWeightedSearch(map, map.Goal,map.Start,1);
		//List<Cell> path = search.findPath();
		
		for (int i = 0;i<160;i++)
    	{
    		for (int j = 0;j<120;j++)
    		{
    			if (map.cell[i][j].type == '1')
    			{
    				g.setColor(Color.white);
    				g.fillRect(5*i, 5*j, 5, 5);
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
		g.setColor(Color.red);
		g.fillRect(map.Start.x*5, 5*map.Start.y, 5,5);
		g.fillRect(map.Goal.x*5, 5*map.Goal.y, 5,5);

	}
}