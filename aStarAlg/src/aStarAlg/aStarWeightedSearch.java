
package aStarAlg;

public class aStarWeightedSearch extends PathFinding{

	public aStarWeightedSearch(Map m, Point s, Point g, double w) {
		super(m, s, g, w);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void insertCost(Cell cellat, double g) {
		// TODO Auto-generated method stub
		cellat.gCost = g;
		Point at = new Point(cellat.getx(),cellat.gety());
		double hCost = gethCost3(at,Goal);
		cellat.hCost = hCost;
		cellat.fCost = g+weight*hCost;
	}
}
