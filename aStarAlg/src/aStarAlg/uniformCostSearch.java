package aStarAlg;

public class uniformCostSearch extends PathFinding{


	public uniformCostSearch(Map m, Point s, Point g) {
		super(m, s, g);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void insertCost(Cell cellat, double g) {
		// TODO Auto-generated method stub
		cellat.gCost = g;
		cellat.hCost = 0;
		cellat.fCost = g;
	}
}
