public class Farm {
	private int farmNum;
	private int gridSizeX;
	private int gridSizeY;
	private FarmObject[][] farmGrid;
	private FarmObject[] allFarmObjects;
	
	Farm(int num, int sizeX, int sizeY) {
		this.farmNum = num;
		this.gridSizeX = sizeX;
		this.gridSizeY = sizeY;
		this.farmGrid = new FarmObject[this.gridSizeX][this.gridSizeY];
		this.allFarmObjects = new FarmObject[this.gridSizeX * this.gridSizeY];
		World.addFarm(this.farmNum, new Farm(this.gridSizeX, this.gridSizeY));
	}
	
	public void addFarmObject(int x, int y, FarmObject object) {
		this.farmGrid[x][y] = object;
		this.allFarmObjects[(x * gridSizeY) + y] = object;
	}
}
