public abstract class FarmObject {
	private int x;
	private int y;
	
	FarmObject(int x, int y) {
		this.x = x;
		this.y = y;
		Farm.addFarmObject(this.x, this.y, new FarmObject(this.x, this.y));
	}
	
	public void doStuffForAnHour(int hour);
	
	public void remove() {
		Farm.addFarmObject(this.x, this.y, null);
	}
	
	public int getX() {
		return this.x;
	}
	
	public int getY() {
		return this.y;
	}
}
