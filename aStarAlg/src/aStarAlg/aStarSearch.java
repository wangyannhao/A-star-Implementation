
package aStarAlg;

public class aStarSearch extends PathFinding {

	public aStarSearch(Map m, Point s, Point g) {
		super(m, s, g);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void insertCost(Cell cellat, double g) {
		// TODO Auto-generated method stub
		cellat.gCost = g;
		Point at = new Point(cellat.getx(),cellat.gety());
		double hCost = gethCost3(at,Goal);
		cellat.hCost = hCost;
		cellat.fCost = g+hCost;
	}

}
